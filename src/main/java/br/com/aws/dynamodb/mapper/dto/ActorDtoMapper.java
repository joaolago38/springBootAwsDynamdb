package br.com.aws.dynamodb.mapper.dto;


import br.com.aws.dynamodb.dto.ActorDto;
import br.com.aws.dynamodb.model.Actor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActorDtoMapper {

    Actor toModel(ActorDto payloadDTO);

    ActorDto toDTO(Actor model);

    ActorDto toResponse(Actor model);
}
