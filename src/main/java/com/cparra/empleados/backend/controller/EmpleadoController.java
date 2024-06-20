package com.cparra.empleados.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cparra.empleados.backend.service.IEmpleadoService;

@Controller
@RequestMapping("/")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService service;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("list", service.buscar());
		return "index";
	}
	
}
