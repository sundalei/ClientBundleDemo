package org.gwtproject.tutorial.client.dataresource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.DataResource.MimeType;

public interface DataResources extends ClientBundle {
  DataResources IMPL = 
    (DataResources) GWT.create(DataResources.class);

  @Source("resources/BigPhoto.jpg")
  DataResource bigPhoto();

  @DoNotEmbed
  @Source("resources/Document.pdf")
  DataResource document();

  @MimeType("image/png")
  @Source("resources/slashdot.png")
  DataResource slashdot();
}
