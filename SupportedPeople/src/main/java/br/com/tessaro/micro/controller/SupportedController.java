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

import br.com.tessaro.micro.model.Supported;
import br.com.tessaro.micro.repository.service.SupportedService;

@RestController
@RequestMapping("/supported")
public class SupportedController {

	@Autowired
	private SupportedService service;
	
	@GetMapping
	public ResponseEntity<List<Supported>> getAll (){
		return new ResponseEntity<List<Supported>> (service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Supported>> getId (@PathVariable int id){
		return new ResponseEntity<Optional<Supported>> (service.getId(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Supported> post (@RequestBody Supported objeto){
		service.post(objeto);
		return new ResponseEntity<Supported>(HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Supported> put (@RequestBody Supported produto, @PathVariable int id){
		service.put(produto, id);
		return new ResponseEntity<Supported>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Supported> delete (){
		service.delete();
		return new ResponseEntity<Supported>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Supported> deleteId (@PathVariable int id){
		service.deleteId(id);
		return new ResponseEntity<Supported>(HttpStatus.OK);
	}
}
