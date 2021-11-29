package com.example.springbootswagger2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.UserData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@Api(value = "User Details", description = "REST APIs related to User Entity!!!!")
@RestController
public class UserController {
	
	@ApiOperation(value = "Get list of Users in the System ", response = Iterable.class, tags = "getuserdetails")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("getuserdetails")
	public UserData getuserDetails(@RequestParam("userid") String userid) {
		
		UserData userdata=new UserData();
		userdata.setUserid(1);
		userdata.setUsername("sysuser");
		
		
		return userdata;
		
	}
	@ApiOperation(value = "Save Users in the System ", response = Iterable.class, tags = "saveuserDetails")
	@PostMapping("saveuserDetails")
	public UserData saveuserDetails(@RequestBody UserData userdata) {
						
		return userdata;
		
	}
	
	@ApiOperation(value = "Update Users in the System ", response = Iterable.class, tags = "updateuserDetails")
	@PutMapping("updateuserDetails")
	public UserData updateuserDetails(@RequestBody UserData userdata) {
						
		return userdata;
		
	}
	@ApiOperation(value = "Delete Users in the System ", response = Iterable.class, tags = "deleteuserDetails")
	@DeleteMapping("deleteuserDetails")
	public String deleteuserDetails(@RequestParam("userid") String userid) {
	
		
		return "User Deleted successfuly";
		
	}

}
