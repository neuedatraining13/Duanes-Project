public class Main {

    public static void main(String[] args) {
        int i = 7;
        System.out.println(i);
        int j;
        j = 19;
        System.out.println(j);
        long myVariable = 176;
        long anotherVariable = 9000000000L;

        int first = 50;
        int second = 100;
        int third = first + 10;
        System.out.println(third);
        first = 65;
        System.out.println(first);
        System.out.println(third);

        //print out the valu of first multiplied by 3
        System.out.println("first * 3 = " + first * 3);

        System.out.println(second / 50); //2
        System.out.println(second / first); //1.85
        System.out.println(first * 3.1);

        double size = 17.3;
        float smallerSize=17.1f;
        double largerSize = 18;
        int extraLargeSize = 19;

        extraLargeSize = extraLargeSize + 1;
        extraLargeSize++;
        System.out.println(extraLargeSize);
        extraLargeSize--;
        System.out.println(extraLargeSize);

        i = i + 5;
        i += 5; // -= *= /=

        // 26 / 7   3r5
        int remainder = 26 % 7;
        System.out.println(remainder);

        boolean iAmHappy = true;
        boolean iAmSad = false;

        char firstInitial = 'D';

        int[] participantAges = {23,21,27};
        System.out.println(participantAges[2]);

    }

}
