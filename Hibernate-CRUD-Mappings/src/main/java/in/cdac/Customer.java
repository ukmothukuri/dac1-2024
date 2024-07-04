package in.cdac;

import java.util.List;

public class Customer {
	private String email;
	private String name;
	private String address;
	private String mobile;
	private CustomerLogin customerLogin;
	private List<Address> shippingAddress;
	
	
	public List<Address> getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(List<Address> shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public CustomerLogin getCustomerLogin() {
		return customerLogin;
	}
	public void setCustomerLogin(CustomerLogin customerLogin) {
		this.customerLogin = customerLogin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}	
}
