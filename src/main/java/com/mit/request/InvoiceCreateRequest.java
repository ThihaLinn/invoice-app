package com.mit.request;

import com.mit.dto.InvoiceDetailDto;
import com.mit.type.Township;

import java.time.LocalDate;
import java.util.List;

public record InvoiceCreateRequest(
        String casherNumber,
        LocalDate date,
        Township township,
        String remark,
        List<InvoiceDetailDto> invoiceDetailDtos
)  {
}
