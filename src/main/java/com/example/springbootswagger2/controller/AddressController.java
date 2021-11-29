package com.example.springbootswagger2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.AddressData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Address Details", description = "REST APIs related to Address Entity!!!!")
@RestController
public class AddressController {
	
	@ApiOperation(value = "Get list of Address in the System ", response = Iterable.class, tags = "getAddressdetails")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("getAddressdetails")
	public AddressData getAddressDetails(@RequestParam("addressid") String addressid) {
		
		AddressData addressdata=new AddressData();
		addressdata.setAddressId(1);
		addressdata.setAddress1("HYD");
		
		
		return addressdata;
		
	}
	@ApiOperation(value = "Save Address in the System ", response = Iterable.class, tags = "saveAddressDetails")
	@PostMapping("saveAddressDetails")
	public AddressData saveAddressDetails(@RequestBody AddressData addressdata) {
						
		return addressdata;
		
	}
	
	@ApiOperation(value = "Update Address in the System ", response = Iterable.class, tags = "updateAddressDetails")
	@PutMapping("updateAddressDetails")
	public AddressData updateAddressDetails(@RequestBody AddressData addressdata) {
						
		return addressdata;
		
	}
	@ApiOperation(value = "Delete Address in the System ", response = Iterable.class, tags = "deleteAddressDetails")
	@DeleteMapping("deleteAddressDetails")
	public String deleteAddressDetails(@RequestParam("addressid") String addressid) {
	
		
		return "Address Deleted successfuly";
		
	}
}