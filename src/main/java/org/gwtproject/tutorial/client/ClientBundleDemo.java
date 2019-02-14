package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class ClientBundleDemo implements EntryPoint, ValueChangeHandler<String> {
	
	ExamplePanel examples = new ExamplePanel();

	public void onModuleLoad() {
		RootPanel.get().add(examples, 0, 0);
		setUpHistoryManagement();
	}

	private void setUpHistoryManagement() {
		History.addValueChangeHandler(this);
		History.fireCurrentHistoryState();
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		// TODO Auto-generated method stub

	}
}
