package br.com.aws.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Adress {
    private Long address_id;
    private String address;
    private String address2;
    private String district;
    private Long city_id;
    private String postal_code;
    private String phone;
    private Date last_update;
}
