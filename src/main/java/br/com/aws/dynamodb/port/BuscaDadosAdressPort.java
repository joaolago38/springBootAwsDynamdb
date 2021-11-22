package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.Adress;

public interface BuscaDadosAdressPort {
    Adress buscarAdressPorCodigoId(Long addressId);
}
