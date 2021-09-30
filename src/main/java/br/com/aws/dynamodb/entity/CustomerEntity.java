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
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    @Column(name = "store_id")
    private Long storeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "activebool")
    private Boolean activebool;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "active")
    private Boolean active;
}
