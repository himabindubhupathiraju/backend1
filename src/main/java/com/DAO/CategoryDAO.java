package com.DAO;

import java.util.List;

import com.model.Category;

public interface CategoryDAO 

{

	public void insertCategory(Category category);
	public List<Category> retrieve();
	public Category findByCatId(int cid);
	public void deletecat(int cid);


	



}