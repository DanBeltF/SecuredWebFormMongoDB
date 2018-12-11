/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.webform.services;

import edu.eci.arsw.webform.model.UserString;
import edu.eci.arsw.webform.persistence.WebFormPersistence;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

/**
 *
 * @author dbeltran
 */
@Service
public class WebFormServicesImpl implements WebFormServices {
    @Autowired
    WebFormPersistence repositorio;

    @Override
    public void addString(String texto) {
        repositorio.save(new UserString(texto));
    }

    @Override
    public List<UserString> getStrings() {
        return repositorio.findAll(new Sort(Direction.DESC, "fecha"));
    }
}
