package com.mit.method;

import java.util.List;

import com.mit.dto.InvoiceDetailDto;
import com.mit.entity.InvoiceDetail;

public interface InvoiceDetailInf {
	
	public List<InvoiceDetail> createInvoiceDetail(List<InvoiceDetailDto> InvoiceDetailDtos);
	
	public void updateInvoiceDetail(Integer id,List<InvoiceDetailDto> InvoiceDtos);
	
	public void deleteInvoiceDetail(Integer id);

}
