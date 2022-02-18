package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.RentalModel;

import java.util.List;

public interface BuscaDadosRentalPort {
    List<RentalModel> buscarRentalPorCodigoId(Long rentalId);
}
