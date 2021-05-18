package br.com.fsmedeiros.apicidades.resources;

import br.com.fsmedeiros.apicidades.domain.State;
import br.com.fsmedeiros.apicidades.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

    @Autowired
    StateService service;

    @GetMapping
    public List<State> staties() {
        return service.findAll();
    }
}
