package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.CategoryModel;

import java.util.List;

public interface BuscaDadosCategoryPort {
    List<CategoryModel> buscarCategoryPorCodigoId(Long categoryId);
}
