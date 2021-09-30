package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRespository extends JpaRepository<LanguageEntity, Long  > {
}
