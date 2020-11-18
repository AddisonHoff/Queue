/*
Addison Hoff
11/17/20
A queue data structure composed of nodes.
*/
public class Queue<T> {
    private int size;
    private QueueNode first;
    private QueueNode last;



    public Queue() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public T peek() {
        return (T) first.getData();
    }

    public void enqueue(T obj) {
        QueueNode temp = last;
        last = new QueueNode(obj, null);
        if(isEmpty()) {
            first = last;
        }
        else {
            temp.setParent(last);
        }
        size++;
    }

    public T dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Nothing to remove.");
        }
        QueueNode temp = first;

        first = first.getParent();
        size--;


        if(isEmpty()) {
            last = null;
        }

        return (T) temp.getData();
    }



}
