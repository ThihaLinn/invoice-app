package com.mit.dto;

import com.mit.entity.InvoiceDetail;

public record InvoiceDetailDto(
		 Integer id,
		 String item,
		 Integer price,
		 Integer amount
		) {
	
	public static InvoiceDetail toEntity(InvoiceDetailDto invDetailDto) {
		return new InvoiceDetail(invDetailDto.item,invDetailDto.amount,invDetailDto.price);
	}

	public static InvoiceDetailDto toDto(InvoiceDetail invDetail) {
		return new InvoiceDetailDto(invDetail.invoiceDetailId,invDetail.item,invDetail.price,invDetail.amount);
	}

}
