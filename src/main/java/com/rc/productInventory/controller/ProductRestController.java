package com.rc.productInventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductRestController {

	@RequestMapping("/product")
	public String home() {
		return "My very own project";
	}

}
