package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.CategoryEntity;
import br.com.aws.dynamodb.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CityRepósitory extends JpaRepository<CityEntity, Long  > {
    @Query(value = "select c from CityEntity c where c.cityId = :cityId")
    CityEntity buscarCityPorCodigoId(@Param("cityId") Long categoryId);
}
