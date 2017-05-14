package com.myProject;

import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

public class CheeseShopSession extends WebSession{
	
	private static final long serialVersionUID = 7470685823136012896L;
	private Cart cart = new Cart();
	
	public CheeseShopSession(Request request) {
		super(request);
	}
	
	public Cart getCart(){
		return cart;
	}
}
