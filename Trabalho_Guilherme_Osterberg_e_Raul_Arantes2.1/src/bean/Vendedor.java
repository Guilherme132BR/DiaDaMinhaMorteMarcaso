/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author Guilh
 */
public class Vendedor {
    private int idVendedor;
    private String nome;
    private String cpf;
    private Date dataNasc;
    private String genero;
    private int fk_usuarios;
    
    
    
    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the fk_usuarios
     */
    public int getFk_usuarios() {
        return fk_usuarios;
    }

    /**
     * @param fk_usuarios the fk_usuarios to set
     */
    public void setFk_usuarios(int fk_usuarios) {
        this.fk_usuarios = fk_usuarios;
    }
    
    
}
