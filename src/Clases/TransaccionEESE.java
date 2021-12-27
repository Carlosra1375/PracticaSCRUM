/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Carlos
 */
public class TransaccionEESE extends Transaccion{
    private Integer DET;
    private Integer FicherosReferenciados;
    
    public TransaccionEESE(String nombre, String tipo, Integer DET, Integer RET){
        super(nombre,tipo);
        this.DET = DET;
        this.FicherosReferenciados = RET;
    }

    public Integer getDET() {
        return DET;
    }

    public void setDET(Integer DET) {
        this.DET = DET;
    }

    public Integer getFicherosReferenciados() {
        return FicherosReferenciados;
    }

    public void setFicherosReferenciados(Integer FicherosReferenciados) {
        this.FicherosReferenciados = FicherosReferenciados;
    } 
}

