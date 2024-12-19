import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;
import proxy.ListeCompte;

import java.util.ArrayList;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {

        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversionEuroToDh(101));
        Compte compte=new Compte();
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        System.out.println(compte.getDateCreation());
        List<Compte> LCompte=stub.listeCompte();
        for(Compte c:LCompte){
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDateCreation());%
        }
    }
}
