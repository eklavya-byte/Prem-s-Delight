package edu.resturants.premsdelight.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.resturants.premsdelight.entity.Items;
import edu.resturants.premsdelight.exceptions.ItemWithIdNotFound;
import edu.resturants.premsdelight.repository.ItemRepository;


@Repository
public class ItemDao {
	@Autowired
	private ItemRepository itemRespostory;

	public Items saveItem(Items item) {
		return itemRespostory.save(item);
	}

	public Items findItemById(long itemId) {
		Optional<Items> optionalItem = itemRespostory.findById(itemId);
		if (optionalItem.isPresent()) {
			return optionalItem.get();
		}
		throw new ItemWithIdNotFound("Item with the given Id Not Found");
	}

	public List<Items> findAllItem() {
		return itemRespostory.findAll();
	}

	public void removeItemById(long itemId) {
		itemRespostory.delete(findItemById(itemId));
	}

}
