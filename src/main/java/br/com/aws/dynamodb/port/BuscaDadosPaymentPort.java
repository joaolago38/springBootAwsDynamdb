package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.LanguageModel;

import java.util.List;

public interface BuscaDadosPaymentPort {
    List<LanguageModel> buscarFilmeActorPorCodigoId(Long languageId);
}
