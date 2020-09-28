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

import br.com.tessaro.micro.model.StaffType;
import br.com.tessaro.micro.repository.service.StaffTypeService;

@RestController
@RequestMapping("/staffType")
public class StaffTypeController {

	@Autowired
	private StaffTypeService service;
	
	//Nao esquecer o new no return, ou dará erro
	@GetMapping
	public ResponseEntity<List<StaffType>> getAll(){
		return new ResponseEntity<List<StaffType>>(service.getAll(), HttpStatus.OK);
	}
	
	//Nunca esquecer o ("/{id}") e o @PathVariable
	//Nao esquecer o new no return, ou dará erro
	@GetMapping("/{id}")
	public ResponseEntity<Optional<StaffType>> getId(@PathVariable int id){
		return new ResponseEntity<Optional<StaffType>>(service.getId(id), HttpStatus.OK);
	}
	
	//Nao esquecer @RequestBody
	//Nao esquecer o new no return, ou dará erro
	@PostMapping
	public ResponseEntity<StaffType> postStaffType (@RequestBody StaffType objeto){
		service.post(objeto);
		return new ResponseEntity<StaffType>(HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<StaffType> put (@RequestBody StaffType produto, @PathVariable int id){
		service.put(produto, id);
		return new ResponseEntity<StaffType>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<StaffType> delete (){
		service.delete();
		return new ResponseEntity<StaffType>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<StaffType> deleteId (@PathVariable int id){
		service.deleteId(id);
		return new ResponseEntity<StaffType>(HttpStatus.OK);
	}
	
}
