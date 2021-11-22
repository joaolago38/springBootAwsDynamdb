package br.com.aws.dynamodb.operation;

import br.com.aws.dynamodb.mapper.AdressEntityMapper;
import br.com.aws.dynamodb.model.Adress;
import br.com.aws.dynamodb.port.BuscaDadosAdressPort;
import br.com.aws.dynamodb.repository.AdressRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdressOperation implements BuscaDadosAdressPort {

    private AdressRepository adressRespository;
    private AdressEntityMapper mapper;


    @Override
    public Adress buscarAdressPorCodigoId(Long addressId) {
        log.info("Buscando um endereço");
        var valorAdress =  adressRespository.buscarAdressPorCodigoId(addressId);
        return mapper.toModel(valorAdress) ;
    }
}
