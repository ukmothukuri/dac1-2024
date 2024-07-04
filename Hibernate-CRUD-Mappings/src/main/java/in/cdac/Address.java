package in.cdac;

public class Address {
	private int addressID;
	private String street;
	private String locality;
	private String city;
	private String state;
	private int pincode;
	
	
	public int getAddressID() {
		return addressID;
	}
	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", street=" + street + ", locality=" + locality + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
