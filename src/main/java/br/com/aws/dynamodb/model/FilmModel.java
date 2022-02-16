package br.com.aws.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class FilmModel {

    private  Long film_id;
    private String title;
    private String description;
    private String release_year;
    private Long language_id;
    private String rental_duration;
    private String rental_rate;
    private Integer length;
    private String replacement_cost;
}
