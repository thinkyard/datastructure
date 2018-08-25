package ds.stack;

public class StackApp {

  public static void main(String[] args) {
    System.out.println(reverseString("ThinkYard"));
  }

  /**
   * Reverse the string using Stack data structure.
   *
   * @param input String to be reversed
   * @return reversed string
   */
  private static String reverseString(String input) {

    if (input == null || input.length() == 0) {
      return "";
    }

    int stackSize = input.length();
    CharStack stack = new CharStack(stackSize);

    for (int i = 0; i < stackSize; i++) {
      stack.push(input.charAt(i));
    }

    String result = "";
    while (!stack.isEmpty()) {
      result = result + stack.pop();
    }
    return result;
  }

}
