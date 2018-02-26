 package cm.skydev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cm.skydev.dao.CategorieRepository;
import cm.skydev.entites.Categorie;

@Controller
@RestController
@CrossOrigin
@RequestMapping(value="/Categories")
public class CategorieService {

	@Autowired
	private CategorieRepository categorie;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public List<Categorie> touteCategorie(){
		return categorie.findAll();
	}
	
	@RequestMapping(value="/index/{id}",method=RequestMethod.GET)
	public Categorie UniqCategorie(@PathVariable long id){
		return categorie.findOne(id);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Categorie save(@RequestBody Categorie cat){
	
		return categorie.save(cat);
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.POST)
	public Categorie update(@RequestBody Categorie cat,@PathVariable long id){
		cat.setId(id);
		return categorie.saveAndFlush(cat);
	}
	
	@RequestMapping(value="/delete/{code}",method=RequestMethod.GET)
	public Categorie suppression(@PathVariable String code){
		return categorie.suppression(code);
	}
}
