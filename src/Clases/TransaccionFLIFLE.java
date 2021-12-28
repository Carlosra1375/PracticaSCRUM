/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Carlos
 */
public class TransaccionFLIFLE extends Transaccion{
    
    private Integer DET;
    private Integer RET;
    
    public TransaccionFLIFLE(String nombre, String tipo, Integer DET, Integer RET){
        super(nombre,tipo);
        this.DET = DET;
        this.RET = RET;
    }

    public Integer getDET() {
        return DET;
    }

    public void setDET(Integer DET) {
        this.DET = DET;
    }

    public Integer getRET() {
        return RET;
    }

    public void setRET(Integer RET) {
        this.RET = RET;
    }  
}
