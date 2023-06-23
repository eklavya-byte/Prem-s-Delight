package edu.resturants.premsdelight.dao;



import java.util.Optional;

import org.springframework.stereotype.Repository;

import edu.resturants.premsdelight.entity.FoodProduct;
import edu.resturants.premsdelight.exceptions.FoodProductWithTheGivenIdNotFound;
import edu.resturants.premsdelight.repository.FoodProductRepository;


@Repository
public class FoodProductDao {
	private FoodProductRepository foodProductRepostory;

	public FoodProduct saveFoodProduct(FoodProduct foodProduct) {
		return foodProductRepostory.save(foodProduct);
	}

	public FoodProduct findFoodProductById(long foodProductId) {
		Optional<FoodProduct> optionalFoodProduct = foodProductRepostory.findById(foodProductId);
		if (optionalFoodProduct.isPresent()) {
			return optionalFoodProduct.get();
		}

		throw new FoodProductWithTheGivenIdNotFound("FoodProduct With the Given Id Not Found");
	}

	public void findAllFoodProduct() {

	}

	public void removeFoodProductById(long foodProductId) {

	}
}
