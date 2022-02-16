package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class RentalDto {

    @JsonProperty(value = "rental_id")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long rental_id;
    @JsonProperty(value = "rentalDate")
    private Date rentalDate;
    @JsonProperty(value = "returnDate")
    private Date returnDate;
    @JsonProperty(value = "customerId")
    private Long customerId;
    @JsonProperty(value = "staffId")
    private Long staffId;
    @JsonProperty(value = "inventoryId")
    private Long inventoryId;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;
}
