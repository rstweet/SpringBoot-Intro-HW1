package com.rc.productInventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rc.productInventory.model.Product;
import com.rc.productInventory.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	@GetMapping(value = "/")
	public String index(Product product) {
		// Where we want to go when our application is started
		return "product/index";
	}

	@PostMapping(value = "/")
	public String addNewProductList(Product product, Model model) {
		productRepository.save(new Product(product.getProductName(), product.getMfrName(), product.getProductType(),
				product.getSku()));
		model.addAttribute("productName", product.getProductName());
		model.addAttribute("mfrName", product.getMfrName());
		model.addAttribute("productType", product.getProductType());
		model.addAttribute("sku", product.getSku());
		return "product/result";

	}
	
}
