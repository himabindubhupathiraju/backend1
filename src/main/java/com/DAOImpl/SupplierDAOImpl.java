package com.DAOImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DAO.SupplierDAO;
import com.model.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO
{public SupplierDAOImpl(){}
	@Autowired
	SessionFactory sessionFactory;
	
	
	
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	
	public void insertSupplier(Supplier supplier)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(supplier);
	
		session.getTransaction().commit();
		
	}
	public List<Supplier> retrieve()
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Supplier> li= session.createQuery("from Supplier").list();
		session.getTransaction().commit();
		return li;
	}
	public Supplier findBySuppId(int sid)
	{
		Session session=sessionFactory.openSession();
		Supplier s=null;
		try
		{
			session.beginTransaction();
			s= session.get(Supplier.class, sid);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		return s;
	}


	public void deleteSupp(int sid) {
		// TODO Auto-generated method stub
		
	}
}



	
