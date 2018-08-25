package ds.stack;

public class CharStack {

  private int maxSize;
  private char[] stack;
  private int top;

  public CharStack(int maxSize) {
    this.maxSize = maxSize;
    this.stack = new char[maxSize];
    this.top = -1;
  }

  /**
   * Check true if stack is empty
   */
  public boolean isEmpty() {
    return (this.top == -1);
  }

  /**
   * Returns true if stack is full
   */
  public boolean isFull() {
    return ((this.maxSize - 1) == this.top);
  }

  /**
   * Insert the character to the stack. The method prints the message when stack cannot accept the
   * new values since it's full
   */
  public void push(char ch) {
    if (this.isFull()) {
      System.out.println("Cannot push an item to stack. The stack is already full.");
      return;
    }

    //increment the top (index) and assign the character to the incremented index posision
    this.top++;
    this.stack[top] = ch;
  }

  /**
   * Removes the character from the stack. The method prints the message when stack cannot remove
   * the values since it's empty
   */
  public char pop() {
    if (this.isEmpty()) {
      System.out.println("Cannot pop an item from stack. The stack is empty.");
      return '0';
    }

    //take the top value and decrement the top (index).
    char popped = this.stack[this.top];
    this.top--;
    return popped;
  }

  /**
   * Peak the top item of the stack. Returns '0' when stack is empty.
   */
  public char peek() {
    if (this.isEmpty()) {
      return '0';
    }
    return this.stack[top];
  }
}
