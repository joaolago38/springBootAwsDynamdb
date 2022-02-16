package br.com.aws.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class FilmeActorModel {
    private Long actor_id;
    private Long film_id;
    private Date last_update;

}
