package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.FilmeActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeActorRespository extends JpaRepository<FilmeActorEntity, Long  > {
}
