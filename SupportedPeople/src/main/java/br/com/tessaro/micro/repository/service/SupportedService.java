package br.com.tessaro.micro.repository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.micro.model.Supported;
import br.com.tessaro.micro.repository.SupportedRepository;

@Service
public class SupportedService {
	
	@Autowired
	private SupportedRepository repository;
	
	//GET
	public List<Supported> getAll() {
		return repository.findAll();
	}
	
	//GETID
	public Optional<Supported> getId(int id){
		return repository.findById(id);
	}
	
	//POST
	public void post (Supported objeto) {
		repository.save(objeto);
	}
	
	//PUT
	public void put (Supported produto, int id) {
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
