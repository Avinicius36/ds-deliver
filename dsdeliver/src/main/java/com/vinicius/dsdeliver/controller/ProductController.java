package com.vinicius.dsdeliver.controller;

import com.vinicius.dsdeliver.dto.ProductDTO;
import com.vinicius.dsdeliver.services.ProductService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {
        List<ProductDTO> list = service.findAll();

        ResponseEntity<List<ProductDTO>> response = ResponseEntity.ok(service.findAll());
        return response;
    }

}
