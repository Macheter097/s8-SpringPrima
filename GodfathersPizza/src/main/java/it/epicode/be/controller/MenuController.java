package it.epicode.be.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import it.epicode.be.model.FoodItem;
import it.epicode.be.model.Menu;
import it.epicode.be.model.Ordine;

@Controller
public class MenuController {
	@Autowired
	private Menu m;
	
	@GetMapping("/menu")
	public  String hello(Map<String,Object> modello) {
		 List<FoodItem> food = m.getElencoOrdinabili();
	        for (FoodItem f : food) {
	        	
	        	
	        	modello.put("nomeMenu",  f.getName() +" "+ f.getPrezzo()+" " + f.getCalories() );
	        }
		
		
		
		return "vistaMenu";
		
		
		
		
	}
	@GetMapping("/menu3")
	public String menu (Map<String,Object> modello) {
		
		modello.put("nomeMenu2", m);
		
		return "vistaMenu";
		
	}
	
	@GetMapping("/ordini")
	public String ordine (Map<String,Object> modello) {
		
		modello.put("ordini", m);
		modello.put("ordine", new Ordine());
		return "vistaOrdini";
		
	}
	
//	@GetMapping("/salutiParametro")
//	public @ResponseBody String hello2(@RequestParam String nome) {
//		
//	}
	
	
	 
	@RequestMapping(value="/numOrdine",method=RequestMethod.POST)
    public String ricezioneDati(@Valid @ModelAttribute("ordine") Ordine al,BindingResult datiRichiesta,ModelMap modello, @RequestParam int numeroOrdine ) {
        
        al = m.ordineDaId(numeroOrdine);
        
        modello.addAttribute("numeroOrdine",al.getCoperti() + al.getTotaleConto() + al.getStato().toString() );
        
        
       
        
        return "ordine";
    }
	
//	@RequestMapping(value="/statoOrdine",method=RequestMethod.POST)
 ///   public String setStatoOrdine(@Valid @ModelAttribute("ordine") Ordine al,BindingResult datiRichiesta,ModelMap modello, @RequestParam int statoOrd ) {
        
       
  //      al.modificaStatoOrdine(statoOrd);
   //     modello.addAttribute("statoOrdine",al.getCoperti() + al.getTotaleConto() + al.getStato().toString() );
        
        
       
        
    //    return "ordine";
   // }
	
	
}
