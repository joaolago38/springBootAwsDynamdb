package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.model.AdressModel;
import br.com.aws.dynamodb.port.BuscaDadosAdressPort;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.ErrorMessage.E000;

public class AdressUseCase {

    private BuscaDadosAdressPort buscaDadosAdressPort;
    public List<AdressModel> buscaPorAdressId(Long adresId){
        var adressRetorno = buscaDadosAdressPort.buscarAdressPorCodigoId(adresId);
        if(adressRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E000.getCodigo(), E000.getMensagem(), new ArrayList<>());
        }

        return adressRetorno;
    }
}
