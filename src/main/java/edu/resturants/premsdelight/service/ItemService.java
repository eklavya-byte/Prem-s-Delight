package edu.resturants.premsdelight.service;

import java.util.ArrayList;
import java.util.List;

import edu.resturants.premsdelight.entity.Role;
import edu.resturants.premsdelight.exceptions.UserIsNotValidToAddItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import edu.resturants.premsdelight.config.ResponseStructure;
import edu.resturants.premsdelight.dao.ItemDao;
import edu.resturants.premsdelight.dao.UserDao;
import edu.resturants.premsdelight.entity.Items;
import edu.resturants.premsdelight.entity.User;

@Service
public class ItemService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private ItemDao itemDao;

	public ResponseEntity<ResponseStructure<List<Items>>> saveItems(List<Items> items, long userId) {
		User user = userDao.findUserById(userId);
		if (user.getRole().equals(Role.ADMIN) || user.getRole().equals(Role.MANAGER)) {
			List<Items> listOfItems = new ArrayList<>();
			for (Items item : items) {
				listOfItems.add(itemDao.saveItem(item));
			}
			ResponseStructure<List<Items>> responseStructure = new ResponseStructure<>();
			responseStructure.setData(listOfItems);
			responseStructure.setMessage("Saved!!");
			responseStructure.setStatus(HttpStatus.CREATED.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
		}

		throw new UserIsNotValidToAddItem("User Is Not Have Access to Add the Item");
	}

}

