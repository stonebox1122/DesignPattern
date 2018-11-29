package com.stone.prototype;
public abstract class Shape implements Cloneable {
	private String id;
	protected String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void draw();
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}