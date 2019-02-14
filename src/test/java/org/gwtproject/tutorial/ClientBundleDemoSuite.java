package org.gwtproject.tutorial;

import org.gwtproject.tutorial.client.ClientBundleDemoTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class ClientBundleDemoSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for ClientBundleDemo");
    suite.addTestSuite(ClientBundleDemoTest.class);
    return suite;
  }
}
