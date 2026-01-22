package com.learn.java.OmdbApi.controller;

import com.learn.java.OmdbApi.model.ReturnOmdb;
import com.learn.java.OmdbApi.service.IOmbdService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Valid
@RestController
@RequestMapping("/omdbapi")
public class OmbdApiController {
    @Autowired
    IOmbdService service;

    @GetMapping("/search/{name}")
    public ResponseEntity<ReturnOmdb> search(
            @PathVariable @NotBlank String name) throws IOException, InterruptedException {
        name = name.toLowerCase();
        return ResponseEntity.ok(service.search(name));
    }
}
