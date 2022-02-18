package br.com.aws.dynamodb.usecase;


import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.model.FilmeCategoryModel;
import br.com.aws.dynamodb.model.FilmeModel;
import br.com.aws.dynamodb.port.BuscaDadosFilmPort;
import br.com.aws.dynamodb.port.BuscaDadosFilmeCategoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.ErrorMessage.E002;
import static br.com.aws.dynamodb.ErrorMessage.E008;

@Service
@RequiredArgsConstructor
public class FilmUseCase {

    private BuscaDadosFilmPort buscaDadosFilmePort;

    public List<FilmeModel> buscaPorFilmeCategoryId(Long filmeId) {
        var filmeCategoryIdRetorno = buscaDadosFilmePort.buscarFilmeCodigoId(filmeId);
        if (filmeCategoryIdRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E008.getCodigo(), E008.getMensagem(), new ArrayList<>());
        }
        return filmeCategoryIdRetorno;

    }
}
