package com.bizonos.util;

import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CounterTagSupport extends SimpleTagSupport {

	protected void removeRequestAttribute(String name) {
		getJspContext().removeAttribute(
				name, PageContext.REQUEST_SCOPE);
	}

	protected Object getRequestAttribute(String name) {
		return getJspContext().getAttribute(
				name, PageContext.REQUEST_SCOPE);
	}

	protected void setRequestAttribute(String name, Object value) {
		getJspContext().setAttribute(
				name, value, PageContext.REQUEST_SCOPE);
	}

}
