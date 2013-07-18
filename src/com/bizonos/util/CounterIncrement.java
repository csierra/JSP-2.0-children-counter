package com.bizonos.util;

import java.io.IOException;

import javax.servlet.jsp.JspException;

public class CounterIncrement extends CounterTagSupport {
	
	private String namespace;
	private String counterVarName;
	
	
	public String getNamespace() {
		return namespace;
	}


	public void setNamespace(String namespace) {
		this.namespace = namespace;
		this.counterVarName = namespace + "counter";
	}
	

	@Override
	public void doTag() throws JspException, IOException {
		Integer counter = (Integer)getRequestAttribute(counterVarName);
		if (counter == null) {
			throw new Error("No parent counter found");
		}
		setRequestAttribute(counterVarName, counter + 1);
	}
}
