public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> intLinkedListStack = new LinkedListStack<>();
        intLinkedListStack.push(10);
        intLinkedListStack.push(20);
        System.out.println("LinkedListStack (Integer) peek: " + intLinkedListStack.peek()); // 20
        System.out.println("LinkedListStack (Integer) pop: " + intLinkedListStack.pop()); // 20
        System.out.println("LinkedListStack (Integer) pop: " + intLinkedListStack.pop()); // 10
        System.out.println("LinkedListStack (Integer) isEmpty: " + intLinkedListStack.isEmpty()); // true

        GenericStack<String> stringArrayStack = new ArrayStack<>();
        stringArrayStack.push("hello");
        stringArrayStack.push("world");
        System.out.println("ArrayStack (String) peek: " + stringArrayStack.peek()); // world
        System.out.println("ArrayStack (String) pop: " + stringArrayStack.pop()); // world
        System.out.println("ArrayStack (String) pop: " + stringArrayStack.pop()); // hello
        System.out.println("ArrayStack (String) isEmpty: " + stringArrayStack.isEmpty()); // true

        GenericStack<Character> charLinkedListStack = new LinkedListStack<>();
        charLinkedListStack.push('a');
        charLinkedListStack.push('b');
        System.out.println("LinkedListStack (Character) peek: " + charLinkedListStack.peek()); // b
        System.out.println("LinkedListStack (Character) pop: " + charLinkedListStack.pop()); // b
        System.out.println("LinkedListStack (Character) pop: " + charLinkedListStack.pop()); // a
        System.out.println("LinkedListStack (Character) isEmpty: " + charLinkedListStack.isEmpty()); // true

        GenericStack<Float> floatArrayStack = new ArrayStack<>();
        floatArrayStack.push(1.1f);
        floatArrayStack.push(2.2f);
        System.out.println("ArrayStack (Float) peek: " + floatArrayStack.peek()); // 2.2
        System.out.println("ArrayStack (Float) pop: " + floatArrayStack.pop()); // 2.2
        System.out.println("ArrayStack (Float) pop: " + floatArrayStack.pop()); // 1.1
        System.out.println("ArrayStack (Float) isEmpty: " + floatArrayStack.isEmpty()); // true
    }
}
