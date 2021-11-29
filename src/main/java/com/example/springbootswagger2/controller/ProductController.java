package com.example.springbootswagger2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.ProductData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@Api(value = "Product Details", description = "REST APIs related to Product Entity!!!!")
@RestController
public class ProductController {
	
	@ApiOperation(value = "Get list of Product in the System ", response = Iterable.class, tags = "getProductdetails")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("getProductdetails")
	public ProductData getProductDetails(@RequestParam("productid") String productid) {
		
		ProductData productdata=new ProductData();
		productdata.setProductId(1);
		productdata.setProductName("ABCD");
		
		
		return productdata;
		
	}
	@ApiOperation(value = "Save Products in the System ", response = Iterable.class, tags = "saveProductDetails")
	@PostMapping("saveProductDetails")
	public ProductData saveProductDetails(@RequestBody ProductData productdata) {
						
		return productdata;
		
	}
	
	@ApiOperation(value = "Update Products in the System ", response = Iterable.class, tags = "updateProductDetails")
	@PutMapping("updateProductDetails")
	public ProductData updateProductDetails(@RequestBody ProductData productdata) {
						
		return productdata;
		
	}
	@ApiOperation(value = "Delete Products in the System ", response = Iterable.class, tags = "deleteProductDetails")
	@DeleteMapping("deleteProductDetails")
	public String deleteProductDetails(@RequestParam("productid") String productid) {
	
		
		return "Product Deleted successfuly";
		
	}

}
