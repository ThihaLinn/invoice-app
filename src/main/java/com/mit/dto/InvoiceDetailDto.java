package com.mit.dto;

import com.mit.entity.InvoiceDetail;

public record InvoiceDetailDto(
		 String item,
		 Integer price,
		 Integer amount
		) {
	
	public InvoiceDetail toEntity(InvoiceDetailDto invDetailDto) {
		return new InvoiceDetail(invDetailDto.item,invDetailDto.amount,invDetailDto.price);
	}

}
