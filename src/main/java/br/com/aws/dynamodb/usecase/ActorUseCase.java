package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.model.Actor;
import br.com.aws.dynamodb.port.BuscaDadosActorPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import static br.com.aws.dynamodb.ErrorMessage.E000;

@Service
@RequiredArgsConstructor
@Slf4j
public class ActorUseCase {

    private BuscaDadosActorPort buscaDadosActorPort;
    public Actor buscaPorActorId(Long actorId){
        var actorRetorno = buscaDadosActorPort.buscarActorPorCodigoId(actorId);
         if(actorRetorno.getActor_id().equals(null)){
             throw new ErroNegocioMensagemException(
                     E000.getCodigo(), E000.getMensagem(), new ArrayList<>());
         }

         return actorRetorno;
    }



}
