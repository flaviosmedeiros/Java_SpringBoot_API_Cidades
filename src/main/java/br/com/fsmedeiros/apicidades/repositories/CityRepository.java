package br.com.fsmedeiros.apicidades.repositories;

import br.com.fsmedeiros.apicidades.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
