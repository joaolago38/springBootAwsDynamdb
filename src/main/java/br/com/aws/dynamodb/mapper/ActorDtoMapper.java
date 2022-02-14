package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.dto.ActorDto;
import br.com.aws.dynamodb.model.ActorModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActorDtoMapper {
    ActorDto toDTO(ActorModel model);
}
