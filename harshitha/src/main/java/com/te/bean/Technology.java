package com.te.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Technology implements Serializable {
	private String techname;
	private int techid;

	public Technology() {

	}
}
