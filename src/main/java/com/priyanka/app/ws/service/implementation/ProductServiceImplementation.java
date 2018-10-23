package com.priyanka.app.ws.service.implementation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanka.app.ws.ProductRepository;
import com.priyanka.app.ws.io.entity.ProductEntity;
import com.priyanka.app.ws.service.ProductService;
import com.priyanka.app.ws.shared.dto.ProductDto;

@Service
public class ProductServiceImplementation implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public ProductDto addProduct(ProductDto product) {

		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(product, productEntity);

		ProductEntity storedProductDetails = productRepository.save(productEntity);

		ProductDto returnValue = new ProductDto();
		BeanUtils.copyProperties(storedProductDetails, returnValue);

		return returnValue;
	}

}
