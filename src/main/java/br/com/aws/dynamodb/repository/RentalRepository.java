package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.LanguageEntity;
import br.com.aws.dynamodb.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<RentalEntity, Long  > {
}
