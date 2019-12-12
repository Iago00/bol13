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
public class Masaxista  extends SeleccionFutbol{
     private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int idade) {
        super(id, nome, apelido, idade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void Concentracion(){
        System.out.println("O masaxista está concentrado");    
    }
    
    public void Viaxar(){
        System.out.println("O masaxista viaxa co equipo");
    }
    
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia ;
}
}