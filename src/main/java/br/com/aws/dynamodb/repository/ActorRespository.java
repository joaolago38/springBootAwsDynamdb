package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.ActorEntinty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ActorRespository extends JpaRepository<ActorEntinty, Long  > {

    @Query(value = "select c from ActorEntinty c where c.actorId = :actor_id")
    ActorEntinty buscarActorPorCodigoId(@Param("actor_id") Long actorId);
}
