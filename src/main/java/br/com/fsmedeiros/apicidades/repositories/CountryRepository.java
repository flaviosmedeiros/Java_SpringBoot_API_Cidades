package br.com.fsmedeiros.apicidades.repositories;

import br.com.fsmedeiros.apicidades.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

@Transactional
public interface CountryRepository extends JpaRepository<Country, Long> {
}
