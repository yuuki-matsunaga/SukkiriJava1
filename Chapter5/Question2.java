package Chapter5;

public class Question2 {
  public static void main(String args[]) {
    String title = "計画変更連絡";
    String address = "abc@gmail.com";
    String text = "予定を変更しますので確認お願いします。";
    email(title, address, text);
    email(address, text);
  }

  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました。");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);
  }

  public static void email(String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました。");
    System.out.println("件名:" + "無題");
    System.out.println("本文:" + text);
  }
}
