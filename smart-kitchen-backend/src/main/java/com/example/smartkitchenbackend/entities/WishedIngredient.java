package com.example.smartkitchenbackend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class WishedIngredient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private double weightOrCount;

	@ManyToOne
	private Ingredient ingredient;

	@ManyToOne
	private WishList wishList;
}
