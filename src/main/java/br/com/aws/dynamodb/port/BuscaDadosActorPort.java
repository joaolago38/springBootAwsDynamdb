package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.ActorModel;

import java.util.List;

public interface BuscaDadosActorPort {
   List<ActorModel> buscarActorPorCodigoId(Long actorId);
}
