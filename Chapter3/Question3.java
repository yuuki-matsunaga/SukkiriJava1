package Chapter3;

public class Question3 {
  public static void main(String args[]) {
    System.out.println("【数当てゲーム】");

    int ans = new java.util.Random().nextInt(10);

    for (int i = 0; i < 5; i++) {
      System.out.println("画面に0〜9の数字を入れてください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans) {
        System.out.println("あたり！");
        break;
      } else {
        System.out.println("違います。");
      }
    }
    System.out.println("ゲームを終了します");
  }
}
