package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.model.Adress;
import br.com.aws.dynamodb.port.BuscaDadosAdressPort;

import java.util.ArrayList;

import static br.com.aws.dynamodb.ErrorMessage.E000;

public class AdressUseCase {

    private BuscaDadosAdressPort buscaDadosAdressPort;
    public Adress buscaPorAdressId(Long adresId){
        var adressRetorno = buscaDadosAdressPort.buscarAdressPorCodigoId(adresId);
        if(adressRetorno.getAddress().equals(null)){
            throw new ErroNegocioMensagemException(
                    E000.getCodigo(), E000.getMensagem(), new ArrayList<>());
        }

        return adressRetorno;
    }
}
