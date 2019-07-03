package com.ctianjhoey.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctianjhoey.project.entity.Project;
import com.ctianjhoey.project.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepo;

	public List<Project> getAllProject() {
		List<Project> projectList = new ArrayList<>();
		projectRepo.findAll().forEach(projectList::add);
		return projectList;
	}

	public List<Project> addProject(Project project) {
		projectRepo.save(project);
		return getAllProject();
	}

	public Project updateProject(Project vendor) {
		projectRepo.save(vendor);
		return vendor;
	}

	public void deleteProject(String id) {
		projectRepo.deleteById(Long.parseLong(id));
	}
}
