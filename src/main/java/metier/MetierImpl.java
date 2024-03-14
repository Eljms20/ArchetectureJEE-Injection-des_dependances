package metier;

import dao.DaoImp;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("metier") // creer mpi un objet de type metierImpl avec les annotations cest egal a <bean> de version XML
public class MetierImpl implements IMetier {
    // couplage faible
    // injection de donnees
    @Autowired   // cad injecetr au moment de la creation  dans cette variable un objet de type IDao
    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    public MetierImpl(){

    }


    @Override
    public double calcul() {
        double t= dao.getData();
        double res=t*23;

        return res;
    }
// permet d'injecter dans la variable dao un objet d'une classe qui implement linterface IDao
    public void setDao(IDao dao) {

        this.dao = dao;
    }
}
