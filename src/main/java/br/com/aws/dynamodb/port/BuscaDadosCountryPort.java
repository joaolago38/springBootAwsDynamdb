package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.CountryModel;

import java.util.List;

public interface BuscaDadosCountryPort {
    List<CountryModel> buscarCountryPorCodigoId(Long contryId);
}
