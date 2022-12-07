/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labrepop1_dannacasco;

/**
 *
 * @author Danna Casco
 */
public class carro {
public String VIN;
    public String marca;
    public String modelo;
    public String color;
    public String ao;

    public carro(String VIN, String marca, String modelo, String color, String ao) {
        this.VIN = VIN;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ao = ao;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAo() {
        return ao;
    }

    public void setAo(String ao) {
        this.ao = ao;
    }  
    
}
