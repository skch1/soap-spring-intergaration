package com.sk.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sk.domain.Product;
import com.sk.service.ProductService;

@WebService
public class ProductServiceWs {

	private ProductService productService;

	@WebMethod(exclude = true)
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@WebMethod(exclude = false)
	public boolean registerProduct(Product product) {
		boolean flage = productService.registration(product);
		return flage;
	}
}
