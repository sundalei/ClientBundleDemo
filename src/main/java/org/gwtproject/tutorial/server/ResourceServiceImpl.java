package org.gwtproject.tutorial.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.gwtproject.tutorial.client.cssresource.ResourceService;
import org.gwtproject.tutorial.shared.Theme;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ResourceServiceImpl extends RemoteServiceServlet implements ResourceService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public List<String> getThemes() {
        ArrayList<String> themes = new ArrayList<String>();
        themes.add("Red");
        themes.add("Green");
        themes.add("Blue");
        return themes;
    }

    @Override
    public HashMap<String, String> getTheme(String name) {
        HashMap<String, String> theme = new HashMap<String, String>();
        if ("red".equalsIgnoreCase(name)) {
            theme.put("background", "red");
            theme.put("color", "white");
            theme.put("decoration", "underline");
            theme.put("fontsize", "xx-large");
            theme.put(Theme.BOLD_FONTS, "true");
            
        } else if  ("green".equalsIgnoreCase(name)){
            theme.put("background", "green");
            theme.put("color", "yellow");
            theme.put("decoration", "overline");
            theme.put("fontsize", "x-large");
        } else if  ("blue".equalsIgnoreCase(name)){
            theme.put("background", "blue");
            theme.put("decoration", "line-through");
            theme.put("fontsize", "large");
        }
        return theme;
    }

}
