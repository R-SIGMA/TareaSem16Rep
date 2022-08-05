package com.idat.tareabodega.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.tareabodega.dto.ProductoDTO;

@FeignClient(name="idat_producto", url="localhost:8090")
public interface OpenFeignClient {

	@GetMapping("/producto")
	public List<ProductoDTO> listadoProductos();
	
}
