package tallerconstructores;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   PRUEBA - CUENTA BANCARIA (EJERCICIO 2)");
        System.out.println("========================================");

        // 1. Probando el constructor por defecto
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Cuenta 1 (Por defecto):");
        cuenta1.mostrarDetalles();

        // 2. Probando el constructor con dos parámetros
        CuentaBancaria cuenta2 = new CuentaBancaria("1234567890", "Corriente");
        System.out.println("Cuenta 2 (2 Parámetros):");
        cuenta2.mostrarDetalles();

        // 3. Probando el constructor sobrecargado con tres parámetros
        CuentaBancaria cuenta3 = new CuentaBancaria("9876543210", 1500500.0, "Ahorros");
        System.out.println("Cuenta 3 (3 Parámetros / Sobrecargado):");
        cuenta3.mostrarDetalles();
    }
}