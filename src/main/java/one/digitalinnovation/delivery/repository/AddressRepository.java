package one.digitalinnovation.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.delivery.entity.Address;

public interface AddressRepository  extends JpaRepository<Address, Integer> {

}
