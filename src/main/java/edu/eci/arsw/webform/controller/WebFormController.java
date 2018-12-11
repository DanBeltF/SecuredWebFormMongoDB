/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.webform.controller;


import edu.eci.arsw.webform.services.WebFormServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2104784
 */
@RestController
@RequestMapping("/strings")
public class WebFormController {
    
    @Autowired
    private WebFormServices ss;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getStrings() {
        try {
            return new ResponseEntity<>(ss.getStrings(), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al obtener las cadenas." + e, HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> setStrings(@RequestBody String texto) {
        try {
            ss.addString(texto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error al agregar la cadena: " + texto, HttpStatus.FORBIDDEN);
        }
    }
}
