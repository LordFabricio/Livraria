/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.time.LocalDate;

/**
 *
 * @author LordFabricio
 */
public class Autor {
    
    String nome;
    LocalDate datan;
    
    public Autor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDatan() {
        return datan;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDatan(LocalDate datan) {
        this.datan = datan;
    }

    @Override
    public String toString() {
        return "[" + "Nome.: " + nome + ']';
    }
    
    
}
