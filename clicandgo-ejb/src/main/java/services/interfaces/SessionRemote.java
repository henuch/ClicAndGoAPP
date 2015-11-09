package services.interfaces;

import javax.ejb.Remote;

@Remote
public interface SessionRemote {

	String getLogin();

	void setLogin(String login);

	String getPwd();

	void setPwd(String pwd);

	Integer getDeparture();

	void setDeparture(Integer departure);

	Integer getArrival();

	void setArrival(Integer arrival);

	void exit();

	void stopSession();
}
