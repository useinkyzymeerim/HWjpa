package com.example.demo.controller;
import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/laptops")
public class LaptopController {
    private final LaptopService laptopService;


    @GetMapping("getAllLaptops")
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Laptop> getLaptopById(@PathVariable int id) {
    Laptop laptop = laptopService.getLaptopById(id);
    return ResponseEntity.ok(laptop);
    }

    @PostMapping
    public ResponseEntity<String> saveLaptop(@RequestBody Laptop laptopRequest) {
    laptopService.saveLaptop(laptopRequest);
    return ResponseEntity.ok("laptop saved successfully!");
        }

    @PutMapping("updateLaptop")
    public void updateLaptop(@RequestBody Laptop laptop){
    laptopService.updateLaptop(laptop);

    }
    @DeleteMapping("deleteLaptop/{laptopId}")
    public void deleteLaptop(@PathVariable Integer laptopId){
    laptopService.deleteLaptop(laptopId);
    }


}
