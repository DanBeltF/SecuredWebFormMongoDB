/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.webform.services;

import edu.eci.arsw.webform.model.UserString;
import java.util.List;

/**
 *
 * @author dbeltran
 */
public interface WebFormServices {

    public void addString(String texto);

    public List<UserString> getStrings();
}
