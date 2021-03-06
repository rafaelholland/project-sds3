package com.devsuperior.dsvendas.controllers;
import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.services.SaleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleServices service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
