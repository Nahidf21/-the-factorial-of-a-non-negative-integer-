
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int num;
    int i=1;
    long factorial=1;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number");
    num = input.nextInt();
    while(i <=num){
      factorial=factorial*i;
      i++;
    }
    System.out.println("Factorial: " + factorial); 
  }
}
