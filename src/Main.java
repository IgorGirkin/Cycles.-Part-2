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
         var y=12000000;
         var birthRatePerThousand = 17;
         var mortalityRatePerThousand = 8;
         for (int w=1; w<=10;w++) {
         y=y+(y/1000*birthRatePerThousand)-(y/1000*mortalityRatePerThousand);
         System.out.println("Год "+w+ ", численность населения составляет "+y);
         }
    }

}