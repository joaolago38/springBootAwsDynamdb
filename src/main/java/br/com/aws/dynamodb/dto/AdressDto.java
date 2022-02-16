package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdressDto {

    @JsonProperty(value = "addressId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long addressId;
    @JsonProperty(value = "address")
    private String address;
    @JsonProperty(value = "address")
    private String address2;
    @JsonProperty(value = "address2")
    private String district;
    @JsonProperty(value = "cityId")
    private Long cityId;
    @JsonProperty(value = "postalCode")
    private String postalCode;
    @JsonProperty(value = "phone")
    private String phone;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;
}
