package com.capgemini.product.service;

import com.capgemini.product.entity.Product;

public interface ProductService {
	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public Product findProductById(int productId);

	public void deleteProduct(int productId);
}
