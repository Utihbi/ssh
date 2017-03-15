package com.loogeoustc.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.loogeoustc.ssh.domain.Product;

public class ProductDao extends HibernateDaoSupport{
	public void save(Product product) {
		System.out.println("dao is exeing;");
		this.getHibernateTemplate().save(product);
	}
}
