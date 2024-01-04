# Stack

- Stack is an **ordered** data structure of elements where elements are added and removed from same end follows **LIFO**.

- Browsing History : A -> B -> C -> D

- Stack can be implemented using **StringBuilder** class in java, which is **mutable** 

- All Operations are constant time -> push(), pop() , peek() -> __O(1)__ but search is linear complexity -> __O(n)__.

## Example

```java
Stack<Integer> stack = new Stack<Integer>();

stack.push(1); // 1 is pushed to top
stack.push(4); // 4 is pushed to top

System.out.println(stack.peek()); // 4 is returned

if(!stack.empty()){ // return false as stack is not empty
    stack.pop(); // 4 removed
}

stack.pop(); // 1 removed

stack.pop(); // Throws eexception as stack is empty
```

# Valid Paranthesis

A sequence of $$ {, [ , ( , ) , ] , } $$  are given find whether they are balanced or not.

Opening Symbol -> push

Closing Symbol -> pop , if empty return invalid