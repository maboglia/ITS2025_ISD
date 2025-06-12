package com.maboglia.ortofrutta.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.maboglia.ortofrutta.entities.Prodotto;
import com.maboglia.ortofrutta.services.ProdottoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ProdottiMVC {

    @Autowired
    private ProdottoService service;

    @GetMapping({"/", "/home"})
    public String home() {
        return "index";
    }
    

    @GetMapping("prodotti")
    public String getMethodName(Model m) {
        
        m.addAttribute("prodotti", service.getProdotti());
        service.getProdotti().stream().forEach(System.out::println);

        return "prodotti";
    }
    
    @GetMapping("prodotti/add")
    public String showForm() {
        return "addProdotto";
    }


    @PostMapping("prodotti/add")
    public String postMethodName(Prodotto p) {
        service.addProdotto(p);
        
        return "redirect:/prodotti/add";
    }
    


}
