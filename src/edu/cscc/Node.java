package edu.cscc;

public class Node {
    private Object content;
    private Node next;

    /**
     * Constructor
     * @param content
     * @param next
     */
    public Node(Object content, Node next) {
        this.content = content;
        this.next = next;
    }

    //Setters and Getters
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
