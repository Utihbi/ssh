package com.loogeoustc.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.loogeoustc.ssh.dao.ProductDao;
import com.loogeoustc.ssh.domain.Product;

@Transactional
public class ProductService {
	//业务层要注入DAO的类
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void save(Product product){
		System.out.println("service is executing !");
		productDao.save(product);
	}
	
}
