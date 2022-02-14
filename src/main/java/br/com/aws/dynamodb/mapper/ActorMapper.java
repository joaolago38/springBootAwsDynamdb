package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.dto.ActorDto;
import br.com.aws.dynamodb.entity.ActorEntinty;
import br.com.aws.dynamodb.model.ActorModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActorMapper {
    ActorEntinty toEntity(ActorModel model);
    ActorModel toModel(ActorEntinty model);
    ActorDto doDto(ActorModel model);


}
