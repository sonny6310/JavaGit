package com.naver.org;

public class UserVO {

	private String UserName;
	private String UserEmail;
	private String UserGender;
	private String UserNaver;

	@Override
	public String toString() {
		return "UserVO [UserName=" + UserName + ", UserEmail=" + UserEmail + ", UserGender=" + UserGender
				+ ", UserNaver=" + UserNaver + "]";
	}

	public UserVO(String userName, String userEmail, String userGender, String userNaver) {
		super();
		UserName = userName;
		UserEmail = userEmail;
		UserGender = userGender;
		UserNaver = userNaver;
	}

	public UserVO() {
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public String getUserGender() {
		return UserGender;
	}

	public void setUserGender(String userGender) {
		UserGender = userGender;
	}

	public String getUserNaver() {
		return UserNaver;
	}

	public void setUserNaver(String userNaver) {
		UserNaver = userNaver;
	}
}
