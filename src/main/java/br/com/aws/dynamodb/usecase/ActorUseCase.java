package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.model.ActorModel;
import br.com.aws.dynamodb.port.BuscaDadosActorPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.ErrorMessage.E000;

@Service
@RequiredArgsConstructor
public class ActorUseCase {

    private BuscaDadosActorPort buscaDadosActorPort;
    public List<ActorModel> buscaPorActorId(Long actorId){
        var actorRetorno = buscaDadosActorPort.buscarActorPorCodigoId(actorId);
         if(actorRetorno.isEmpty()){
             throw new ErroNegocioMensagemException(
                     E000.getCodigo(), E000.getMensagem(), new ArrayList<>());
         }

         return actorRetorno;
    }



}
