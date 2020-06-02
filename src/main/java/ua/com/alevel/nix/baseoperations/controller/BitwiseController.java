package ua.com.alevel.nix.baseoperations.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.alevel.nix.baseoperations.data.BitwiseRequestData;
import ua.com.alevel.nix.baseoperations.data.BitwiseResponseData;
import ua.com.alevel.nix.baseoperations.service.BitwiseService;

@Controller
@RequestMapping("/bitwise")
public class BitwiseController {

    private final BitwiseService bitwiseService;

    public BitwiseController(BitwiseService bitwiseService) {
        this.bitwiseService = bitwiseService;
    }

    @GetMapping
    public String main() {
        return "bitwise";
    }

    @PostMapping
    public ResponseEntity<BitwiseResponseData> convert(@RequestBody BitwiseRequestData data) {
        return ResponseEntity.ok(bitwiseService.runProcess(data));
    }
}
