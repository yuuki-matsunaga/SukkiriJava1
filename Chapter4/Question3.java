package Chapter4;

public class Question3 {
  public static void main(String args[]) {
    int[] numbers = { 3, 4, 9 };

    System.out.println("一桁の数字を入力してください");

    int input = new java.util.Scanner(System.in).nextInt();

    for (int num : numbers) {

      if (num == input) {
        System.out.println("あたり!");
      }
    }
  }
}
