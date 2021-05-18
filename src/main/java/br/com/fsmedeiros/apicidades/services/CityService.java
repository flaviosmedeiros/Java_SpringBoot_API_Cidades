package br.com.fsmedeiros.apicidades.services;

import br.com.fsmedeiros.apicidades.domain.City;
import br.com.fsmedeiros.apicidades.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityRepository repository;


    public Page<City> findAll(Pageable page){
        return repository.findAll(page);
    }
}
