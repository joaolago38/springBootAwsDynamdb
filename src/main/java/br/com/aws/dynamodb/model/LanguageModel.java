package br.com.aws.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class LanguageModel {

    private  Long language_id;
    private String name;
    private Date last_update;

}
