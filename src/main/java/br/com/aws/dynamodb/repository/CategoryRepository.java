package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long  > {
    @Query(value = "select c from CategoryEntity c where c.categoryId = :categoryId")
    CategoryEntity buscarCategoryPorCodigoId(@Param("categoryId") Long categoryId);
}
