package com.priyanka.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyanka.app.ws.service.ProductService;
import com.priyanka.app.ws.shared.dto.ProductDto;
import com.priyanka.app.ws.ui.model.request.ProductDetailsRequestModel;
import com.priyanka.app.ws.ui.model.response.ProductRest;

@RestController
@RequestMapping("products") // http://localhost:8080/users/
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping
	public ProductRest addProduct(@RequestBody ProductDetailsRequestModel productDetails) {
		ProductRest returnValue = new ProductRest();
		
		ProductDto productDto = new ProductDto();
		BeanUtils.copyProperties(productDetails, productDto);
		
		ProductDto addProduct = productService.addProduct(productDto);
		BeanUtils.copyProperties(addProduct, returnValue);

		return returnValue;
	}
}
