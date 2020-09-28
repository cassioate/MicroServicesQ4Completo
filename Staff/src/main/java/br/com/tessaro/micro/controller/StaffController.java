package br.com.tessaro.micro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tessaro.micro.model.Staff;
import br.com.tessaro.micro.repository.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController{

	@Autowired
	private StaffService service;
	
	@GetMapping
	//Nunuca esquecer de por o new no return ou dará Erro!!
	public ResponseEntity<List<Staff>> getAll () {
		return new ResponseEntity<List<Staff>>(service.getAll(),HttpStatus.OK);
	}
	
	//Nao esquecer o new no return, ou dará erro
	//Nunca esquecer o ("/{id}") e o @PathVariable
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Staff>> getId (@PathVariable Integer id){
		return new ResponseEntity<Optional<Staff>>(service.getId(id), HttpStatus.OK);
	}
	
	//Nao esquecer RequestBody
	//Nao esquecer o new no return, ou dará erro
	@PostMapping
	public ResponseEntity<Staff> postStaff (@RequestBody Staff objeto){
		service.salvar(objeto);
		return new ResponseEntity<Staff>(HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Staff> put (@RequestBody Staff produto, @PathVariable int id){
		service.put(produto, id);
		return new ResponseEntity<Staff>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Staff> delete (){
		service.delete();
		return new ResponseEntity<Staff>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Staff> deleteId (@PathVariable int id){
		service.deleteId(id);
		return new ResponseEntity<Staff>(HttpStatus.OK);
	}
	
	
}
