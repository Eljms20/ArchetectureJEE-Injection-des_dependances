package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    // couplage faible
    private IDao dao;

    @Override
    public double calcul() {
        double tmp= dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);

        return res;
    }
// permet de injecter dans la variable dao un objet d'une classe qui implement linterface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
