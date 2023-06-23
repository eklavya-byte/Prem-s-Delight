package edu.resturants.premsdelight.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.resturants.premsdelight.config.ResponseStructure;
import edu.resturants.premsdelight.entity.Items;
import edu.resturants.premsdelight.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<List<Items>>> saveItems(@RequestBody List<Items> items,
			@RequestParam long userId) {
		return itemService.saveItems(items, userId);
	}
}
