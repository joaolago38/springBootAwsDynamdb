package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class CityDto {

    @NotNull(message ="O campo id deve ser preenchido.")
    @JsonProperty(value = "city_id")
    private Long city_id;
    @Column(name = "country_id")
    private Long countryId;
    @Column(name = "last_update")
    private Date lastUpdate;
}
