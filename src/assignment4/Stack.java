import java.lang.String;

/**
 * Created by xuzhikun on 10/4/2016.
 */
public class Stack {
    private int[] array;
    private int top;
    public final int size = 10;

    Stack() {
        array = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top > size - 1)
            System.out.println("overflow");
        else
            array[++top] = value;
    }

    public int pop() {
        if (top < 0)
            System.out.println("underflow");
        return array[top--];
    }
}
