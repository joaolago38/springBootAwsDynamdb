package br.com.aws.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Actor {
    private  Long actor_id;
    private String first_name;
    private String last_name;
    private Date last_update;
}
