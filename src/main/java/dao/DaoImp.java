package dao;

public class DaoImp implements  IDao{

    @Override
    public double getData() {
        double temp=Math.random()*50;

        return temp;
    }
}
