package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Invoice;
import com.example.demo.services.InvoiceManager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin
public class InvoiceController {

	@Autowired
	private InvoiceManager i_manager;
	@GetMapping("/invoice/{id}") 
	public Optional<Invoice> getbillingbybookid(@PathVariable int id) {
		return i_manager.getbillingbybookid(id);
	}
	@PostMapping("/invoice")
	public void addInvoice(@RequestBody Invoice invoice)
	{
		i_manager.addInvoice(invoice);
	}
	
}
