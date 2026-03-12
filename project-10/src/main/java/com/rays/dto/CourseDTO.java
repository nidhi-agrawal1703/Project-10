package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name="st_course")
public class CourseDTO extends BaseDTO {
	
	@Column(name="name",length=50)
	private String name;
	
	@Column(name="description",length=50)
	private String description;
	
	@Column(name="duration",length=50)
	private String duration;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String getKey() {
		return null;
	}

	@Override
	public String getvalue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "name";
	}

	@Override
	public String getUniqueValue() {
		return name;
	}

	@Override
	public String getLabel() {
		return "Course Name";
	}

	@Override
	public String getTableName() {
		return "Course";
	}

}
