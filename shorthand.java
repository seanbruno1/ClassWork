import java.util.Scanner;

public class shorthand {
    public static void main(String[] args){

        // Pause and play 1
        String [] friends = {"Sean","Ella","Richie","Aj"};
        for (String i : friends){
            System.out.println(i);
        }
        for(int k =0; k < friends.length; k++){
            System.out.println(friends[k]);
        }

        //Pause and play 2
        Scanner sc = new Scanner(System.in);
        System.out.println("What number grade did you get");
        Integer grade = sc.nextInt();
        switch(grade){
            case 90:
                System.out.println("You got an A");
                break;
            case 80:
                System.out.println("You got a B");
                break;
            case 70:
                System.out.println("You got a C");
                break;
            case 60:
                System.out.println("You got a D");
                break;
            case 50:
                System.out.println("You got a F");
                break;
            case 40:
                System.out.println("You got a F");
                break;
            case 30:
                System.out.println("You got a F");
                break;
            case 20:
                System.out.println("You got a F");
                break;
            case 10:
                System.out.println("You got a F");
                break;
            case 0:
                System.out.println("You got a F");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        //Pause and play 3
        System.out.println("What is your age to the lowest 10");
        Integer age = sc.nextInt();
        switch(age){
            case 0:
            case 10:
                System.out.println("You can not drink");
                break;
            case 20:
                System.out.println("You may be able to drink");
                break;
            case 30:
            case 40:
            case 50:
            case 60:
            case 70:
            case 80:
            case 90:
            case 100:
                System.out.println("You can drink");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        //Pause and play 4 
        int var =100;
        var += 5;
        System.out.println(var);
        var -= 5;
        System.out.println(var);
        var *= 5;
        System.out.println(var);
        var /= 5;
        System.out.println(var);

        //Pause and play 5
        Integer myAge = 20;
        String drink = (myAge < 21) ? ("Cannot Drink") : ("You can drink");
        System.out.println(drink);


    }
}