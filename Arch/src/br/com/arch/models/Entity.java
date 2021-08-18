package br.com.arch.models;

import java.util.ArrayList;

public class Entity {
	
	private String name;
	private String title;
	private ArrayList<Field> attributes;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<Field> getAttributes() {
		return attributes;
	}
	public void setAttributes(ArrayList<Field> attributes) {
		this.attributes = attributes;
	}

}
