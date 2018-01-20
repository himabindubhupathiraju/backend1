package com.DAOImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DAO.CategoryDAO;
import com.model.Category;


@Repository
public class CategoryDAOImpl implements CategoryDAO
{public CategoryDAOImpl(){}
	@Autowired
	SessionFactory sessionFactory;
	
	

	public void insertCategory(Category category)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(category);
		session.getTransaction().commit();
		
	}
	public List<Category> retrieve()
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Category>li=session.createQuery("from Category").list();
		session.getTransaction().commit();
		return li;
	}
	public Category findByCatId(int cid)
	{
		Session session=sessionFactory.openSession();
		Category c=null;
		try
		{
			session.beginTransaction();
			c= session.get(Category.class, cid);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		return c;
	}
	public void deleteCat(int cid) {
		// TODO Auto-generated method stub
		
	}

}
