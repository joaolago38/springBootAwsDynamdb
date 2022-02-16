package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.CustomerModel;
import br.com.aws.dynamodb.model.FilmeActorModel;

import java.util.List;

public interface BuscaDadosFilmeActorPort {
    List<FilmeActorModel> buscarFilmeActorPorCodigoId(Long actorId);

}
