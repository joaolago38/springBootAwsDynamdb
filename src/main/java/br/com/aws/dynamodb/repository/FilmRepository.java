package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<FilmEntity, Long  > {
}
