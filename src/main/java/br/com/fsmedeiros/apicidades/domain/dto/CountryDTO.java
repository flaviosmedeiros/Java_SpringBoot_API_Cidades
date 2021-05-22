package br.com.fsmedeiros.apicidades.domain.dto;

import br.com.fsmedeiros.apicidades.domain.Country;


public class CountryDTO {

    private Long id;
    private String portugueseName;
    private String code;

    public CountryDTO() {
    }

    public CountryDTO(Country entity){
        this.id = entity.getId();
        this.portugueseName = entity.getPortugueseName();
        this.code = entity.getCode();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPortugueseName() {
        return portugueseName;
    }
    public void setPortugueseName(String portugueseName) {
        this.portugueseName = portugueseName;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
