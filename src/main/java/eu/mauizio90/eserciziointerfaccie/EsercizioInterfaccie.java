
package eu.mauizio90.eserciziointerfaccie;

/**
 *
 * @author mauiz
 */
public class EsercizioInterfaccie {

    public static void main(String[] args) {
        
        Bank creditoCooperativo = new Bank("Credito Cooperativo");
        
        
        Bank bnl = new Bank("BNL");
        Company mastropasquaEnterprises = new Company();
        
        
        Account contoMastropasquaEnterprises = bnl.newIstance(50000);
        Account contoMaurizio = bnl.newIstance(0);
        Account contoMauro = bnl.newIstance(0);
        Account contoAlberto = bnl.newIstance(0);
//        Account contoGianni = bnl.newIstance(0);
//        Account contoBerlusconi = bnl.newIstance(0);
        Account contoFulvio = bnl.newIstance(0);


        mastropasquaEnterprises.setAccount(contoMastropasquaEnterprises);
        
        
        Employee maurizio = new Developer("maurizio", "java", contoMaurizio, 2000);
        Employee mauro = new Developer("mauro", "c++", contoMauro, 1500);
        Employee alberto = new Developer("alberto", "c#", contoAlberto,3000);
//        Developer gianni = new Developer("giovanni", "java", contoGianni,4500);
//        Developer berlusconi = new Developer("silvio","pascal", contoBerlusconi, 1000);
//        Developer koala = new Developer("ciuffo", "kobol", contoKoala,2100);
//        Developer licia = new Developer("licia", "java", contoLicia,1500);
//        Developer mummio = new Developer("tutankamon", "java", contoMummio, 500);
        Employee fulvio = new Security("fulvio", contoFulvio, 1500, "pistola");
        
        mastropasquaEnterprises.addEmployee(maurizio);
        mastropasquaEnterprises.addEmployee(mauro);
        mastropasquaEnterprises.addEmployee(alberto);
//        mastropasquaEnterprises.addEmployee(gianni);
//        mastropasquaEnterprises.addEmployee(berlusconi);
//        mastropasquaEnterprises.addEmployee(koala);
//        mastropasquaEnterprises.addEmployee(licia);
//        mastropasquaEnterprises.addEmployee(mummio);
        mastropasquaEnterprises.addEmployee(fulvio);

        System.out.println(mastropasquaEnterprises.getEmployees());
//        
//        mastropasquaEnterprises.payEmployees();
//        System.out.println("mastropasquaEnterprises ha pagato " + mastropasquaEnterprises.payEmployees()+ " in stipendi");
//        System.out.println(contoMastropasquaEnterprises.getMoney());
//        
//        
//        Account.transferTo(contoMaurizio, contoMauro, 200);
//        System.out.println(maurizio.getName()+ " ha nel conto " + contoMaurizio.getMoney());
//        System.out.println(mauro.getName()+ " ha nel conto " + contoMauro.getMoney());
//        System.out.println(alberto.getName()+ " ha nel conto " + contoAlberto.getMoney());
//        System.out.println(gianni.getName()+ " ha nel conto " + contoGianni.getMoney());
//        System.out.println("iban maurizio " + contoMaurizio.getIBAN());
//        System.out.println("iban mauro " + contoMauro.getIBAN());
//        System.out.println("iban alberto " + contoAlberto.getIBAN());
        System.out.println(mastropasquaEnterprises.payEmployees());
    }
}
