package br.com.tessaro.micro.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Supported {
	
	@Id
	private int idSupportedPeople;
	private String forename;
	private String surname;
	private Date dob;
	private String photo;
}
