package com.projetojava.erp.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import com.projetojava.erp.model.RamoAtividade;

public class RamoAtividades implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public RamoAtividades() {
		
	}

	public RamoAtividades(EntityManager manager) {
		this.manager = manager;
	}
	public List<RamoAtividade> pesquisar(String descricao) {
		return null;
		
	}
}
