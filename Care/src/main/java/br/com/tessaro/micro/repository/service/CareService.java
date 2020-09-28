package br.com.tessaro.micro.repository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.micro.model.Care;
import br.com.tessaro.micro.repository.CareRepository;

@Service
public class CareService {

	@Autowired
	private CareRepository repository;
	
	//get
	public List<Care> getAll(){
		return repository.findAll();
	}
	
	//getId
	public Optional<Care> getID(int id) {
		return repository.findById(id);
	}
	
	//post
	public void post (Care objeto) {
		repository.save(objeto);
	}
	
	//PUT
	public void put (Care produto, int id) {
		repository.deleteById(id);
		repository.save(produto);
	}
	
	//Delete
	public void delete () {
		repository.deleteAll();
	}
	
	//DeleteID
	public void deleteId(int id) {
		repository.deleteById(id);
	}
}
