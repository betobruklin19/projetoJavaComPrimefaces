package com.projetojava.erp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projetojava.erp.model.Empresa;

public class SchemaGeneration {

	public static void main (String [] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetojava");
	
		EntityManager em = emf.createEntityManager();
		
		List<Empresa> lista = em.createQuery("from Empresa", Empresa.class).getResultList();
		
		System.out.print(lista);
		
		em.close();
		emf.close();
		
	}	
}
