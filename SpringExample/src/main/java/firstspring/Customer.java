package firstspring;

public class Customer {
	private String name;
	private String email;
	private Address address;	
	
	public Customer(Address ads) {
		address = ads;
	}
	
	public Address getAddress() {
		return address;
	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
