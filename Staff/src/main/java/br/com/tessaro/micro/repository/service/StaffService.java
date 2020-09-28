package br.com.tessaro.micro.repository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.micro.model.Staff;
import br.com.tessaro.micro.repository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository staff;
	
	//GetAll
	public List<Staff> getAll(){
		return staff.findAll();
	}
		
	//getId
	public Optional<Staff> getId(int id){
		return staff.findById(id);
	}
	
	//Post
	public void salvar (Staff objeto) {
		staff.save(objeto);
	}
	
	//PUT
	public void put (Staff produto, int id) {
		staff.deleteById(id);
		staff.save(produto);
	}
	
	//Delete
	public void delete () {
		staff.deleteAll();
	}
	
	//DeleteID
	public void deleteId(int id) {
		staff.deleteById(id);
	}
	
}
