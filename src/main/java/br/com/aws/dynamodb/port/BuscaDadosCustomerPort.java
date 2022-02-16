package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.model.CustomerModel;

import java.util.List;

public interface BuscaDadosCustomerPort {
    List<CustomerModel> buscarCustomerPorCodigoId(Long customerId);
}
