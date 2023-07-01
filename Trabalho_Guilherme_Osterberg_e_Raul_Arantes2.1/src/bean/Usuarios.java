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
public class Usuarios {
    
    private int IdUsuarios;
    private String Nome;
    private String Apelido;
    private String Cpf;
    private Date DataNasc;
    private String Senha;
    private int Nivel;
    private String Ativo;

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return IdUsuarios;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuarios(int idUsuarios) {
        this.IdUsuarios = idUsuarios;
    }
    
    public int getIdUsuarios() {
    
        return IdUsuarios;
        
    };

    /**
     * @return the nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.Nome = nome;
    }

    /**
     * @return the apelido
     */
    public String getApelido() {
        return Apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.Apelido = apelido;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return Cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.Cpf = cpf;
    }

    /**
     * @return the dataNasc
     */
    public Date getDataNasc() {
        return DataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(Date dataNasc) {
        this.DataNasc = dataNasc;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.Senha = senha;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return Nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.Nivel = nivel;
    }

    /**
     * @return the ativo
     */
    public String getAtivo() {
        return Ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(String ativo) {
        this.Ativo = ativo;
    }
    @Override
public String toString() {
return getIdUsuarios()+ "-" + getNome();
}

    // PURA INSERÇÃO DE N SEI OQ SO TAVA APERTANDO PRA FAZER OS ERROS SUMIREM HDKFJGHKDFJGHKDFJGHDKFJGHKDFJGHKDFJGHDKFGH
   



    
    
    
    
}
