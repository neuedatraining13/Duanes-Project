public class Conditions {

    public static void main(String[] args) {
        int testScore =60;

        if (testScore>50){
            System.out.println("Congratulations - you passed!");
        } else if(testScore==50){
            System.out.println("We are not sure if you passed.");
        }

        else {
            System.out.println("Sorry - you failed.");
        }

        switch (testScore){
            case 0 :
                System.out.println("Did you take the test?");
                break;
            case 100:
                System.out.println("You got top marks!");
                break;
            default:
                System.out.println("you didnt do anything special");
                break;


        }
        int maxScore = 100;
        if (testScore>50 && < maxScore){
            System.out.println("you passed but didnt get full marks");
        }

        if(testScore<10 || testScore > 90){
            System.out.println("You are at the boundry");
        }
    }
}
