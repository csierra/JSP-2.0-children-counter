package com.bizonos.util;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CounterTag extends SimpleTagSupport {
	
	public static final String tagNamespace = "liferayutil";
	public static final String counterVarName = tagNamespace + "counter";
	private String var;

	private Integer parentCounter = null;
	
	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		
		JspContext jspContext = getJspContext();
		parentCounter = (Integer)jspContext.getAttribute(
				counterVarName, PageContext.REQUEST_SCOPE);
		jspContext.setAttribute(counterVarName, 0, PageContext.REQUEST_SCOPE);
		getJspBody().invoke(null);
		jspContext.setAttribute(
				getVar(), jspContext.getAttribute(
						counterVarName, PageContext.REQUEST_SCOPE), PageContext.REQUEST_SCOPE);
		if (parentCounter != null) {
			jspContext.setAttribute(
					counterVarName, parentCounter, PageContext.REQUEST_SCOPE);
		}
		else {
			jspContext.removeAttribute(
					counterVarName, PageContext.REQUEST_SCOPE);
		}
	}
}
