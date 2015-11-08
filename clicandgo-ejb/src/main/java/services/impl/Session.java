package services.impl;

import javax.annotation.PreDestroy;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import services.interfaces.SessionRemote;

/**
 * Session Bean implementation class SessionServices
 */
@Stateful
public class Session implements SessionRemote {

	public static String login;
    public static String pwd;

    
    
    
    public  String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        Session.login = login;
    }

    public  String getPwd() {
        return pwd;
    }

    public  void setPwd(String pwd) {
        Session.pwd = pwd;
    }
    public Session() {
        // TODO Auto-generated constructor stub
    }
    
    @PreDestroy
    public void exit () {
        Session.pwd=null;
        Session.login=null;
    }
    
    @Remove
    public void stopSession () {
        Session.pwd=null;
        Session.login=null;
    } 

}
