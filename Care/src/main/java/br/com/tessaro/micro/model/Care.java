package br.com.tessaro.micro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Care {

	@Id
	private Integer idCare;
	private Integer idStaff;
	private Integer idSupportedPeople;
	
}
