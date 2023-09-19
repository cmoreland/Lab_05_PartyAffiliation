import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your political party affiliation: [D R I O]");
        String party = in.next();
        if (party.equals("D")){
            System.out.println("You are a Democratic Donkey with the input " + party);
        }
        else if (party.equals("R")){
            System.out.println("You are a Republican Elephant with the input " + party);
        }
        else if (party.equals("I")){
            System.out.println("You are an independent person with the input " + party);
        }
        else if (party.equals("O")){
            System.out.println("You are a mystery politically with the input " + party);
        }
        else {
            System.out.println("Try again");
        }
    }
}