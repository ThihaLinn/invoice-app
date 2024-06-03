package com.mit.service;

import org.springframework.stereotype.Service;

import com.mit.dao.InvoiceRepo;
import com.mit.dto.InvoiceDto;
import com.mit.method.InvoiceInf;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InvoiceService implements InvoiceInf {
	
	private final InvoiceRepo invoiceRepo;
	

	@Override
	public String createInvoice(InvoiceDto invoiceDto) {
		var invoice = invoiceDto.toEntity(invoiceDto);
		invoiceRepo.save(invoice);
		return "Successfully created invoice";
	}


	@Override
	public String updateInvoice(Integer id,InvoiceDto invoiceDto) {
		var invoice = invoiceDto.toEntity(invoiceDto);
		invoice.setInvoiceId(id);
		invoiceRepo.save(invoice);
		
		return "Successfully updated invoice";
	}
	
	@Override
	public String deleteInvoice(Integer id) {
		
		if(invoiceRepo.existsById(id)){
			invoiceRepo.deleteById(id);
			return "Successfully deleted invoice";
		}
		
		return "Fail to delete invoice";
		
	}
	
	

}
