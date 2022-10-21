public class Main {
    public static void main(String[] args) {
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
