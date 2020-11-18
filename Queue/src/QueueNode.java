/*
Addison Hoff
11/17/2020
A Node class that holds data and points to a parent node.
*/

public class QueueNode <T> {

    private T t;
    private QueueNode parent;

    //Constructors
    public QueueNode() {

    }

    public QueueNode(T t) {
        this.t = t;
    }

    public QueueNode(T t, QueueNode parent) {
        this.t = t;
        this.parent = parent;
    }

    //Getters and setters
    public void setData(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }

    //Parent
    public void setParent(QueueNode p) {
        this.parent = p;
    }

    public QueueNode getParent() {
        return parent;
    }



    public String toString() {
        return ("Node: " + t.toString());
    }

    public boolean equals(QueueNode x) {
        return this.t.equals(x.t);
    }


}