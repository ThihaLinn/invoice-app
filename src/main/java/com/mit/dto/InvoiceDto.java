package com.mit.dto;

import java.time.LocalDate;
import java.util.List;

import com.mit.entity.Invoice;
import com.mit.entity.InvoiceDetail;
import com.mit.type.Township;

public record InvoiceDto(
		 String casherNumber,
		 LocalDate date,
		 Township township,
		 String remark
		) {
	
	public Invoice toEntity(InvoiceDto invoiceDto) {
		return new Invoice(invoiceDto.casherNumber,invoiceDto.date(),invoiceDto.township,invoiceDto.remark);
	}

	public static InvoiceDto toDto(Invoice invoice) {
		return new InvoiceDto(invoice.casherNumber,invoice.date,invoice.township,invoice.remark);
	}
	
	

}
