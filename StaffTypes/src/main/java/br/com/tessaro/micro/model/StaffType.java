package br.com.tessaro.micro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Entity
public class StaffType {
	
	@Id
	private int stafftype;
	private String description;
	
}
