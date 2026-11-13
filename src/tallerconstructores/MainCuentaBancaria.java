package tallerconstructores;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   PRUEBA - CUENTA BANCARIA (EJERCICIO 2)");
        System.out.println("========================================");

        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Cuenta 1 (Por defecto):");
        System.out.println(cuenta1);

        CuentaBancaria cuenta2 = new CuentaBancaria("1234567890", "Corriente");
        System.out.println("Cuenta 2 (2 Parámetros):");
        System.out.println(cuenta2);

        CuentaBancaria cuenta3 = new CuentaBancaria("9876543210", 1500500.0, "Ahorros");
        System.out.println("Cuenta 3 (3 Parámetros / Sobrecargado):");
        System.out.println(cuenta3);
    }
}