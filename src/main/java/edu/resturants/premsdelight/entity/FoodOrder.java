package edu.resturants.premsdelight.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "food_order")
public class FoodOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id ;
	private Status foodStatus;
	@CreationTimestamp
	private LocalDateTime orderCreatedTime;
	private LocalDateTime orderDeliveryTime;
	private double totalPrice;
	
	@OneToMany
	private List<FoodOrder> products;
	
}