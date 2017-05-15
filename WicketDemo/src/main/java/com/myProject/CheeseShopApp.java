package com.myProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.Application;

import com.myProject.HomePage.Index;
import com.myProject.Model.Cheese;

public class CheeseShopApp extends WebApplication{

	private List<Cheese> cheeses = initList();
			
	public CheeseShopApp() {
		
	}
	
	@Override
	public Class<? extends Page> getHomePage() {
		return Index.class;
	}
	
	public List<Cheese> getCheeses() {
		return Collections.unmodifiableList(cheeses);
	}
	
	@Override
	protected void init() {
	}
	
	public static CheeseShopApp get(){
		return (CheeseShopApp) Application.get();
	}
	
	public Session newSession(Request request,Response response){
		return new CheeseShopSession(request);
	}

	private static ArrayList<Cheese> initList(){
		ArrayList<Cheese> cheeses = new ArrayList<Cheese>();
		cheeses.add(new Cheese("Gouda", "Gouda is a yellowish Dutch[...]", 1.65));
		cheeses.add(new Cheese("Edam", "Edam is a Dutch cheese", 1.05));
		cheeses.add(new Cheese("Cheddar", "Cheddar cheese is a hard[...]", 1.99));
		
		return cheeses;
	}
}
