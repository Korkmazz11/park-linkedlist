import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("Otopark Programýna Hoþgeldiniz: ");
    LinkedList otopark=new LinkedList();
    Scanner arac2= new Scanner(System.in);
   	String input3 = arac2.nextLine();
   	otopark.add(input3);
   	otopark.display();
    System.out.println("Otopark Programýna Hoþgeldiniz: ");
    System.out.println("1: Araç Giriþi Yapmak Ýstiyorum");
    System.out.println("2:Araç Çýkýþý Yapmak Ýstiyorum");
    System.out.println("3:Araçlarý Görüntüle:");
    System.out.println("e: Repeat the String");
    System.out.println("f: It is Palindrome");
    System.out.println("?: Display");
    System.out.println("q: Quit");
    Scanner scan = new Scanner(System.in);
    String choice = scan.nextLine();
    do {
    switch (choice){
        case "1":
        	Scanner arac= new Scanner(System.in);
        	String input2 = arac.nextLine();
            otopark.add(input2);
            break;
        case "2":
        	Scanner arac1= new Scanner(System.in);
        	String input1 = arac1.nextLine();
            otopark.remove(input1);
            break;
        case "3":
        	otopark.display();
 
            break;
        case "d":
            System.out.println("Enter the first number");
            int num1 = scan.nextInt();
            System.out.println("Enter the second number");
            int num2 = scan.nextInt();
          
            break;
        case "e":
            System.out.println("Enter a string: ");
            String word1 = scan.nextLine();
            System.out.println("Enter an integer: ");
            int numberOfTimes = scan.nextInt();
            System.out.println("Enter the third number");
           
            break;
        case "f":
            System.out.println("Enter a string: ");
            String word2 = scan.nextLine();
         
            break;
        case "?":
                System.out.println("Command Options: ");
                System.out.println("a: Geek's Name");
                System.out.println("b: Num Questions Asked");
                System.out.println("c: All Numbers Are the Same");
                System.out.println("d: Sum Between Two Integers");
                System.out.println("e: Repeat the String");
                System.out.println("f: It is Palindrome");
                System.out.println("?: Display");
                System.out.println("q: Quit");
                break;
            }  }while (choice != "q");

    }
    

	}


