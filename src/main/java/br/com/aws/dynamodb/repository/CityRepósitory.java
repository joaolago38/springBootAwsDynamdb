package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepósitory extends JpaRepository<CityEntity, Long  > {
}
