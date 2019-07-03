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
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	//get all project
	@RequestMapping("/project")
	public List<Project> getAllProject(){
		return projectService.getAllProject();
	}
	
	//add a new project
	@RequestMapping(method=RequestMethod.POST, value = "/project")
	public List<Project> addProject(@RequestBody Project project){
		return projectService.addProject(project);
	}
	
	//update project
	@RequestMapping(method=RequestMethod.PUT, value="/project/{id}")
	public Project updateProject(@RequestBody Project project, @PathVariable String id) {
		return projectService.updateProject(project);
	}
	
	//delete a project
	@RequestMapping(method=RequestMethod.DELETE, value="/project/{id}")
	public void deleteProject( @PathVariable String id) {
		projectService.deleteProject(id);
	}

}
