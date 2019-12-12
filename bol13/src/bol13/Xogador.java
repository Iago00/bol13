/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol13;

/**
 *
 * @author ipampillonvieitez
 */
public class Xogador extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, int idade) {
        super(id, nome, apelido, idade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void Concentracion(){
        System.out.println("Os xogadores están concentrados");
    }
    
    public void Viaxar(){
        System.out.println("Os xogadores viaxan");
    }
    
    public int getDorsal() {
        return dorsal;
    }
}

