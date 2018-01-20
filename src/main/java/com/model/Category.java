package com.model;

	import java.io.Serializable;
	import java.util.HashSet;
	import java.util.Set;

	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;

	import org.springframework.stereotype.Component;
	@Component
	@Entity
	@Table(name="CategoryTable")
	public class Category implements Serializable
	{
		@Id
		private int cid;
		private String cname;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getcName() {
			return cname;
		}
		public void setcName(String cName) {
			this.cname = cName;
		}
		/*@OneToMany(targetEntity=Product.class,fetch=FetchType.EAGER, mappedBy="category")
		private Set<Product> product=new HashSet<Product>(0);*/
		

	}
	
