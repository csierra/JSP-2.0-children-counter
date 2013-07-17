package com.bizonos.util;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CounterIncrement extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		Integer counter = (Integer)getJspContext().getAttribute(
				CounterTag.counterVarName, PageContext.REQUEST_SCOPE);
		if (counter == null) {
			throw new Error("No parent counter found");
		}
		getJspContext().setAttribute(
				CounterTag.counterVarName, counter + 1, PageContext.REQUEST_SCOPE);
	}
}
