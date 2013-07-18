package com.bizonos.util;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CounterTag extends CounterTagSupport {
	
	private String var;

	private Integer parentCounter = null;
	private String namespace = null;

	private String counterVarName;
	
	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		this.counterVarName = namespace + "counter";
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		
		JspContext jspContext = getJspContext();
		parentCounter = (Integer)getRequestAttribute(counterVarName);
		setRequestAttribute(counterVarName, 0);
		getJspBody().invoke(null);
		setRequestAttribute(
				getVar(), getRequestAttribute(counterVarName));
		if (parentCounter != null) {
			setRequestAttribute(counterVarName, parentCounter);
		}
		else {
			removeRequestAttribute(counterVarName);
		}
	}
	
}
