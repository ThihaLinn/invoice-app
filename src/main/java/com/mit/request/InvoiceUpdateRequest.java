package com.mit.request;

import java.time.LocalDate;
import java.util.List;

import com.mit.dto.InvoiceDetailDto;
import com.mit.type.Township;

public record InvoiceUpdateRequest(
        Integer invoiceId,
        String casherNumber,
        LocalDate date,
        Township township,
        String remark,
        List<InvoiceDetailDto> invoiceDetailDtos
) {
}
