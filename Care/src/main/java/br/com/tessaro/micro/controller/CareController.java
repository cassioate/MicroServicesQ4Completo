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

import br.com.tessaro.micro.model.Care;
import br.com.tessaro.micro.repository.service.CareService;

@RestController
@RequestMapping("/care")
public class CareController {

	@Autowired
	private CareService service;
	
	//Nunca esquecer de por o new no return ou dará Erro!!
	@GetMapping
	public ResponseEntity<List<Care>> getAll (){
		return new ResponseEntity<List<Care>>(service.getAll(), HttpStatus.OK);
	}
	
	//Nao esquecer o new no return, ou dará erro
	//Nunca esquecer o ("/{id}") e o @PathVariable
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Care>> getId (@PathVariable int id){
		return new ResponseEntity<Optional<Care>>(service.getID(id), HttpStatus.OK);
	}
	
	//Nao esquecer RequestBody
	//Nao esquecer o new no return, ou dará erro
	@PostMapping
	public ResponseEntity<Care> post (@RequestBody Care objeto){
		service.post(objeto);
		return new ResponseEntity<Care>(HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Care> put (@RequestBody Care produto, @PathVariable int id){
		service.put(produto, id);
		return new ResponseEntity<Care>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Care> delete (){
		service.delete();
		return new ResponseEntity<Care>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Care> deleteId (@PathVariable int id){
		service.deleteId(id);
		return new ResponseEntity<Care>(HttpStatus.OK);
	}
}
