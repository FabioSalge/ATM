package atm;

/**
 *
 * @author 1142412
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProxyNegocio pn = new ProxyNegocio();
        System.out.println("O saldo da conta 2: " + pn.saldo("2"));
        System.out.println("Depositado 500 na conta 2 que ficou com o saldo: " + pn.setSaldo("2","500"));
    }
    
}
