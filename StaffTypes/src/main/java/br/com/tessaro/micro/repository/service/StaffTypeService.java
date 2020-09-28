package br.com.tessaro.micro.repository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.micro.model.StaffType;
import br.com.tessaro.micro.repository.StaffTypeRepository;

@Service
public class StaffTypeService {

	@Autowired
	private StaffTypeRepository repository;
	
	//get
	public List<StaffType> getAll() {
		return repository.findAll();
	}
	
	//getId
	public Optional<StaffType> getId(int id) {
		return repository.findById(id);
	}
	
	//post
	public void post (StaffType stafftype) {
		repository.save(stafftype);
	}
	
	//PUT
	public void put (StaffType produto, int id) {
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
