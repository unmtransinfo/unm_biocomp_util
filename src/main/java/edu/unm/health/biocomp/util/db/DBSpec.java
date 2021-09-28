package edu.unm.health.biocomp.util.db;

import java.io.*;
import java.util.*;


/**	Simple db specification.
	@author Jeremy Yang
*/
public class DBSpec
{
  public String host;
  public String name;
  public Integer port;
  public String user;
  public String pw;

  /**	Normal constructor.
  */
  public DBSpec(String _host, Integer _port, String _name, String _user, String _pw)
  {
    this.setHost(_host);
    this.setPort(_port);
    this.setName(_name);
    this.setUser(_user);
    this.setPassword(_pw);
  }
  public String getHost() { return this.host; }
  public void setHost(String _host) { this.host=_host; }
  public Integer getPort() { return this.port; }
  public void setPort(Integer _port) { this.port=_port; }
  public String getName() { return this.name; }
  public void setName(String _name) { this.name=_name; }
  public String getUser() { return this.user; }
  public void setUser(String _user) { this.user=_user; }
  public String getPassword() { return this.pw; }
  public void setPassword(String _pw) { this.pw=_pw; }

  public String toString() {
    return this.host+":"+this.port+":"+this.name+":"+this.user+":"+this.pw;
  }
}
