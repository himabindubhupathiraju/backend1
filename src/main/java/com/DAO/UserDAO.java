package com.DAO;



import com.model.User;



public interface UserDAO 

{

public boolean insertUser(User user);



public User getUserId(String email);

	

}