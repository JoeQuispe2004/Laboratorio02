/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio02;
/**
 *
 * @author JOEL QUISPE
 */
public class Operaciones {
    private float Elemento01;
    private float Elemento02;
    public Operaciones(float Elemento01, float Elemento02) {
        this.Elemento01 = Elemento01;
        this.Elemento02 = Elemento02;
    }
    /**
     * @return the Elemento01
     */
    public float getElemento01() {
        return Elemento01;
    }
    /**
     * @param Elemento01 the Elemento01 to set
     */
    public void setElemento01(float Elemento01) {
        this.Elemento01 = Elemento01;
    }
    /**
     * @return the Elemento02
     */
    public float getElemento02() {
        return Elemento02;
    }
    /**
     * @param Elemento02 the Elemento02 to set
     */
    public void setElemento02(float Elemento02) {
        this.Elemento02 = Elemento02;
    }public float sumar(){
        return this.Elemento01 + this.Elemento02;
    }public float restar(){
        return this.Elemento01 - this.Elemento02;
    }public float multiplicar(){
        return this.Elemento01 * this.Elemento02;
    }public float dividir(){
        return this.Elemento01 / this.Elemento02;
    }
    
}
