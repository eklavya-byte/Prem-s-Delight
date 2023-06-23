package edu.resturants.premsdelight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.resturants.premsdelight.entity.FoodProduct;

public interface FoodProductRepository extends JpaRepository<FoodProduct, Long> {

}
