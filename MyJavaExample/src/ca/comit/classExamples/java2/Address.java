package ca.comit.classExamples.java2;

public class Address {
	private String addressLine;
	private String city;
	private String province;
	private String postalCode;

	public Address(String addressLine, String city, String province, String postalCode) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
