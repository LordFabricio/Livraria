/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.util.Objects;

/**
 *
 * @author LordFabricio
 */
public class Capitulo {
    
    String titulo;
    String texto;
    
    public Capitulo() {
        
    }
    
    public Capitulo(String titulo, String texto){
        this.titulo = titulo;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.titulo);
        hash = 67 * hash + Objects.hashCode(this.texto);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Capitulo other = (Capitulo) obj;
        if(!Objects.equals(this.titulo, other.titulo)){
            return false;
        }
        if(!Objects.equals(this.texto, other.texto)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
}
