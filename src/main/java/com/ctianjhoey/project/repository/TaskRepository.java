package com.ctianjhoey.project.repository;

import org.springframework.data.repository.CrudRepository;
import com.ctianjhoey.project.entity.Project;

public interface TaskRepository extends CrudRepository<Project, Long> {

}
