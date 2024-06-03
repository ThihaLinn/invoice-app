package com.mit.dto;

import java.time.LocalDate;

import com.mit.entity.Invoice;
import com.mit.type.Township;

public record InvoiceDto(
		 String casherNumber,
		 LocalDate date,
		 Township township,
		 String remark
		) {
	
	public Invoice toEntity(InvoiceDto invoiceDto) {
		return new Invoice(invoiceDto.casherNumber,invoiceDto.date,invoiceDto.township,invoiceDto.remark);
	}
	
	

}
