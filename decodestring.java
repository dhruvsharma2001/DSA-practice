import java.util.*;

public class decodestring {
  public static String DecodeString(String s) {
    Stack<Integer> numberStack = new Stack<>();
    Stack<String> stringStack = new Stack<>();
    int k = 0;

    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        k = (k * 10) + (c - '0');
        continue;
      }

      if (c == '[') {
        numberStack.push(k);
        k = 0;
        stringStack.push(String.valueOf(c));
        continue;
      }
      if (c != ']') {
        stringStack.push(String.valueOf(c));
        continue;
      }
      StringBuilder temp = new StringBuilder();
      while (!stringStack.peek().equals("["))
        temp.insert(0, stringStack.pop());

      // remove the "["
      stringStack.pop();
      StringBuilder replacement = new StringBuilder();
      int count = numberStack.pop();
      for (int i = 0; i < count; i++)
        replacement.append(temp);

      // Add it to the stack
      stringStack.push(replacement.toString());
    }

    StringBuilder result = new StringBuilder();
    while (!stringStack.empty()) {
      result.insert(0, stringStack.pop());
    }

    return result.toString();

  }

  public static void main(String args[]) {
    String s = "3[a]2[bc]";
    System.out.println(DecodeString(s));
  }
}
