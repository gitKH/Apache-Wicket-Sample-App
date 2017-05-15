package com.myProject.HomePage;

import java.io.Serializable;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.Model;

import com.myProject.CheeseShopPage;
import com.myProject.Model.Cheese;

public class Index extends CheeseShopPage {
	private static final long serialVersionUID = -2578238872773769263L;

	public Index() {
		add(new ListView("cheeses", new Model((Serializable) getCheeses())) {
			
			@Override
			protected void populateItem(ListItem item) {
				Cheese cheese = (Cheese) item.getModelObject();
				item.add(new Label("name", cheese.getName()));
				item.add(new Label("description", cheese.getDescription()));
				item.add(new Label("price", "$" + cheese.getPrice()));
				item.add(new Link("add", item.getModel()) {
					
					@Override
					public void onClick() {
						Cheese selected = (Cheese) getModelObject();
						getCart().getListOfCheeses().add(selected);
					}
				});
			}
		});
	}
}
