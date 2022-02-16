package br.com.aws.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class RentalModel {
    private Long rental_id;
    private Date rental_date;
    private Date return_date;
    private Long customer_id;
    private Long staff_id;
    private Long inventory_id;
    private Date last_update;
}
