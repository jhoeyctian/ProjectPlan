package com.ctianjhoey.project.entity;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Project extends MetaObject {

	private String projectName;
	private String projectDescription;
/*	private Set<Task> tasks;*/
	private Calendar startDate;
	private Calendar endDate;

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

	/*public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}*/

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", " + "projectDescription=" + projectDescription + ", "
				+ "startDate="+startDate.getTime()+", endDate="+endDate.getTime()+"]";
	}

}
