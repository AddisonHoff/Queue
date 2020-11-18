/*
Addison Hoff
11/17/20
Tests function of Queue.java.
*/
class QueueTester {
    public static void main(String[] args) {
        Queue testQueue = new Queue();



        //Expected: true
        System.out.println(testQueue.isEmpty());

        testQueue.enqueue(1);

        //Expected: false
        System.out.println(testQueue.isEmpty());

        testQueue.enqueue(10);
        testQueue.enqueue(32);

        //Expected: 1
        System.out.println(testQueue.peek());

        //Expected: 3
        System.out.println(testQueue.size());

        //Expected: 1
        System.out.println(testQueue.dequeue());

        //Expected: 2
        System.out.println(testQueue.size());

        //Expected: 10
        System.out.println(testQueue.dequeue());

        //Expected: 1
        System.out.println(testQueue.size());

        //Expected: 32
        System.out.println(testQueue.dequeue());

        //Expected: 0
        System.out.println(testQueue.size());







    }
}
