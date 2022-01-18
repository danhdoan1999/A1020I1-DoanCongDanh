package com.example.repository;

import com.example.model.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
    @Query("select cd from ContractDetail cd where cd.contract.customer.name like ?1 or cd.contract.customer.customerId like ?2")
    Page<ContractDetail> findAllByCustomer_NameOrCustomer_CustomerId(String nameCus, String idCus , Pageable pageable);
}
