package one.digitalinnovation.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.delivery.entity.Address;
import one.digitalinnovation.delivery.entity.Person;
import one.digitalinnovation.delivery.exception.AddressNotFoundException;
import one.digitalinnovation.delivery.exception.PersonNotFoundException;
import one.digitalinnovation.delivery.repository.AddressRepository;

@Service
public class AddressService {

	
	private AddressRepository addressRepository;
	
	@Autowired
	public AddressService(AddressRepository personRepository) {
		this.addressRepository = personRepository;
	}
	
	public String createAddress(Address address) {
		Address save =  addressRepository.save(address);
		return mensage( save.getAddressId(), "Create address by Id ");
	}

	public List<Address> listAll() {
		List<Address> allPeople = addressRepository.findAll();
		return allPeople;
	}

	public Address findById(Integer id) throws AddressNotFoundException {
		return verifyIfExists(id);
	}
	
	public void delete(Integer id) throws AddressNotFoundException {
		verifyIfExists(id);
		addressRepository.deleteById(id);
	}
	
	public String updateById(Integer id, Address address) throws AddressNotFoundException {
		verifyIfExists(id);
		
		Address update =  addressRepository.save(address);
		return mensage( update.getAddressId(), "Update address by Id ");
	}
	
	private String mensage(Integer id, String mensage) {
		return mensage + id;
	}
	
	private Address verifyIfExists(Integer id) throws AddressNotFoundException {
		Optional<Address> optional = addressRepository.findById(id);
		if(optional.isEmpty()) {
			throw new AddressNotFoundException(id);
		}
		return optional.get();
	}

	
}
