package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.AdressModel;

import java.util.List;

public interface BuscaDadosAdressPort {
   List<AdressModel> buscarAdressPorCodigoId(Long addressId);
}
