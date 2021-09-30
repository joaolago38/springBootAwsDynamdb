package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffEntity, Long  > {
}
