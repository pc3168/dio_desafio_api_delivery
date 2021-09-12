package one.digitalinnovation.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.delivery.entity.Person;
import one.digitalinnovation.delivery.exception.PersonNotFoundException;
import one.digitalinnovation.delivery.service.PersonService;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	private PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String createPerson(@RequestBody Person Person) {
		return personService.createPerson(Person);
	}
	
	@GetMapping
	public List<Person> listAll(){
		return personService.listAll();
	}
	
	@GetMapping("/{id}")
	public Person findById(@PathVariable Integer id) throws PersonNotFoundException {
		return personService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable Integer id) throws PersonNotFoundException {
		personService.delete(id);
	}
	
	@PutMapping("/{id}")
	public String updateById(@PathVariable Integer id , @RequestBody Person person) throws PersonNotFoundException {
		return personService.updateById(id, person);
	}

}
