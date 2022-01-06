package Chapter5;

public class Question3 {
  public static void main(String args[]) {
    calcTriangleArea(10.0, 5.0);
    calcCircleArea(5.0);
  }

  public static double calcTriangleArea(double bottom, double height) {
    double calcTriangleArea = bottom * height / 2;
    System.out.println("底辺の長さが" + bottom + "cm、" + "高さが" + height + "cmの場合、面積は" + calcTriangleArea + "㎠");
    return calcTriangleArea;
  }

  public static double calcCircleArea(double radius) {
    double calcCircleArea = radius * radius * 3.14;
    System.out.println("円の半径が、" + radius + "cmの場合、面積は " + calcCircleArea + "㎠");
    return calcCircleArea;
  }
}
