package org.example;

public class Main {
    public static void main(String[] args) {
        SocketClassAdapterImp classAdapter = new SocketClassAdapterImp();
        Volt classAdapter3Volt = classAdapter.get3Volt();
        System.out.println("classAdapter3Volt value -> " + classAdapter3Volt.getVolts());

        System.out.println("*****************************************");

        SocketObjectAdapterImp objectAdapter = new SocketObjectAdapterImp();
        Volt objectAdapter3Volt = objectAdapter.get3Volt();
        System.out.println("objectAdapter3Volt value -> " + objectAdapter3Volt.getVolts());
    }
}