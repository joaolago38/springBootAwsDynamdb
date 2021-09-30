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
public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long staff_id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "email")
    private String email;
    @Column(name = "store_id")
    private String storeId;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "last_update")
    private Date lastUpdate;
    @Column(name = "picture")
    private String picture;
}
