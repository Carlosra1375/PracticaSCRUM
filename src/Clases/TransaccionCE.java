/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Carlos
 */
public class TransaccionCE extends Transaccion{
    private Integer EntradaDET;
    private Integer EntradaFicherosReferenciados;
    private Integer SalidaDET;
    private Integer SalidaFicherosReferenciados;
    
    public TransaccionCE(String nombre, String tipo, Integer EntradaDET, Integer EntradaFicherosReferenciados,Integer SalidaDET, Integer SalidaFicherosReferenciados){
        super(nombre,tipo);
        this.EntradaDET = EntradaDET;
        this.EntradaFicherosReferenciados = EntradaFicherosReferenciados;
        this.SalidaDET = SalidaDET;
        this.SalidaFicherosReferenciados = SalidaFicherosReferenciados;
    }
    
    public Integer getEntradaDET() {
        return EntradaDET;
    }

    public void setEntradaDET(Integer EntradaDET) {
        this.EntradaDET = EntradaDET;
    }

    public Integer getEntradaFicherosReferenciados() {
        return EntradaFicherosReferenciados;
    }

    public void setEntradaFicherosReferenciados(Integer EntradaFicherosReferenciados) {
        this.EntradaFicherosReferenciados = EntradaFicherosReferenciados;
    }

    public Integer getSalidaDET() {
        return SalidaDET;
    }

    public void setSalidaDET(Integer SalidaDET) {
        this.SalidaDET = SalidaDET;
    }

    public Integer getSalidaFicherosReferenciados() {
        return SalidaFicherosReferenciados;
    }

    public void setSalidaFicherosReferenciados(Integer SalidaFicherosReferenciados) {
        this.SalidaFicherosReferenciados = SalidaFicherosReferenciados;
    }
    
    
}