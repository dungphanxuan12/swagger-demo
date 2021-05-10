package com.laptrinhjavaweb.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User class
 * 
 * @author dungphanxuan12@github.com
 */
@ApiModel(value = "User model")
public class User extends BaseModel {

	@ApiModelProperty(notes = "viết liền không dấu", example = "dungphan", required = true)
	private String username;

	@ApiModelProperty(notes = "Email của user.", example = "dungphanxuan12@gmail.com", required = false)
	private String email;

	@ApiModelProperty(notes = "Tuổi của user.", example = "23", required = false)
	private Integer age;

	public User() {
		super();
	}

	public User(String username, String email, Integer age) {
		this.username = username;
		this.email = email;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
