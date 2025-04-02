package co.edu.umanizales.myfirstap.controller;

import co.edu.umanizales.myfirstap.model.Sale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sale")
public class SaleController {
    @GetMapping
    public String getsale() {
        Sale sale = new Sale("pizza",(byte) 50 , 20000,"febrero 25 de 2025");
        return "la venta";
    }
}