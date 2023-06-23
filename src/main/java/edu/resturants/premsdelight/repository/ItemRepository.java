package edu.resturants.premsdelight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.resturants.premsdelight.entity.Items;

public interface ItemRepository extends JpaRepository<Items, Long> {

}
