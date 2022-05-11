package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Long> {



}
