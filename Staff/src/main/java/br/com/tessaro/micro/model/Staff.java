package br.com.tessaro.micro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Entity
public class Staff {

	@Id
	private Integer idStaff;
	private Integer staffType;
	private String forename;
	private String surname;
	
}
