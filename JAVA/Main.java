package JAVA;

class Main {
    public static void main (String[] args){
        System.out.println("Hola Mundo");

        UberX uberx = new UberX("AMQ123",new Account("Andres Herrea", "AND123"), 
        "Chevrolet", "Sonic");
        uberx.setPassenger(4);
        uberx.printDataCar();
    } 
}