/**
 * 
 */
package com.samiuddin.javaee.dto;

/**
 * @author sami
 *
 */
public class User {
	 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	private String userName;
	private String userID;

}
