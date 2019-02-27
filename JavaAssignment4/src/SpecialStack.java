import java.util.Stack;

class SpecialStack {
    private Stack<Integer> s;
    private Integer i;

    SpecialStack() {
        s = new Stack<Integer>();
    }

    void getMin() {
        if (s.isEmpty())
            System.out.println("Stack is empty");

        else
            System.out.println("Minimum Element in the " +
                    " stack is: " + i);
    }

    void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty ");
            return;
        }

        Integer t = s.peek(); // Top element.

        System.out.print("Top Most Element is: ");

        if (t < i)
            System.out.println(i);
        else
            System.out.println(t);
    }

    void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();
        if (t < i) {
            System.out.println(i);
            i = 2 * i - t;
        } else
            System.out.println(t);
    }

    void push(Integer x) {
        if (s.isEmpty()) {
            i = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }
        if (x < i) {
            s.push(2 * x - i);
            i = x;
        } else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }
}