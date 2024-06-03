package com.mit.entity;

import java.time.LocalDate;
import java.util.List;

import com.mit.type.Township;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Invoice {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer invoiceId;
	public String casherNumber;
	public LocalDate data;
    @Enumerated(EnumType.STRING)
	public Township township;
	public String remark;
	
	@OneToMany(mappedBy = "invoice")
	public List<InvoiceDetail> invoiceDetail;

	public Invoice(String casherNumber, LocalDate data, Township township, String remark) {
		super();
		this.casherNumber = casherNumber;
		this.data = data;
		this.township = township;
		this.remark = remark;
	}
	
	 
	
}
