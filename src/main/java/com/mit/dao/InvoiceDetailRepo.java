package com.mit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.entity.InvoiceDetail;

public interface InvoiceDetailRepo extends JpaRepository<InvoiceDetail, Integer> {

}
