package com.mit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/invoice")
public class InvoiceController {

	public ResponseEntity<String> createInvoice(){
		
		return ResponseEntity.ok("Successfully Create");
		
	}
	
}
