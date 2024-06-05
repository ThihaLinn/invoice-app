package com.mit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.entity.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InvoiceRepo extends JpaRepository<Invoice, Integer> {

	@Query("SELECT i FROM Invoice i WHERE i.invoiceId=?1 OR i.casherNumber = ?2")
	List<Invoice> findByInvoiceNameLikeAndCashierNumber(String keyword1,String keyword2);
	
}
