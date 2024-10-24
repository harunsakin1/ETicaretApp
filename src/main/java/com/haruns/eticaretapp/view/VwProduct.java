package com.haruns.eticaretapp.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class VwProduct {
	Long id;
	Long categoryId;
	String name;
	String description;
	String brand;
	Double totalRating;
	
}