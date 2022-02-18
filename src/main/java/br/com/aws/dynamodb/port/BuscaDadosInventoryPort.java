package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.InventoryModel;

import java.util.List;

public interface BuscaDadosInventoryPort {
    List<InventoryModel> buscarFilmeActorPorCodigoId(Long inventoryId);
}
