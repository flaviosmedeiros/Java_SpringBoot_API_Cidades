package br.com.fsmedeiros.apicidades.resources;


import br.com.fsmedeiros.apicidades.domain.Country;
import br.com.fsmedeiros.apicidades.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public List<Country> findAll(){
        return repository.findAll();
    }
}
