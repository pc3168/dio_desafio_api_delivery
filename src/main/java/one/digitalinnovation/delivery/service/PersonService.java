package one.digitalinnovation.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.delivery.entity.Person;
import one.digitalinnovation.delivery.exception.PersonNotFoundException;
import one.digitalinnovation.delivery.repository.PersonRepository;

@Service
public class PersonService {

	
	private PersonRepository personRepository;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public String createPerson(Person person) {
		Person personSave =  personRepository.save(person);
		return mensage( personSave.getPersonId(), "Create person by Id ");
	}

	public List<Person> listAll() {
		List<Person> allPeople = personRepository.findAll();
		return allPeople;
	}

	public Person findById(Integer id) throws PersonNotFoundException {
		return verifyIfExists(id);
	}
	
	public void delete(Integer id) throws PersonNotFoundException {
		verifyIfExists(id);
		personRepository.deleteById(id);
	}
	
	public String updateById(Integer id, Person person) throws PersonNotFoundException {
		verifyIfExists(id);
		
		Person personUpdate =  personRepository.save(person);
		return mensage( personUpdate.getPersonId(), "Update person by Id ");
	}
	
	private String mensage(Integer id, String mensage) {
		return mensage + id;
	}
	
	private Person verifyIfExists(Integer id) throws PersonNotFoundException {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			throw new PersonNotFoundException(id);
		}
		return optionalPerson.get();
	}

	
}
