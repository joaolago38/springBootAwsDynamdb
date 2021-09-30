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
public class LanguageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long languageId;
    @Column(name = "name")
    private String name;
    @Column(name = "last_update")
    private Date lastUpdate;
}
