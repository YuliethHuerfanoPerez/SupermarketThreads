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
public class Cashier {

    private String number;

    /**
     * Constructor de clase, recibe el número de cajero
     * @param number asigna el número de cajeron a la clase
     */
    public Cashier(String number) {
        this.number = number;
    }
    /**
     * Método que muestra en número de la cajera
     * @return 
     */
    public String getNumber() {
        return number;
    }
    /**
     * Método que permite modificar el número de la cajera
     * @param number asigna el valor del número que recibe como parámetro
     */
    public void setNumber(String number) {
        this.number = number;
    }
    /**
     * método que gestiona los productos en cuanto al inicio de la atención al cliente, el registro de productos y el fin de la atención con sus respectivos tiempos
     * @param customer recibe el numero de cliente con los productos que va a pagar indicando el tiempoq ue se toma cada uno para ser registrado
     * @param waitTime defineel tiempo de espera que se demora cada producto en ser atendido para restarlo al tiempo actual
     */
    public void chargeProducts(Customer customer, long waitTime) {

        System.out.println("La cajera número " + this.number + 
                        " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + customer.getNumber() + 
                        " EN EL TIEMPO: " + (System.currentTimeMillis() - waitTime) / 1000	+
                        "segundos");

        for (int i = 0; i < customer.getProducts().length; i++) { 
            this.wait(customer.getProducts()[i]); 
            System.out.println("El producto " + (i + 1) + " del cliente " + customer.getNumber() +  
                                "  fue registrado en un tiempo de: " + (System.currentTimeMillis() - waitTime) / 1000 + 
                                "segundos");
        }

        System.out.println("La cajera número " + this.number + " Terminó de facturar los productos del cliente " + 
                        customer.getNumber() + " EN EL TIEMPO: " + 
                        (System.currentTimeMillis() - waitTime) / 1000 + "segundos");

    }
    /**
     * método que define el tiempo de interrupción del hilo hasta que se termine la tarea sin excepciones
     * @param seconds recibe el tiempo en segundos que luego convierte a milisegundos para dormir el hilo
     */
    private void wait(int seconds) {
            try {
                    Thread.sleep(seconds * 1000);
            } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
            }
    }
}
