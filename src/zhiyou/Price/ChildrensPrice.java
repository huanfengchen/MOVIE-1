package zhiyou.Price;

import zhiyou.Moiv;

/**
 * Created by zhiyou on 14-12-5.
 */
public class ChildrensPrice extends Prace {
//    public int getPrace() {
//        return Moiv.CHILDRENS;
//
//    }
    public double getCharge(int daysRented){
        double result = 1.5;
        if(daysRented>3)
            result+=(daysRented-3)*1.5;
        return result;
    }
}
