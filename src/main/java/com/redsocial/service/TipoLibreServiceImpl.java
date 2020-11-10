package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Grado;
import com.redsocial.entity.TipoLibro;
import com.redsocial.repository.GradoRepository;
import com.redsocial.repository.TipoLibroRepository;

@Service
public class TipoLibreServiceImpl implements TipoLibroService{

	@Autowired
	private TipoLibroRepository repository;
	
	@Override
	public List<TipoLibro> listaTipoLibro() {
		return repository.findAll();
	}

	

}
