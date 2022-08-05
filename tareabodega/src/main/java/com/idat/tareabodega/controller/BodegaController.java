package com.idat.tareabodega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.tareabodega.dto.BodegaDTO;
import com.idat.tareabodega.dto.ProductoDTO;
import com.idat.tareabodega.entity.Bodega;
import com.idat.tareabodega.service.BodegaService;

@Controller
@RequestMapping("/api/bodega")
public class BodegaController {

	@Autowired
	private BodegaService serv;
	
	@GetMapping("/listar")
	public @ResponseBody List<Bodega> listar() {
		return serv.listar();
	}
	
	@GetMapping("/listarProductos")
	public @ResponseBody List<ProductoDTO> listarProductos() {
		return serv.listarProductos();
	}
}
