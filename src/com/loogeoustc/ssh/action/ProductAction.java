package com.loogeoustc.ssh.action;

import com.loogeoustc.ssh.domain.Product;
import com.loogeoustc.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	//模型驱动使用的类；
	private Product product = new Product();
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	private static final long serialVersionUID = 1L;
	
	//Struts整合Spring过程中按名称自动注入的类 
	private ProductService productService;
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public String save() {
		
//		String name = this.product.getPname();
//		Double price = this.product.getPrice();
//		System.out.println("name:"+ name+" price:"+ price);
//		//System.out.println("action is executing!");
		productService.save(product);
		return NONE;
	}
}
