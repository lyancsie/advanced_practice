package oop;

//protected class Visibility{
//private class Visibility{
public class Visibility {

  final static String a = "This is not to be changed";
  final static String[] b = new String[2];
  Integer customValue;

  public Visibility(Integer customValue) {
    this.customValue = customValue;
  }

  public static void main(String[] args) {
    //a = "xyz";
    b[0] = "Random text";
    b[0] = "Another random text";
    //b = new String[]{"a","b"};
  }
}