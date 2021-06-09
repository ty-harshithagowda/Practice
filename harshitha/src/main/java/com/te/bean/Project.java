package com.te.bean;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project implements Serializable {

	private int pid;
	private String name;

	public Project() {

	}

	@Autowired
	@Qualifier("2")
	private Technology tech;
}
