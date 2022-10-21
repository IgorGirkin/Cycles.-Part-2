public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int mount = 0;
        for (var deposit = 15000; deposit <= 12000000; deposit += deposit / 100 * 7) {
            mount++;
            System.out.println("Месяц " + mount + ", сумма накоплений равна " + deposit + " рублей");
        }

        // Задание 2
        System.out.println("Задание 2");
        int mount2 = 0;
        for (int deposit2 = 15000; deposit2 <= 12000000; deposit2 += deposit2 / 100 * 7) {
            mount2++;
            if (mount2 % 6 == 0) {
                System.out.println("Месяц " + mount2 + ", сумма накоплений равна " + deposit2 + " рублей");
            }
        }
        //Задание 3
        System.out.println("Задание 3");
        int years = 9;
        int mounts = 0;
        for (int deposit3 = 15000; mounts<=12*years--; deposit3 += deposit3 / 100 * 7) {
            mounts++;
            if (mounts % 6 == 0) {
                System.out.println("Месяц " + mounts + ", сумма накоплений равна " + deposit3 + " рублей");
            }
    }
    //   //Задание 4
        System.out.println("Задание 4");
    int e = 5;
        for(int j = 1; j< 31;j++)
            if((j -e)%7==0)

    {
        System.out.println("Сегодня пятница, " + j + "-е число. Необходимо подготовить отчет.");
    }
    }
}



