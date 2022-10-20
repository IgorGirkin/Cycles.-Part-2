public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        var deposit = 15000;
        var total=0;
        for (int month = 1;total < 12000000;month++) {
            total+=total/100*7;
            total+=deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        //Задание 2
        //   System.out.println("Задание 2");
        //   var deposit2 = 15000;
        //  for (int q = 1; deposit2 <= 12000000; q++) {
        //    deposit2 = deposit2 +percent;
        //     if (q % 6 == 0) {
        //            System.out.println("Месяц " + q + ", сумма накоплений равна " + deposit2 + " рублей");
        //       }
        //    }
        //    //Задание 3
        //  System.out.println("Задание 3");
        ////   var deposit3 = 15000;
        //    var period = 12*9;
        //   for (int w = 1; w <= period; w++) {
        //      deposit3+=percent;
        //     if (w % 6 == 0) {
        //          System.out.println("Месяц " + w + ", сумма накоплений равна " +deposit3+ " рублей");
        //      }
        //  }
        //   //Задание 4
            System.out.println("Задание 4");
           int e = 5;
           for (int j = 1;j<31;j++) if ((j-e)%7==0) {
             System.out.println("Сегодня пятница, "+j+"-е число. Необходимо подготовить отчет.");
         }

    }
}
