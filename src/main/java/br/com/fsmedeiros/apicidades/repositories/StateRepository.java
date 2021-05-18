package br.com.fsmedeiros.apicidades.repositories;

import br.com.fsmedeiros.apicidades.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
