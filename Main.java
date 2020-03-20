

public class Main {
    public static void main(String[] args) {

        int [] grades1 = { 3, 5, 1};
        int [] grades2 = { 2, 3};
        double sum1 = 0;
        double sum2 = 0;
        double average = 0;


        for (int i = 0; i< grades1.length; i++ ) {
            sum1 += grades1[i];
        }
        for (int i = 0; i< grades2.length; i++ ) {
            sum2 += grades2[i];
        }


        average = ( sum1*0.7 + sum2*0.3 )/ ( 0.7*grades1.length + 0.3*grades2.length );



        System.out.println(average);


    }

}
