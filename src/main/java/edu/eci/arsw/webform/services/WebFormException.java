/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.webform.services;

/**
 *
 * @author 2104784
 */
public class WebFormException extends Exception {

    public WebFormException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebFormException(String message) {
        super(message);
    }
}
