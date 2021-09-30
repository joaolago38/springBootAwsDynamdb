package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<StoreEntity, Long  > {
}
