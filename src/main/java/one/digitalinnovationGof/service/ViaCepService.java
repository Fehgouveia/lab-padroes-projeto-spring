package one.digitalinnovationGof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;


import one.digitalinnovationGof.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    
    @GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
