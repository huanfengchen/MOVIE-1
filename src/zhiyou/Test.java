package zhiyou;

import zhiyou.Moiv;
import zhiyou.Person;
import zhiyou.Price.ChangXiaoPrice;
import zhiyou.Price.ChildrensPrice;
import zhiyou.Price.NewReleasePric;
import zhiyou.Price.Prace;
import zhiyou.Rental;

/**
 * Created by zhiyou on 14-12-1.
 */
public class Test {
    public static void main(String[]args) {
        /*
        *
        * 这儿一共有这么多书
         */
        Moiv m = new Moiv("大头", new ChildrensPrice());
        Moiv m1 = new Moiv("呢咋", new NewReleasePric());
        Moiv m2 = new Moiv("大",new NewReleasePric());
        /*
        *这儿是谁借了书借了，借的都是什么书
         */
        Person person = new Person("zhang");//new一个借书人的名字
        person.addRental(new Rental(m1, 6));
        person.addRental(new Rental(m2,3));
        Person person1 = new Person("小红");
        person1.addRental(new Rental(m1, 6));
        person1.addRental(new Rental(m2,3));

        System.out.println(person.htmlStatement());
        System.out.println(person1.htmlStatement());



    }
}
