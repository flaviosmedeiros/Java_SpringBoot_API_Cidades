package br.com.fsmedeiros.apicidades.services;


import br.com.fsmedeiros.apicidades.domain.Country;
import br.com.fsmedeiros.apicidades.domain.dto.CountryDTO;
import br.com.fsmedeiros.apicidades.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;


    public Page<CountryDTO> findAll(Pageable page){
        Page<Country> result =  repository.findAll(page);
        return result.map(item -> new CountryDTO(item));
    }

    public CountryDTO findById(Long id){
        Optional<Country> result = repository.findById(id);
        return result.isPresent() ? new CountryDTO(result.get()) : null;
    }


}
