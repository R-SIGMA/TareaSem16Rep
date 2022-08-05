package com.idat.tareabodega.service;

import java.util.List;

import com.idat.tareabodega.dto.BodegaDTO;
import com.idat.tareabodega.dto.ProductoDTO;
import com.idat.tareabodega.entity.Bodega;

public interface BodegaService {
	
	List<Bodega> listar();
	List<ProductoDTO> listarProductos();
}
