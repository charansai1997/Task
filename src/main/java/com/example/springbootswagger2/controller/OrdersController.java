package com.example.springbootswagger2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.OrderData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@Api(value = "Order Details", description = "REST APIs related to User Entity!!!!")
@RestController
public class OrdersController {
	
	@ApiOperation(value = "Get list of Orders in the System ", response = Iterable.class, tags = "getorderdetails")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("getorderdetails")
	public OrderData getorderdetails(@RequestParam("orderid") String orderid) {
		
		OrderData orderData=new OrderData();
		orderData.setOrderId(1);
		orderData.setOrdernum("12345");
		
		return orderData;
		
	}
	@ApiOperation(value = "Save Order in the System ", response = Iterable.class, tags = "saveorderDetails")
	@PostMapping("saveorderDetails")
	public OrderData saveorderDetails(@RequestBody OrderData orderData) {
						
		return orderData;
		
	}
	
	@ApiOperation(value = "Update Order details in the System ", response = Iterable.class, tags = "updateorderDetails")
	@PutMapping("updateorderDetails")
	public OrderData updateorderDetails(@RequestBody OrderData orderData) {
						
		return orderData;
		
	}
	@ApiOperation(value = "Delete order details in the System ", response = Iterable.class, tags = "deleteorderDetails")
	@DeleteMapping("deleteorderDetails")
	public String deleteorderDetails(@RequestParam("orderid") String orderid) {
	
		
		return "Order Deleted successfuly";
		
	}

}
