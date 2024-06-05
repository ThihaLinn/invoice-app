package com.mit.method;

import com.mit.dto.InvoiceDetailDto;
import com.mit.dto.InvoiceDto;
import com.mit.entity.Invoice;
import com.mit.response.InvoiceResponse;

import java.util.List;

public interface InvoiceInf {

	public List<InvoiceResponse> getAllInvoice();

	public List<InvoiceDto> searchInvoice(String search);

	public String createInvoice(InvoiceDto InvoiceDto, List<InvoiceDetailDto> invoiceDetailDto);

	public String updateInvoice(Integer id,InvoiceDto InvoiceDto, List<InvoiceDetailDto> invoiceDetailDto);
	
	public String deleteInvoice(Integer id);

}
