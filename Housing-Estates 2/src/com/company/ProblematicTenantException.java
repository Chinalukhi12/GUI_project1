package com.company;

public class ProblematicTenantException extends Throwable {
	public ProblematicTenantException(){
		super("Already three tenant letters issued on the name");
	}
}
