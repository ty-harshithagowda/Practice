package com.springxmlannotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bharath implements Serializable{

	private String name;
	
	public Bharath() {
		
	}
	@Autowired
	private Lover lov;
	@Autowired
	private Gf gf;
}
