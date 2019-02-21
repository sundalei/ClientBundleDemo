package org.gwtproject.tutorial.client.imageresource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends StaticClientBundle {
  Resources IMPL = (Resources) GWT.create(Resources.class);
  
  ImageResource blogger();
  ImageResource delicious();
  ImageResource digg();
  ImageResource facebook();
  ImageResource google();
  ImageResource mail();
  ImageResource reddit();
  ImageResource slashdot();
  ImageResource twitter();
  ImageResource yahoo();
}
