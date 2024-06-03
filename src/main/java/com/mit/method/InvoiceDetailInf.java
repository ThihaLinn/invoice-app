package com.mit.method;

import java.util.List;

import com.mit.dto.InvoiceDetailDto;
import com.mit.entity.InvoiceDetail;

public interface InvoiceDetailInf {
	
	public List<InvoiceDetail> createInvoiceDetail(List<InvoiceDetailDto> InvoiceDetailDtos);
	
	public String updateInvoiceDetail(Integer id,List<InvoiceDetailDto> InvoiceDtos);
	
	public String deleteInvoiceDetail(Integer id);

}
