package presentation;

import dao.DaoImp;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImp d=new DaoImp();
        MetierImpl metier = new MetierImpl(d);
       // metier.setDao(dao);
        System.out.println("Résulatas="+metier.calcul()  );
    }
}
