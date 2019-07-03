package com.ctianjhoey.project.entity;

import java.util.Calendar;

import javax.persistence.Entity;

@Entity
public class Task extends MetaObject {

	public Task(String task, Calendar startDate, Calendar endDate) {
		super();
		this.task = task;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	private String task;
	private Calendar startDate;
	private Calendar endDate;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "Task [task="+task+", "
						+ "startDate="+startDate.getTime()+", "
						+ "endDate="+endDate.getTime()+"]";
	}

}
