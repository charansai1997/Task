package com.example.springbootswagger2.model;

public class OrderProducts {
	
private Integer orderItemId;
private Integer orderId;
private String productprice;
private String productquantity;
public Integer getOrderItemId() {
	return orderItemId;
}
public void setOrderItemId(Integer orderItemId) {
	this.orderItemId = orderItemId;
}
public Integer getOrderId() {
	return orderId;
}
public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}
public String getProductprice() {
	return productprice;
}
public void setProductprice(String productprice) {
	this.productprice = productprice;
}
public String getProductquantity() {
	return productquantity;
}
public void setProductquantity(String productquantity) {
	this.productquantity = productquantity;
}


}
