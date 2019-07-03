package com.ctianjhoey.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ctianjhoey.project.entity.Project;
import com.ctianjhoey.project.service.ProjectService;

@RestController
public class TaskController {
	
	@Autowired
	private ProjectService taskService;
	
	//get all task
	@RequestMapping("/task")
	public List<Project> getAllTasks(@PathVariable String projectID){
		return taskService.getAllProject();
	}
	
	//add a new task
	@RequestMapping(method=RequestMethod.POST, value = "/task")
	public List<Project> addProject(@RequestBody Project task){
		return taskService.addProject(task);
	}
	
	//update task
	/*@RequestMapping(method=RequestMethod.PUT, value="/task/{id}")
	public Project updateProject(@RequestBody Project task, @PathVariable String id) {
		return taskService.updateProject(task);
	}*/
	
	//delete a task
	/*@RequestMapping(method=RequestMethod.DELETE, value="/task/{id}")
	public void deleteProject( @PathVariable String id) {
		taskService.deleteProject(id);
	}*/

}
