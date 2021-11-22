package br.com.aws.dynamodb.controller;

import br.com.aws.dynamodb.model.Actor;
import br.com.aws.dynamodb.model.Adress;
import br.com.aws.dynamodb.usecase.ActorUseCase;
import br.com.aws.dynamodb.usecase.AdressUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/adress"})
public class AdressController {

    private AdressUseCase adressUseCase;

    @GetMapping(path = {"/{adressId}"})
    public ResponseEntity<Adress> consultarAdressPorCodigId(@PathVariable Long addressId) {

        return ResponseEntity.status(HttpStatus.OK).body(adressUseCase.buscaPorAdressId(addressId));

    }
}
