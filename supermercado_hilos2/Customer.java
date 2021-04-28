/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado_hilos2;

/**
 *
 * @author Cristina
 */
public class Customer {
    
    private String number;
    private int[] products;
    /**
     * Constructor de la clase
     * @param number recibe el número del cleinte
     * @param products recibe el arreglo de prodcutos en el que cada posición indica el tiempo que se demora el registro de ese producto en esa posición
     */
    public Customer(String number, int[] products) {
        this.number = number;
        this.products = products;
    }
    /**
     * Trae el número de cliente
     * @return 
     */
    public String getNumber() {
        return number;
    }
    /**
     * Permite modificar el número de cliente
     * @param number asigna el valor del número de cliente
     */
    public void setNumber(String number) {
        this.number = number;
    }
    /**
     * Muestra de arreglo de productos con sus tiempos de demora en el registro
     * @return 
     */
    public int[] getProducts() {
        return products;
    }
    /**
     * Permute modificar los productos
     * @param products 
     */
    public void setProducts(int[] products) {
        this.products = products;
    }
    
}
