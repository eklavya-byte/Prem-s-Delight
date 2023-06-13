package edu.resturants.premsdelight.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class FoodMenu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id ;
	
	@OneToMany
	private List<FoodProduct> foodproduct;
	
}
