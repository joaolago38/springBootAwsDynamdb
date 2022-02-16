package br.com.aws.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class CountryModel {
    private Long  country_id;
    private String country;
    private Date last_update;
}
