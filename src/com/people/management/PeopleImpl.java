package com.people.management;

public class PeopleImpl implements People {
	private String name=null;

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return 20;
	}

}
