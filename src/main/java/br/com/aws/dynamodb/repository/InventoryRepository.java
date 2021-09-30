package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Long  > {
}
