
package com.example.ms1.controller;

import org.springframework.web.bind.annotation.*;

import com.example.ms1.service.MS1Service;

@RestController
@RequestMapping("/ms1")
public class MS1Controller {

    private final MS1Service ms1Service;

    public MS1Controller(MS1Service ms1Service) {
        this.ms1Service = ms1Service;
    }

    @GetMapping("/add")
    public String add(@RequestParam int a,
                      @RequestParam int b) {

        int result = ms1Service.add(a, b);

        return "MS 1.1 - Additon = " + result;
    }
}
