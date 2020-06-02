package ua.com.alevel.nix.baseoperations.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.alevel.nix.baseoperations.data.PrimitiveInputValue;
import ua.com.alevel.nix.baseoperations.service.PrimitiveTypesService;

@Controller
@RequestMapping("/primitive")
public class PrimitiveTypesController {

    private final PrimitiveTypesService primitiveTypesService;

    public PrimitiveTypesController(PrimitiveTypesService primitiveTypesService) {
        this.primitiveTypesService = primitiveTypesService;
    }

    @GetMapping
    public String main() {
        return "base_types";
    }

    @PostMapping
    public ResponseEntity<String> convert(@RequestBody PrimitiveInputValue input) {
        return ResponseEntity.ok(primitiveTypesService.convertPrimitiveTypeToBinary(input));
    }
}
