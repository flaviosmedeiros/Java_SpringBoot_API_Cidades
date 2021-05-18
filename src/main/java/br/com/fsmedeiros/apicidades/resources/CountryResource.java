package br.com.fsmedeiros.apicidades.resources;


import br.com.fsmedeiros.apicidades.domain.dto.CountryDTO;
import br.com.fsmedeiros.apicidades.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryService service;

    @GetMapping
    public Page<CountryDTO> findAll(Pageable page){
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CountryDTO> findById(@PathVariable Long id){

        CountryDTO result = service.findById(id);
        return result == null ? ResponseEntity.notFound().build() : ResponseEntity.ok().body(result);
    }


}
