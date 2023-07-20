package com.sqli.intern.api.validator.services;

import com.sqli.intern.api.validator.entities.ProjectEntity;
import com.sqli.intern.api.validator.utilities.dtos.ProjectDto;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getAllProjects();

    ProjectDto getProjectById(Long id);

    Long addProject(ProjectDto projectDto);

    Long updateProject(Long id, ProjectDto projectDto);

    Long deleteProject(Long id);
    ProjectEntity getProjectEntityOrThrowsExceptionIfNotFound(Long id);
}
