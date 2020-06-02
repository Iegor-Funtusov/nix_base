package ua.com.alevel.nix.baseoperations.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.alevel.nix.baseoperations.data.CircleVersusMath;
import ua.com.alevel.nix.baseoperations.data.RangeData;
import ua.com.alevel.nix.baseoperations.service.CircleService;

@Controller
@RequestMapping("/circle")
public class CircleController {

    private final CircleService circleService;

    public CircleController(CircleService circleService) {
        this.circleService = circleService;
    }

    @GetMapping
    public String main() {
        return "circle";
    }

    @PostMapping("/runSum")
    public ResponseEntity<CircleVersusMath> runSum(@RequestBody RangeData data) {
        return ResponseEntity.ok(circleService.runSum(data));
    }

    @PostMapping("/convertStringToNumberAndFindSum")
    public ResponseEntity<Long> convertStringToNumberAndFindSum(@RequestBody String value) {
        return ResponseEntity.ok(circleService.convertStringToNumberAndFindSum(value));
    }
}
