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

import one.digitalinnovation.delivery.entity.Address;
import one.digitalinnovation.delivery.entity.Person;
import one.digitalinnovation.delivery.exception.AddressNotFoundException;
import one.digitalinnovation.delivery.exception.PersonNotFoundException;
import one.digitalinnovation.delivery.service.AddressService;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
	
	private AddressService addressService;
	
	@Autowired
	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String createPerson(@RequestBody Address address) {
		return addressService.createAddress(address);
	}
	
	@GetMapping
	public List<Address> listAll(){
		return addressService.listAll();
	}
	
	@GetMapping("/{id}")
	public Address findById(@PathVariable Integer id) throws AddressNotFoundException {
		return addressService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable Integer id) throws AddressNotFoundException {
		addressService.delete(id);
	}
	
	@PutMapping("/{id}")
	public String updateById(@PathVariable Integer id , @RequestBody Address address) throws AddressNotFoundException {
		return addressService.updateById(id, address);
	}

}
