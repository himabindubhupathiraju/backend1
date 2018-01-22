package com.DAO;

import java.util.List;

import com.model.Supplier;

public interface SupplierDAO 

{

	public void insertSupplier(Supplier supplier);
	public List<Supplier> retrieve();
	public Supplier findBySuppId(int sid);
	public void deletesupp(int sid);


}