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

    public class Vendas {
   private int idVendas;
   private Date dataVendas; 
   private int fk_Cliente; 
   private int fk_Vendedor;
   private double total;

    public Vendas() {
    }

    /**
     * @return the idVendas
     */
    public int getIdVendas() {
        return idVendas;
    }

    /**
     * @param idVendas the idVendas to set
     */
    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    /**
     * @return the data
     */
    public Date getDataVendas() {
        return dataVendas;
    }

    /**
     * @param dataVendas the dataVendas to set
     */
    public void setDataVendas(Date dataVendas) {
        this.dataVendas = dataVendas;
    }

    /**
     * @return the fk_Cliente
     */
    public int getFk_Cliente() {
        return fk_Cliente;
    }

    /**
     * @param fk_Cliente the fk_Cliente to set
     */
    public void setFk_Cliente(int fk_Cliente) {
        this.fk_Cliente = fk_Cliente;
    }

    /**
     * @return the fk_Vendedor
     */
    public int getFk_Vendedor() {
        return fk_Vendedor;
    }

    /**
     * @param fk_Vendedor the fk_Vendedor to set
     */
    public void setFk_Vendedor(int fk_Vendedor) {
        this.fk_Vendedor = fk_Vendedor;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    }
