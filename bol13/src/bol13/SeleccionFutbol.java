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
public class SeleccionFutbol {
     private int id;
    private String nome;
    private String apelido;
    private int idade;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nome, String apelido, int idade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
    }
    
    public void Concentracion(){
        
    }
    
    public void Viaxar(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "id= " + id + ", nome= " + nome + ", apelido= " + apelido + ", idade= " + idade ;
}
}