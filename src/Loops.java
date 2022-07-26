public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");

        }

        for (int i = 50; i < 56; i++){
            System.out.println(i *3);
        }

        int counter = 0;
        while (counter <10){
            System.out.println("Hello");
            counter++;
        }
        System.out.println("finished");

        int[] seletedNumbers = {2,4,6,8,10,1,3,5,7,9};

        int counter2 = 0;
        while (seletedNumbers[counter2]<7) {
            System.out.println(seletedNumbers[counter2]);
            counter2++;
        }






    }

}
