package com.codehookslab.codegen.controllers;

import com.codehookslab.codegen.generators.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/mkdir")
public class CodeGenEntry {

    @Autowired
    private Generator packageGenerator;

    @GetMapping(path = "/{selectedType}")
    public void generatePackages(@PathVariable("selectedType") String type) {
        switch (type) {
            case "layer-wise" : packageGenerator.createPackagesByLayerWise(); break;
            case "entity-wise" : packageGenerator.createPackagesByEntityWise(); break;
            default: break;
        }
    }
}
