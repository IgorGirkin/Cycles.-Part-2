public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int accumulation = 15_000;
        int total = 0;
        int month=0;
        while ( total<=2459000) {
        total=total+total/100;
        total=total+accumulation;
        month=month+1;
        System.out.println("Месяц "+month+", сумма накоплений равна "+total+"рублей");
        }
        //Задание 2
        System.out.println("Задание 2");
        int q=0;
        while ( q<=9) {
            q++;
            System.out.print(" "+q);
        }
        System.out.println();
        for (;q>=1;q--) {
         System.out.print(" "+q);
        }
        System.out.println();
        //Задание 3
         System.out.println("Задание 3");
         var krasnodar=12000000;
         var born = 17;
         var death = 8;
         for (int w=1; w<=10;w++) {
         krasnodar+=krasnodar/1000*born-krasnodar/1000*death;
         System.out.println("Год "+w+ ", численность населения составляет "+krasnodar);
         }

          System.out.println("Задача 2");
        for(int i=1;i<11;i++){
            for(int j=2;j<3;j++){
               System.out.print(j+"*"+i+"="+(i*j)+"\t\t");
           }

           System.out.println();

           }
        System.out.println("Задача 1");
        int presentTime = 2022;
        int thePastTwoHundredYearsAgo=presentTime-200;
        int future =presentTime+100;
        for (int i=0;i<=future;i+=79)
        { if (i>thePastTwoHundredYearsAgo)
            System.out.println(i);
        }
    }
}
