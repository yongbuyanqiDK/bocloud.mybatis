package com.bocloud.mybatis.beans;

public class UserBean {

	private Integer id;

	private String username;

	private String password;

	private Double account;

	public UserBean() {
	}

	public UserBean(String username, String password, Double account) {
		this.username = username;
		this.password = password;
		this.account = account;
	}

	public UserBean(Integer id, String username, String password, Double account) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.account = account;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the account
	 */
	public Double getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(Double account) {
		this.account = account;
	}

}
