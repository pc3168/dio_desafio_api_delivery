package one.digitalinnovation.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.delivery.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
