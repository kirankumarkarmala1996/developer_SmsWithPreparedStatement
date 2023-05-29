package com.Innovative.model;

//alt+shift+S+T
/**
 * @author kiran
 *
 */
public class InnovativeStudent {

	private int Id;
	private String name;	
	private String Address;
	private long PhNumber;
	private double fee;
	private String email;

	// alt+shift+S+c
	public InnovativeStudent() {
	}

	// alt+shift+S+o
	public InnovativeStudent(int id, String name, String address, long phNumber, double fee, String email) {
		super();
		Id = id;
		this.name = name;
		Address = address;
		PhNumber = phNumber;
		this.fee = fee;
		this.email = email;
	}

	// alt+shift+S+r
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getPhNumber() {
		return PhNumber;
	}

	public void setPhNumber(long phNumber) {
		PhNumber = phNumber;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// alt+shift+h
//	it will generate the hash code

//	alt+shift+s+s
	@Override
	public String toString() {
		return "InnvativeStudent [Id=" + Id + ", name=" + name + ", Address=" + Address + ", PhNumber=" + PhNumber
				+ ", fee=" + fee + ",email=" + email + "]";
	}

}
