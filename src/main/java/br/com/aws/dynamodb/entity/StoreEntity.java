package br.com.aws.dynamodb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeId;
    @Column(name = "manager_staff_id")
    private Long managerStaffId;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "first_name")
    private Long lastUpdate;
}
