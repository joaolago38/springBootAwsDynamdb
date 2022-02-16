package br.com.aws.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class InventoryModel {
    private Long inventory_id;
    private Long film_id;
    private Long store_id;
    private Date last_update;
}
