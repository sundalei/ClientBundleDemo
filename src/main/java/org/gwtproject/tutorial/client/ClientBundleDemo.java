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
		// Get the token from the event
		String page = event.getValue().trim();
		// Check if the token is null or empty
		if ((page == null) || (page.equals(""))) {
		}
		// showHomePage();
		// Else check what the token is and call the appropriate method.
		else if (page.equals(HistoryTokens.DATA))
			examples.showData();
		else if (page.equals(HistoryTokens.TEXT))
			examples.showText();
		else if (page.equals(HistoryTokens.IMAGE))
			examples.showImage();
		else if (page.equals(HistoryTokens.CSS))
			examples.showCss();
		else
			examples.showInstructionsPanel();
	}
}
