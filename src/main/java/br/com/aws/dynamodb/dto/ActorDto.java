package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActorDto {
    @JsonProperty(value = "actor_id")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long actorId;
    @JsonProperty(value = "actor_id")
    private String firstName;
    @JsonProperty(value = "actor_id")
    private String lastName;
    @JsonProperty(value = "last_update")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Date lastUpdate;
}
