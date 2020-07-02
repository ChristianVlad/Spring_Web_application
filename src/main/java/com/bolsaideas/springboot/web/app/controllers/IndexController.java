package com.bolsaideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsaideas.springboot.web.app.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {

	@RequestMapping({"/index", "/", "/home"}  )
	public String index(Model model) {
		model.addAttribute("titulo", "hola spring framework");
		return "index";
	}
	
	@RequestMapping({"/perfil" , "/profile"})
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Christian ");
		usuario.setApellido("Peña");
		usuario.setEmail("Christian.valladarezz@gmail.com");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "perfil de usuario: ".concat(usuario.getNombre( )).concat(usuario.getApellido()) );
		model.addAttribute("email", "Email:".concat(usuario.getEmail()));
		return "perfil";
		
	}
	
	@RequestMapping("/lista")
	public String lista(Model model) {
		List<Usuario> usuarios = new ArrayList<>();
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuarios);
		
		return "lista";
		
	}
	
	
}
