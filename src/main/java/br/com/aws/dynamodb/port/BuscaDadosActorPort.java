package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.Actor;

public interface BuscaDadosActorPort {
    Actor buscarActorPorCodigoId(Long actorId);
}
