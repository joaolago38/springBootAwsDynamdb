package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.FilmeModel;

import java.util.List;

public interface BuscaDadosFilmPort {
    List<FilmeModel> buscarFilmeCodigoId(Long filmId);
}
