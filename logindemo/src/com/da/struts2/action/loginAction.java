package com.da.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{
	private String username="";
	private String userpwd="";
	private String login_error="";
	public String getLogin_error() {
		return login_error;
	}
	public void setLogin_error(String login_error) {
		this.login_error = login_error;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpws) {
		this.userpwd = userpws;
	}
	public String login(){
		if(username==null||username.equals("")){
			login_error="name not null!";
			return "error";
		}else if(userpwd==null||userpwd.equals("")){
			login_error="password not null!";
			return "error";
		}else if(username.equals("123")&&userpwd.equals("123")){
			return "ok";
		}else{
			login_error="name or password error!";
			return "error";
		}
	}
}
