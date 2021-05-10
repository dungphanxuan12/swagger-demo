package com.laptrinhjavaweb.model;

import java.util.Date;

/**
 * BaseModel class
 * 
 * @author dungphanxuan12@github.com
 */
public class BaseModel {

	private Long id;
	private Date createdDate;
	private Date createdBy;

	public BaseModel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

}
