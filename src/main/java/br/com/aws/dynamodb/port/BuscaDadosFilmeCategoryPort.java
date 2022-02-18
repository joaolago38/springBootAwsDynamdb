package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.FilmeCategoryModel;

import java.util.List;

public interface BuscaDadosFilmeCategoryPort {
    List<FilmeCategoryModel> buscarilmeCategoryPorCodigoId(Long filmId);
}
