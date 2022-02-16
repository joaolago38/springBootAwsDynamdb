package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.StaffModel;

import java.util.List;

public interface BuscaDadosStaffPort {
    List<StaffModel> buscarStaffPorCodigoId(Long staffId);
}
