package edu.cscc;

public class Node<T> {
    private T content;
    private Node next;

    /**
     * Constructor
     * @param content
     * @param next
     */
    public Node(T content, Node next) {
        this.content = content;
        this.next = next;
    }

    //Setters and Getters
    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
