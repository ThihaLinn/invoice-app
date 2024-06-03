package com.mit.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mit.dao.InvoiceDetailRepo;
import com.mit.dto.InvoiceDetailDto;
import com.mit.entity.InvoiceDetail;
import com.mit.method.InvoiceDetailInf;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class InvoiceDetailService implements InvoiceDetailInf{
	
	private final InvoiceDetailRepo invoiceDetailRepo;

	@Override
	public List<InvoiceDetail> createInvoiceDetail(List<InvoiceDetailDto> invoiceDetailDtos) {
		var allInvoiceDetails = invoiceDetailDtos.stream().map(invoice ->invoice.toEntity(invoice)).collect(Collectors.toList());
		var invoiceDetails = invoiceDetailRepo.saveAll((Iterable<InvoiceDetail>) allInvoiceDetails);
		return invoiceDetails;
	}

	@Override
	public String updateInvoiceDetail(Integer id, List<InvoiceDetailDto> InvoiceDetailDtos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteInvoiceDetail(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
