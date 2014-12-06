package zhiyou.Price;

import zhiyou.Moiv;

/**
 * Created by zhiyou on 14-12-5.
 */
public class RegularPrice extends Prace {
//    public int getPrace(){
//        return Moiv.REGULAR;
//    }
    public double getCharge(int daysRented){
        double result = 2;
        if(daysRented>2)
            result+=(daysRented - 2)*1.5;
        return result;
    }
}
