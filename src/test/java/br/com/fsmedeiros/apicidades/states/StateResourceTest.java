package br.com.fsmedeiros.apicidades.states;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import br.com.fsmedeiros.apicidades.domain.Country;
import br.com.fsmedeiros.apicidades.domain.State;
import br.com.fsmedeiros.apicidades.resources.StateResource;
import br.com.fsmedeiros.apicidades.services.StateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(StateResource.class)
class StateResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StateService service;

    @Test
    public void shouldReturnStates() throws Exception {
        State state = new State(1L, "São Paulo", "SP", 35, new Country(), asList(1, 2, 3));
        when(service.findAll()).thenReturn(asList(
                state));

        mockMvc.perform(get("/staties").accept("application/json;charset=UTF-8"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$[0].name", is("São Paulo")))
                .andExpect(jsonPath("$[0].uf", is("SP")));
    }

}