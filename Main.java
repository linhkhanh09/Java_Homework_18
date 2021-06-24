package fs.apidef.identifyservice.java.BT_test_2;

import com.google.common.collect.Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = Lists.newArrayList(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)
        );
        int count1=0, count2=0,count3=0,count4=0,count5=0,count6=0,count7=0;
        float tong1=0,tong2=0,tong3=0,tong4=0,tong5=0,tong6=0,tong7=0;
        for(int i=0; i< people.size();i++){
            if(people.get(i).nationality.equals("Vietnam")){
                count1++;
                tong1=tong1+ people.get(i).age;
            }else if(people.get(i).nationality.equals("USA")){
                count2++;
                tong2=tong2+ people.get(i).age;
            }else if(people.get(i).nationality.equals("China")){
                count3++;
                tong3=tong3+ people.get(i).age;
            }else if(people.get(i).nationality.equals("Korea")){
                count4++;
                tong4=tong4+ people.get(i).age;
            }else if(people.get(i).nationality.equals("Japan")){
                count5++;
                tong5=tong5+ people.get(i).age;
            }else if(people.get(i).nationality.equals("France")){
                count6++;
                tong6=tong6+ people.get(i).age;
            }else if(people.get(i).nationality.equals("Malaysia")){
                count7++;
                tong7=tong7+ people.get(i).age;
            }
        }
        System.out.println("- Vietnam:" + count1);
        System.out.println("- USA:" + count2);
        System.out.println("- China:" + count3);
        System.out.println("- Korea:" + count4);
        System.out.println("- Japan:" + count5);
        System.out.println("- France:" + count6);
        System.out.println("- Malaysia:" + count7);

        for(int i=0; i< people.size();i++){
            if(people.get(i).age >25){
                System.out.println(people.get(i));
            }
        }
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("- Vietnam:" + df.format(tong1/count1));
        System.out.println("- USA:" + df.format(tong2/count2));
        System.out.println("- China:" + df.format(tong3/count3));
        System.out.println("- Korea:" + df.format(tong4/count4));
        System.out.println("- Japan:" + df.format(tong5/count5));
        System.out.println("- France:" + df.format(tong6/count6));
        System.out.println("- Malaysia:" + df.format(tong7/count7));


        String value= null;
        for(int i=0; i< people.size();i++){
            if(people.get(i).age <20){
               value= "nổi loạn";
                System.out.println(people.get(i) + "-" + value);
            }else if(people.get(i).age>= 20 && people.get(i).age <=30){
                value="việc làm";
                System.out.println(people.get(i) + "-" +value);
            }else if(people.get(i).age>= 21 && people.get(i).age <=40){
                value="sự nghiệp";
                System.out.println(people.get(i) + "-" +value);
            }else {
                value= "hưởng thụ";
                System.out.println(people.get(i) + "-" +value);
            }
        }


    }
}
