package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.model.CategoryModel;
import br.com.aws.dynamodb.port.BuscaDadosCategoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.ErrorMessage.E002;

@Service
@RequiredArgsConstructor
public class CategoryUsecase {

    private BuscaDadosCategoryPort buscaDadosCategoryPort;
    public List<CategoryModel> buscaPorCateroyId(Long categoryId){
        var categoryRetorno = buscaDadosCategoryPort.buscarCategoryPorCodigoId(categoryId);
        if(categoryRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E002.getCodigo(), E002.getMensagem(), new ArrayList<>());
        }
        return categoryRetorno;

    }
}
