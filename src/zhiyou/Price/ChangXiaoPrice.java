package zhiyou.Price;

/**
 * Created by zhiyou on 14-12-6.
 */
public class ChangXiaoPrice extends Prace {
//    @Override
//    public int getPrace() {
//        return 0;
//    }

    @Override
    public double getCharge(int daysRented) {
        if ( daysRented < 3 ) return 4;
        else {
            return 4 + (daysRented-3)*2;
        }
    }
}
