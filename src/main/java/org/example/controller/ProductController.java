package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.ProductGetAllResponseDTO;
import org.example.dto.ProductGetByIdResponseDTO;
import org.example.dto.ProductSaveRequestDTO;
import org.example.dto.ProductSaveResponseDTO;
import org.example.manager.ProductManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductManager manager;

     @GetMapping("/getAll")
    private ProductGetAllResponseDTO getAll(){
         return manager.getAll();
     }
    @GetMapping("/getById")
    private ProductGetByIdResponseDTO getByIdFromParam(@RequestParam long id){
        return manager.getById(id);
    }

    @GetMapping("/getById/{id}")
    private ProductGetByIdResponseDTO getByIdFromPath(@PathVariable long id){
        return manager.getById(id);
    }

    @PostMapping("/save")
    private ProductSaveResponseDTO save(@RequestBody ProductSaveRequestDTO requestDTO){
         return manager.save(requestDTO);
    }
    @PostMapping("/removeById")
    private void removeByIdFromParam(@RequestParam long id){
        manager.removeById(id);
    }

    @PostMapping("/removeById/{id}")
    private void removeByIdFromPath(@PathVariable long id){
        manager.removeById(id);
    }
}

