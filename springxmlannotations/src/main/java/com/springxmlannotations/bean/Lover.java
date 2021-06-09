package com.springxmlannotations.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Lover implements Serializable{

private String name;
private int s_no;

public Lover() {
	
}


}
