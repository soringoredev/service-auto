package com.example.service_auto.rest;

import com.example.service_auto.common.Mecanic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarServiceController {

    private Mecanic mecanicDiesel;
    private Mecanic mecanicBenzina;

    public CarServiceController(@Qualifier("mecanicReparaDiesel") Mecanic mecanicDiesel,
                                @Qualifier("mecanicReparaBenzina") Mecanic mecanicBenzina) {
        this.mecanicDiesel = mecanicDiesel;
        this.mecanicBenzina = mecanicBenzina;
    }

   @GetMapping("/repara")
    public String reparaMasina(@RequestParam String tipMecanic) {
       System.out.println("Masina a fost adusa la auto service ...");

       if("diesel".equalsIgnoreCase(tipMecanic)){
           mecanicDiesel.reparaMasina();
           return "Mecanic Diesel: repar o masina pe diesel.";
       } else if("benzina".equalsIgnoreCase(tipMecanic)) {
           mecanicBenzina.reparaMasina();
           return "Mecanic Benzina: repar o masina pe benzina.";
       } else {
           return "Masina este pe gaz! :D :D ";
       }

   }
}
