package zhiyou;

import zhiyou.Price.Prace;

/**
 * Created by zhiyou on 14-12-1.
 */
public class Moiv {
//    public static final int CHILDRENS = 2;//设置警它常量来表示不同的影片
//    public static final int REGULAR = 0;
//    public  static final int NEW_RELEASE = 1;


    private String moveName;
     private Prace prace;



    public Moiv(String moveName,Prace prace){//设置构造函数来给变量付初值
        this.moveName = moveName;//所借影片的名字
        this.prace = prace;
    }

    public double getCharge(int dayRental ) {
        return prace.getCharge(dayRental);
    }

    public int getFrequentRenterPoints(int dayRental ){
        return prace.getFrequentRenterPoints(dayRental);

    }

/*
*
* 赋给变量值并得到变量的值
 */
    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }
    public Prace getPrace() {
        return prace;
    }

    public void setPrace(Prace prace) {
        this.prace = prace;
    }

    public String getMoveName() {
        return moveName;
    }


}
