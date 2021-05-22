package br.com.fsmedeiros.apicidades.services;

import br.com.fsmedeiros.apicidades.domain.State;
import br.com.fsmedeiros.apicidades.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository repository;


    public List<State> findAll(){
        return repository.findAll();
    }
}
