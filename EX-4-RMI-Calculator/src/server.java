import java.rmi.Naming;
public class server {
    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            calculatorimpl obj = new calculatorimpl();
            Naming.rebind("rmi://localhost/calculator", obj);
            System.out.println("RMI Server Started...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}