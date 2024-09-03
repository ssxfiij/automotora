/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utonomora;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private int id_vehiculos, precio;
    private String patente, marca, modelo, color;
    private Categoria_vehiculo categoria_vehiculo;

    public Vehiculo() {
    }

    public Vehiculo(int id_vehiculos, int precio, String patente, String marca, String modelo, String color, Categoria_vehiculo categoria_vehiculo) {
        this.id_vehiculos = id_vehiculos;
        this.precio = precio;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.categoria_vehiculo = categoria_vehiculo;
    }

    public int getId_vehiculos() {
        return id_vehiculos;
    }

    public void setId_vehiculos(int id_vehiculos) {
        this.id_vehiculos = id_vehiculos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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

    public Categoria_vehiculo getCategoria_vehiculo() {
        return categoria_vehiculo;
    }

    public void setCategoria_vehiculo(Categoria_vehiculo categoria_vehiculo) {
        this.categoria_vehiculo = categoria_vehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "id_vehiculos=" + id_vehiculos + ", precio=" + precio + ", patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", categoria_vehiculo=" + categoria_vehiculo + '}';
    }
          
    public double CalcularPrecioVehiculoConIva(){
        if(precio > 0){
        return precio * 1.19;
    }else{
        return 0;
    }
    
       public void calcularDescuento(){
            double descuento = 0;
           if (precio > 1500){
               descuento = precio * 0.4;
               System.out.println("El precio final es de: " + descuento);
           }else{
                System.out.println("No hay descuento!!!");
       
       }
     //60%
        public void calcularDescuento(){
            double descuento = 0;
           if (CalcularPrecioVehiculoConIva() > 1500){
               descuento = CalcularPrecioVehiculoConIva * 0.4;
               System.out.println("El precio final es de: " + descuento);
           }else{
                System.out.println("No hay descuento!!!");
       
       }
    
    
}
