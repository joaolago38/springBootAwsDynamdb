package br.com.aws.dynamodb.operation;

import br.com.aws.dynamodb.mapper.ActorEntityMapper;
import br.com.aws.dynamodb.model.Actor;
import br.com.aws.dynamodb.port.BuscaDadosActorPort;
import br.com.aws.dynamodb.repository.ActorRespository;

public class ActorOperation implements BuscaDadosActorPort {

    private ActorRespository    actorRespository;
    private ActorEntityMapper mapper;

    @Override
    public Actor buscarActorPorCodigoId(Long actorId) {
        var valorActor =  actorRespository.buscarActorPorCodigoId(actorId);
        return mapper.toModel(valorActor) ;
    }
}
