package com.example;

import org.springframework.util.StringUtils;

public class Task {

	private String taskname;

	private TaskType taskType;

	public void validateTaskName() {
		if ( StringUtils.isEmpty( taskname ) ) {
			throw new TaskNameInvalidException();

		}
	}

}
