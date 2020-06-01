package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;

@Service
public class ProduitMockErviceImpl implements IProduitService {

	private List<Produit> produits;
	public ProduitMockErviceImpl() {
		produits = new ArrayList<Produit>();
		
		produits.add(new Produit("livre", 50, 20));
		produits.add(new Produit("cahier", 200, 5.6f));
		produits.add(new Produit("stylo", 48, 2.10f));
	}
	

	@Override
	public List<Produit> getProduits() {
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(String ref) {
		Produit produit = new Produit();
		produit.setRef(ref);
		produits.remove(produit);
		
	}

}
