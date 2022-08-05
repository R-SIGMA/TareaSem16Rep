package com.idat.tareabodega.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.tareabodega.dto.BodegaDTO;
import com.idat.tareabodega.entity.Bodega;
import com.idat.tareabodega.repository.BodegaRep;

@Service
public class BodegaServiceImpl implements BodegaService {

	@Autowired
	private BodegaRep rep;
	
	@Override
	public List<BodegaDTO> listarProductos() {
		List<BodegaDTO> list = new ArrayList<BodegaDTO>();
		
		for(Bodega bodega : rep.findAll()) {
			BodegaDTO b = new BodegaDTO();
			b.setIdBodega(bodega.getIdBodega());
			b.setNombre(bodega.getNombre());
			b.setDireccion(bodega.getDireccion());
			
			list.add(b);
		}
		return list;
	}

}
