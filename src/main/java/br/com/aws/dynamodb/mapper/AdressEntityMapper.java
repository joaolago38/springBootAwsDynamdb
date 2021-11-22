package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.entity.ActorEntinty;
import br.com.aws.dynamodb.entity.AdressEntity;
import br.com.aws.dynamodb.model.Actor;
import br.com.aws.dynamodb.model.Adress;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdressEntityMapper {
    Adress toModel(AdressEntity entity);

    AdressEntity toEntity(Adress model);

    List<Adress> toListModel(List<AdressEntity> entities);
}
