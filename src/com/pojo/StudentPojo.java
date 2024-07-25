package com.pojo;

public class StudentPojo {
	private int rollnum;
	private String sname;
	private String address;
	private String std;

	public StudentPojo() {
	}

	public StudentPojo(String sname, String address, String std) {
		super();
		this.sname = sname;
		this.address = address;
		this.std = std;
	}

	public StudentPojo(int rollnum, String sname, String address, String std) {

		this.rollnum = rollnum;
		this.sname = sname;
		this.address = address;
		this.std = std;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "StudentPojo [rollnum=" + rollnum + ", sname=" + sname + ", address=" + address + ", std=" + std + "]";
	}
}
