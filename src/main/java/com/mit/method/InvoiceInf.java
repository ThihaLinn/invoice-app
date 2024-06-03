package com.mit.method;

import com.mit.dto.InvoiceDto;

public interface InvoiceInf {
	
	public String createInvoice(InvoiceDto InvoiceDto);
	
	public String updateInvoice(Integer id,InvoiceDto InvoiceDto);
	
	public String deleteInvoice(Integer id);

}
