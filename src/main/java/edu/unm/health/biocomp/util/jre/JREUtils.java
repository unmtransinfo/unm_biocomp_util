package edu.unm.health.biocomp.util.jre;

import java.lang.reflect.*; //Method

public class JREUtils
{
  /////////////////////////////////////////////////////////////////////////////
  private static String JREVersion() throws Exception
  {
    String jre_ver=null;
    Class c = Class.forName("java.lang.Runtime"); // JRE9+
    Method methods[] = c.getMethods();
    for (int i=0; i<methods.length; ++i) {
      if (methods[i].getName() == "version") {
        jre_ver = methods[i].invoke(c).toString();
        break;
      }
    }
    if (jre_ver==null) jre_ver = System.getProperty("java.version"); // JRE8-
    return (jre_ver);
  }
}
