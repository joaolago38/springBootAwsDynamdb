package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.entity.ActorEntinty;
import br.com.aws.dynamodb.model.Actor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ActorEntityMapper {

    Actor toModel(ActorEntinty entity);

    ActorEntinty toEntity(Actor model);

    List<Actor> toListModel(List<ActorEntinty> entities);
}
