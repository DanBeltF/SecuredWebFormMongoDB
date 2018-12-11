/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.webform.persistence;

import edu.eci.arsw.webform.model.UserString;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author dbeltran
 */
public interface WebFormPersistence extends MongoRepository<UserString, String> {

    public List<UserString> findByFecha(String fecha);
}
