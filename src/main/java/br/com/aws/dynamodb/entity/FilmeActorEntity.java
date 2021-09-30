package br.com.aws.dynamodb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FilmeActorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long actorId;
    @Column(name = "film_id")
    private Long filmId;
    @Column(name = "last_update")
    private Date lastUpdate;
}
