package com.assignment;

public abstract class Player {

	protected	String name = null;

	public Player(String name) {
		this.name = name;
	}

	public Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String choice();
	
	public abstract void numberVal();
	
}