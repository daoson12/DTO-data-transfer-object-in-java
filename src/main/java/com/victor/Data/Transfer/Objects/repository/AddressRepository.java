package com.victor.Data.Transfer.Objects.repository;

import com.victor.Data.Transfer.Objects.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
