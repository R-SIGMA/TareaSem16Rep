package com.idat.tareabodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.tareabodega.entity.Bodega;

@Repository
public interface BodegaRep extends JpaRepository<Bodega, Integer> {

}
