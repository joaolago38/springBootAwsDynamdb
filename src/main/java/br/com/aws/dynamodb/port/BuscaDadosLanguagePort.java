package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.LanguageModel;

import java.util.List;

public interface BuscaDadosLanguagePort {
    List<LanguageModel> buscarFilmeActorPorCodigoId(Long languageId);
}
