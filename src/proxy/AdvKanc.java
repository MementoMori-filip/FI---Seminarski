/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author filip_000
 */
public abstract class AdvKanc {
    Sastav sas;
    Sporazum sp;
    Tuzba tt;
    
    abstract void kreirajSporazum();
    abstract void kreirajTuzbu();
    abstract void kreirajSastav();
    abstract String vratiSastav();
}
