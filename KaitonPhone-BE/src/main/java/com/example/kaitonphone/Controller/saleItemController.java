package com.example.kaitonphone.Controller;

import com.example.kaitonphone.DTO.saleItemDTO;
import com.example.kaitonphone.Entity.Saleitem;
import com.example.kaitonphone.Services.saleItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class saleItemController {
    @Autowired
    private saleItemService saleItemService;
    @GetMapping("")
    public ResponseEntity<List<saleItemDTO>> getAllSaleItemsDTO() {
        List<saleItemDTO> saleitems = saleItemService.getAllSaleItemsDTO();
        return ResponseEntity.status(HttpStatus.OK).body(saleitems);
    }
    @GetMapping("/{id}")
    public saleItemDTO getSaleItemDTOById(@PathVariable Integer id) {
        saleItemDTO saleitemDTO = saleItemService.getSaleItemDTOById(id);
        return saleitemDTO;
    }
}
