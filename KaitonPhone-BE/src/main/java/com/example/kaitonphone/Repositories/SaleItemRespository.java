package com.example.kaitonphone.Repositories;

import com.example.kaitonphone.Entity.Saleitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleItemRespository extends JpaRepository<Saleitem, Integer> {


}
