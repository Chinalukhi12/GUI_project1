package com.company;

public class TooManyThingsException extends Throwable {
	public TooManyThingsException(){
		super("Remove some old items to insert a new item");
	}
}
