package Roteiro2;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Autor {
    private String autor;
    private LocalDate nasc;
    
    public Autor(String autor){
        this.autor = autor;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the nasc
     */
    public LocalDate getNasc() {
        return nasc;
    }

    /**
     * @param nasc the nasc to set
     */
    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }
    
    @Override
    public String toString(){
        return "Autor: "+this.autor+
                "Data de nascimento"+this.nasc;
    }
}
