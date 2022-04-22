package Week1.day3;

import java.util.Scanner;

public class Queue1 {
    Node front;
    Node rear;
    int count = 0;

    public void enqueue(String s){
        Node node;
        if( front == null && rear == null ){
            node = new Node(s);
            this.front = node;
        } else {
            node = new Node(s, null, this.rear);
            this.rear.nextNode = node;
        }
        this.rear = node;
        count++;
    }

    public String dequeue(){
        String vv = this.front.value;

        this.front = this.front.nextNode;

        this.front.prevNode = null;

        count--;

        return vv;
    }

    public Node getFront(){
        return this.front;
    }

    public Node getRear(){
        return this.rear;
    }

    // size, isEmpty add
    public int getSize(){
        return count;
    }

    public boolean isEmpty(){
        if (count==0){
            return true;
        }
        return false;
    }

    public void getQueue(){
        Node node = this.front;
        System.out.println("\n Queue Element");
        while (node != null)
        {
            System.out.print(" | " + node.value);
            node = node.nextNode;
        }
        System.out.println();
    }

    public boolean isExisting(String search){
        Node node = this.front;
        while (node != null)
        {
            if (node.value == search){
                return true;
            }
            node = node.nextNode;
        }
        return false;
    }


}
class Node {
    String value;
    Node prevNode;
    Node nextNode;

    public Node( String v){
        this.value = v;
    }

    public Node( String v , Node nxtNode , Node preNode){
        this.value = v;
        this.nextNode = nxtNode;
        this.prevNode = preNode;
    }
}

class Main{

    public static void main(String[] args) {
        Queue1 queue1 = new Queue1();
        queue1.enqueue("test1");
        queue1.enqueue("test2");

        System.out.println(queue1.count);
        queue1.getQueue();
        System.out.println(queue1.isExisting("test3"));

        Queue1 q = new Queue1();
        Scanner sc = new Scanner(System.in);
        String s = "temp";
        while(!(s.length()==0)) {
            System.out.print("Enter a string: ");
            s = sc.nextLine();
            q.enqueue(s);
        }
        q.getQueue();

    }
}
