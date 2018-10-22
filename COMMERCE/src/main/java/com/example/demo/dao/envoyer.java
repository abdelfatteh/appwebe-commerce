package com.example.demo.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.web.produitRestservice;

@Controller

public  class envoyer {
	@Autowired
	 produitRestservice prod ;
	
	
	/*public List<produit> listeproduit(){
		return prod.listeproduit() ;
	
	}*/
	@RequestMapping(value="/produits")
	public String pageIndex(Model model){
		
		model.addAttribute("listeProduit", prod.listeproduit());
		return "produits";
		
	}
	
}	