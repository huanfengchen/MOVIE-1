package zhiyou;

/**
 * Created by zhiyou on 14-12-1.
 */
public class Rental {
    private Moiv moiv;//定义了一个Moiv类的变量。
    private int dayRental;
    Rental(Moiv moiv,int dayRental){//定义Rental类de 构造函数，
    this.moiv = moiv;
        this.dayRental = dayRental;
    }

    public double getCharge(int dayRental){//这是用来计算借一次影碟所用费用的

        return getMoiv().getCharge(dayRental);

    }
    public int getFrequentRenterPoints(){//完成积分的累加

        return getMoiv().getFrequentRenterPoints(dayRental);//为什么要返回getMoiv().getFrequentRenterPoints(rental)，因为getMoiv()函数中返回的是moiv，是Mdiv的对象，在Moiv的类中有getFrequentRenterPoints(rental)方法，相当于通过类对象调用类中的函数
    }

    public int getDayRental() {
        return dayRental;
    }

    public Moiv getMoiv() {
        return moiv;
    }

    public void setDayRental(int dayRental) {
        this.dayRental = dayRental;
    }//给变量赋初值

    public void setMoiv(Moiv moiv) {
        this.moiv = moiv;
    }

}
