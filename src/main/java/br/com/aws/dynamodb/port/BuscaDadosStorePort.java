package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.StoreModel;

import java.util.List;

public interface BuscaDadosStorePort {
    List<StoreModel> buscarStorePorCodigoId(Long storeId);
}
