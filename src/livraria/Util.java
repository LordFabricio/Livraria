/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author LordFabricio
 */
public class Util {
    
    public static String ents (String s) throws Exception {
        String es;
        Scanner ent = new Scanner(System.in);
        System.out.print(s);
        es = ent.nextLine();
        return es;
    }
    
    public static int enti (String i) throws Exception {
        int ei = 0;
        Scanner ent = new Scanner(System.in);
        System.out.print(i);
        ei = ent.nextInt();
        return ei;
    }
    
    public static LocalDate entd (String d) throws Exception {
        try {
            String[] pdata = ents(d).split("/");
            return LocalDate.of(Integer.parseInt(pdata[2]), Integer.parseInt(pdata[1]), Integer.parseInt(pdata[0]));
        } catch (Exception ex) {
            throw new Exception("Formato Invalido, Usar DD/MM/AAAA");
        }
    }
}
