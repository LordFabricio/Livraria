package Roteiro2;

import java.util.ArrayList;

public class Capitulo {
    private String titulo;
    private String texto;
    private String armaz = "";
    
    private ArrayList<String> capitulo = new ArrayList();
    private ArrayList<String> title = new ArrayList();
    private ArrayList<String> text = new ArrayList();

    public Capitulo(String titulo, String texto){
        this.titulo = titulo;
        this.texto = texto;
    }
    
    public Capitulo(){
        
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo; //Atribui valores ao titulo
        title.add(this.titulo); //armazena titulo em array de titulos
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto; 
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto; //Atribui valores ao texto
        text.add(this.texto); // Armazena valores ao texto
    }
    
    public void Armazena(){
        this.armaz = this.titulo + "\n" + this.texto; // Poem titulo na primeira
        //linha, texto nas demais
        capitulo.add(this.armaz); //Adiciona capitulo(titulo e texto) em array
        //de capitulos
    }
    
    public void Mostrar(int i){ //recebe inteiro de um for por parametro e 
        capitulo.get(i); //mostra os capitulos da posição i 
    }
    
}

