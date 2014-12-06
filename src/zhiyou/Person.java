package zhiyou;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiyou on 14-12-1.
 */
public class Person {
    private String name;
    private int Count;
    Person(String name)
    {
        this.name = name;
    }
    /*
    *用于存用户租赁的信息
     */
    private List<Rental> rentals = new ArrayList<Rental>();//todo建立一个集合类表，集合的元素是类Rendal
    public void addRental(Rental rental)//向里面添加数据的
    {//addRental的参数是Rental类的对象，
                rentals.add(rental);
            }
    /*
    *生成祥单的函数
    *
     */
    public String statement(){//计算总的费用和总积分数


        String result = "Rental recard for"+getName()+"\n";//获得借书人的名字。
        for(Rental rental:rentals){//todo

                result+=rental.getMoiv().getMoveName()+"\t"+String.valueOf(rental.getCharge(rental.getDayRental()));

        }

        result+="Amount owed is"+String.valueOf(totlegetCharge())+"\n";
        result+="Point owed is"+String.valueOf(totlegetFrequentRenterPoint())+"\n";
        return result;
    }

    public String htmlStatement(){//计算总的费用和总积分数


        String result = "<h1>Rental recard for"+getName()+"</h1>";//获得借书人的名字。

        result += "<table>";

        for(Rental rental:rentals){//todo


            result += "<tr>";
            result+="<td>" + rental.getMoiv().getMoveName()+"</td>"+ "<td> "+ String.valueOf(rental.getCharge(rental.getDayRental())) + "</td>";
            result += "</tr>";



        }
        result += "</table>";

        // add footer lines,算出所有的费用和所得积分
        result+="<h2>Amount owed is"+String.valueOf(totlegetCharge())+"</h2>";
        result+="<h2>Point owed is"+String.valueOf(totlegetFrequentRenterPoint())+"</h2>";
        return result;
    }


    public double totlegetCharge()
    {
        double totalAmont = 0;
        for(Rental rental:rentals){
            totalAmont +=rental.getCharge(rental.getDayRental());//getCharge(rental)函数计算借影片的费用的
        }
        return totalAmont;//返回总费用
    }
    public int totlegetFrequentRenterPoint(){
        int totlefrenquentRental = 0;
        for(Rental rental:rentals){
            totlefrenquentRental +=rental.getFrequentRenterPoints();//getFrequentRrentRenterPoint(rental)是计算积分的
        }
        return totlefrenquentRental;//返回总积分
    }




//

    public String getName() {//定义一个变量，通过构造函数可以对它赋值，然后就可以调用get函数直接得到初始化的名字，并且输出出来。
        return name;
    }
}
