package one.digitalinnovation.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.delivery.entity.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
