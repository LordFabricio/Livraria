/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.util.Arrays;

/**
 *
 * @author LordFabricio
 */
public class Livros {

    private String titulo;
    private String ISBN;
    private Capitulo[] capitulo;
    private Autor[] autores;

    public Livros(String titulo, String ISBN) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        capitulo = new Capitulo[30];
        autores = new Autor[5];
    }

    public String getTitulo() {
        return titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Capitulo[] getCapitulo() {
        return capitulo;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setCapitulo(Capitulo[] capitulo) {
        this.capitulo = capitulo;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public int addA(Autor autor) {
        for(int i = 0; i < autores.length; i++){
            if (autores[i] == null){
                autores[i] = autor;
                return i;
            }
        }
        return -1;
    }

    public int addCap(String titulo, String texto) {
        Capitulo cap = new Capitulo(titulo, texto);
        for (int i = 0; i < capitulo.length; i++){
            if(capitulo[i] == null){
                capitulo[i] = cap;
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Livros [" + "Titulo.: " + titulo + " Autores.: " + Arrays.toString(autores) + ", ISBN=" + ISBN + "]";
    }

}
