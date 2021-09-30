package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long  > {
}
