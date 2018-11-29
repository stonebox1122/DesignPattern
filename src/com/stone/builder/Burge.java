package com.stone.builder;
public abstract class Burge implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price() ;
}