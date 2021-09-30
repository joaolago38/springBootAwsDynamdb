package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<CategoryEntity, Long  > {
}
