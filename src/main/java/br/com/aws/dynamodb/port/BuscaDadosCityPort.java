package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.CityModel;

import java.util.List;

public interface BuscaDadosCityPort {
    List<CityModel> buscarCityPorCodigoId(Long cityId);
}
