package com.myProject;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;

public abstract class CheeseShopPage extends WebPage{
	private static final long serialVersionUID = 6824478107671727213L;
	
	public CheeseShopSession getCheeseShopSession(){
		return (CheeseShopSession) getSession();
	}
	
	public Cart getCart(){
		return getCheeseShopSession().getCart();
	}
	
	public List<Cheese> getCheeses(){
		return CheeseShopApp.get().getCheeses();
	}
}
