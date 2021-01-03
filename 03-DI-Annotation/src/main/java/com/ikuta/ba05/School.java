package com.ikuta.ba05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "mySchool-copy")
public class School {
	@Value(value = "清华大学")
	private String name;

	@Value(value = "中国北京")
	private String address;

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

	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + "]";
	}

}
