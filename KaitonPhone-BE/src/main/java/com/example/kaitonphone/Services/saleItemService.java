package com.example.kaitonphone.Services;

import com.example.kaitonphone.DTO.saleItemDTO;
import com.example.kaitonphone.Entity.Saleitem;
import com.example.kaitonphone.Exceptions.ItemNotFound;
import com.example.kaitonphone.Repositories.SaleItemRespository;
import com.example.kaitonphone.utils.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class saleItemService {
    @Autowired
    private SaleItemRespository saleItemRespository;

    @Autowired
    private ListMapper listMapper;


    @Autowired
    private ModelMapper modelMapper;

    public List<saleItemDTO> getAllSaleItemsDTO() {
        return listMapper.mapList(saleItemRespository.findAll(), saleItemDTO.class, modelMapper);
    }

    public Saleitem getSaleItemById(Integer id) {
        return saleItemRespository.getById(id);
    }
    public saleItemDTO getSaleItemDTOById(Integer id) {
        return
                saleItemRespository.findById(id)
                        .map(saleItem -> {

                            saleItemDTO dto = modelMapper.map(saleItem, saleItemDTO.class);
                            dto.setBrandName(saleItem.getBrand().getName());
                            System.out.println(dto.getId());
                            return dto;
                        }).orElseThrow(() -> new ItemNotFound("Not found item id " + id));}}
