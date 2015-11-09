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
    public static Integer departure;
    public static Integer arrival;

    
    
    
    public Integer getDeparture() {
		return departure;
	}

	public void setDeparture(Integer departure) {
		Session.departure = departure;
	}

	public Integer getArrival() {
		return arrival;
	}

	public void setArrival(Integer arrival) {
		Session.arrival = arrival;
	}

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

	@Override
	public void exit() {
		login=null;
		pwd=null;
		arrival=null;
		departure=null;
		
	}

	@Override
	public void stopSession() {
		login=null;
		pwd=null;
		arrival=null;
		departure=null;
		
	}
  

}
