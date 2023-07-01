/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Guilh
 */
public class Plataforma {
    private int idPlataforma;
    private String plataforma;
    private String ConsolePlat;


    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getConsolePlat() {
        return ConsolePlat;
    }

    public void setConsolePlat(String consolePlat) {
        this.ConsolePlat = consolePlat;
    } 
        @Override
public String toString() {
return getIdPlataforma()+ "-" + getPlataforma();
}
}
