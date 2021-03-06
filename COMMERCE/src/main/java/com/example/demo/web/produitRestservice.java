package com.example.demo.web;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.produitRepository;
import com.example.demo.entity.produit;

@RestController
public class produitRestservice {
	@Autowired
private produitRepository produitRepository ;
	/*affiche list de produit*/
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<produit> listeproduit(){
		return produitRepository.findAll();
	
	}

/*	affiche un produit d'apres id
*/	@RequestMapping(value="/produits/{id}",method=RequestMethod.GET)
	public produit getproduit(@PathVariable(name="id") int id){
		return produitRepository.findOne(id);
	}
/*ajoute un produit*/
@RequestMapping(value="/produitst",method=RequestMethod.POST)
public produit save(@RequestBody produit p){
	return produitRepository.save(p);
}
/*mise a jour*/
@RequestMapping(value="/produits/{id}",method=RequestMethod.PUT)
public produit update(@PathVariable(name="id") int id,@RequestBody produit p){
	p.setId(id);
	return produitRepository.save(p);
}

}
