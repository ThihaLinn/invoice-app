package com.mit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.entity.Invoice;

public interface InvoiceRepo extends JpaRepository<Invoice, Integer> {

	
	
}
