/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runner;

import supermercado_hilos.Cashier;
import supermercado_hilos.Customer;

/**
 *
 * @author Cristina
 */
public class Main {
    /**
     * método principal que ejecuta el programa haciendo el llamado a las respectivas clases y métodos. En este caso se realiza con un solo hilo
     * @param args 
     */
    public static void main(String[] args) {

        Customer customerOne = new Customer("1", new int[] { 2, 2, 1, 5, 2, 3 });
        Customer customerTwo = new Customer("2", new int[] { 1, 3, 5, 2, 1 });
        Customer customerThree = new Customer("3", new int[] { 2, 5, 7, 3, 1, 4 });
        Customer customerFour = new Customer("4", new int[] { 4, 6, 1 });
        Customer customerFive = new Customer("5", new int[] { 1, 1, 5, 2, 1, 3 });
        Customer customerSix = new Customer("6", new int[] { 6, 3, 4, 7, 1 });
        Customer customerSeven = new Customer("7", new int[] { 1, 8 });
        Customer customerEight = new Customer("8", new int[] { 2, 3, 5, 4, 1, 3 });
        Customer customerNine = new Customer("9", new int[] { 6, 4, 1, 5, 2, 3});
        Customer customerTen = new Customer("10", new int[] { 4, 3, 1, 2 });

        Cashier cashier = new Cashier("1");

        // Tiempo inicial de referencia
        long firstTime = System.currentTimeMillis();

        cashier.chargeProducts(customerOne, firstTime);
        cashier.chargeProducts(customerTwo, firstTime);
        cashier.chargeProducts(customerThree, firstTime);
        cashier.chargeProducts(customerFour, firstTime);
        cashier.chargeProducts(customerFive, firstTime);
        cashier.chargeProducts(customerSix, firstTime);
        cashier.chargeProducts(customerSeven, firstTime);
        cashier.chargeProducts(customerEight, firstTime);
        cashier.chargeProducts(customerNine, firstTime);
        cashier.chargeProducts(customerTen, firstTime);
    }
}
