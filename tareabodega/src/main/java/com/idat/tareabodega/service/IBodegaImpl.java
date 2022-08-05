package com.idat.tareabodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.tareabodega.client.OpenFeignClient;
import com.idat.tareabodega.dto.BodegaDTO;
import com.idat.tareabodega.dto.ProductoDTO;
import com.idat.tareabodega.entity.Bodega;
import com.idat.tareabodega.repository.BodegaRep;

@Service
public class IBodegaImpl implements BodegaService {

	@Autowired
	private BodegaRep rep;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public List<Bodega> listar() {
		return rep.findAll();
	}
	
	@Override
	public List<ProductoDTO> listarProductos() {
		return client.listadoProductos();
	}
}
