package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.AdressEntity;
import br.com.aws.dynamodb.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdressRepository extends JpaRepository<CategoryEntity, Long  > {
    @Query(value = "select c from AdressEntity c where c.addressId = :addressId")
    AdressEntity buscarAdressPorCodigoId(@Param("addressId") Long actorId);
}
