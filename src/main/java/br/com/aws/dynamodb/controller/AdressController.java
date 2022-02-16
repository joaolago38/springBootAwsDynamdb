package br.com.aws.dynamodb.controller;

import br.com.aws.dynamodb.dto.AdressDto;
import br.com.aws.dynamodb.usecase.AdressUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/adress"})
public class AdressController {

    private AdressUseCase adressUseCase;

    @GetMapping(path = {"/{adressId}"})
    public ResponseEntity<List<AdressDto>>consultarAdressPorCodigId(@PathVariable Long addressId) {

//        return ResponseEntity.status(HttpStatus.OK).body(adressUseCase.buscaPorAdressId(addressId));
    return null;
    }
}
