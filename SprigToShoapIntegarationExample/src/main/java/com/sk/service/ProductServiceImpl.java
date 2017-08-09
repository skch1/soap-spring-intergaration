package com.sk.service;

import com.sk.dao.ProductDAO;
import com.sk.domain.Product;

public class ProductServiceImpl implements ProductService {
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	private ProductDAO productDAO;

	@Override
	public boolean registration(Product product) {
		boolean flage=false;
		int count=0;
		count=productDAO.resiterProduct(product);
		if(count>0) {
			flage=true;
		}
		return flage;
	}

}
