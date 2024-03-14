package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao") // creer moi un objet daoImp et l'appler dao "version annotations  c'est egale a bean id="" class
public class DaoImp implements  IDao{

    @Override
    public double getData() {

        System.out.println("version base de données");
        double temp=25;

        return temp;

    }

}
