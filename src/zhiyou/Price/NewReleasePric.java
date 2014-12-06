package zhiyou.Price;

import zhiyou.Moiv;

/**
 * Created by zhiyou on 14-12-5.
 */
public class NewReleasePric extends Prace {
//    public int getPrace(){
//        return Moiv.NEW_RELEASE;
//    }
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
