/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runner;

import supermercado_hilos2.Cashier;
import supermercado_hilos2.Customer;

/**
 *
 * @author Cristina
 */
public class Main implements Runnable{
    
    private Customer customer;
    private Cashier cashier;
    private long firstTime;
    /**
     * Constructor de clase
     * @param customer asigna los datos del cliente
     * @param cashier asigna los datos de la cajera
     * @param firstTime asigna el tiempo inicial en atención al cliente
     */
    public Main(Customer customer, Cashier cashier, long firstTime) {
        this.customer = customer;
        this.cashier = cashier;
        this.firstTime = firstTime;
    }
    /**
     * método principal que ejecuta el programa haciendo el llamado a las respectivas clases y métodos, así como la creación y gestión de los hilos
     * @param args 
     */
    public static void main(String[] args) {

        Customer customerOne = new Customer("1", new int[] { 2, 2, 1, 5, 2, 3 });
        Customer customerTwo = new Customer("2", new int[] { 1, 3, 5, 1, 1 });
        Customer customerThree = new Customer("3", new int[] { 2, 5, 7, 3, 1, 4 });
        Customer customerFour = new Customer("4", new int[] { 4, 6, 1 });
        Customer customerFive = new Customer("5", new int[] { 1, 1, 5, 2, 1, 3 });
        Customer customerSix = new Customer("6", new int[] { 6, 3, 4, 7, 1 });
        Customer customerSeven = new Customer("7", new int[] { 1, 8 });
        Customer customerEight = new Customer("8", new int[] { 2, 3, 5, 4, 1, 3 });
        Customer customerNine = new Customer("9", new int[] { 6, 4, 1, 5, 2, 3});
        Customer customerTen = new Customer("10", new int[] { 4, 3, 1, 2 });

        Cashier cashierOne = new Cashier("1");
        Cashier cashierTwo = new Cashier("2");
        Cashier cashierThree = new Cashier("3");
        Cashier cashierFour = new Cashier("4");
        Cashier cashierFive = new Cashier("5");
        Cashier cashierSix = new Cashier("6");
        Cashier cashierSeven = new Cashier("7");
        Cashier cashierEight = new Cashier("8");
        Cashier cashierNine = new Cashier("9");
        Cashier cashierTen = new Cashier("10");

        // Tiempo inicial de referencia
        long firstTime = System.currentTimeMillis();
        
        Runnable billingOne = new Main(customerOne, cashierOne, firstTime);
        Runnable billingTwo = new Main(customerTwo, cashierTwo, firstTime);
        Runnable billingThree = new Main(customerThree, cashierThree, firstTime);
        Runnable billingFour = new Main(customerFour, cashierFour, firstTime);
        Runnable billingFive = new Main(customerFive, cashierFive, firstTime);
        Runnable billingSix = new Main(customerSix, cashierSix, firstTime);
        Runnable billingSeven = new Main(customerSeven, cashierSeven, firstTime);
        Runnable billingEight = new Main(customerEight, cashierOne, firstTime);
        Runnable billingNine = new Main(customerNine, cashierTwo, firstTime);
        Runnable billingTen = new Main(customerTen, cashierThree, firstTime);
        
        new Thread(billingOne).start();
        new Thread(billingTwo).start();
        new Thread(billingThree).start();
        new Thread(billingFour).start();
        new Thread(billingFive).start();
        new Thread(billingSix).start();
        new Thread(billingSeven).start();
        new Thread(billingEight).start();
        new Thread(billingNine).start();
        new Thread(billingTen).start();
    }
    /**
     * método sobrescrito de la interfaz Runnable que hace el llamdo al método de gestión de productos de la clase cajera
     */
    @Override
    public void run() {
        this.cashier.chargeProducts(this.customer, this.firstTime);
    }
}
