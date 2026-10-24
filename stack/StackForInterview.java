package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackForInterview {
    public static void main(String[] args) {
        Deque<Book> stack = new ArrayDeque<>();
        var book1 = new Book("Book1");
        var book2 = new Book("Book2");
        var book3 = new Book("Book3");
        var book4 = new Book("Book4");
        var book5 = new Book("Book5");

        System.out.println();
        stack.push(book1);
        System.out.println(stack);
        stack.push(book2);
        System.out.println(stack);
        var book2Poped = stack.pollFirst();
        System.out.println(book2Poped);
        System.out.println(stack);
        stack.push(book3);
        stack.push(book4);
        stack.push(book5);
        System.out.println(stack);

        while (!stack.isEmpty()) {
            var book = stack.pollFirst();
            System.out.println(book);
        }
        System.out.println("Stack is empty:"+stack.isEmpty());
    }

    private record Book(String title) {

    }
}

