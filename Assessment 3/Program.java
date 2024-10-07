package Assessment3;

import java.util.Scanner;

class Node{
    int value;
    Node next;

    Node(int data){
        this.value = data;
        this.next = null;
    }
}

class LinkedList{
    private Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null)
            head = newNode;
        else{
            Node current = head;
            while(current.next!=null)
                current = current.next;
            current.next = newNode;
        }
    }

    public void displayList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.value);
            System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(current);
    }

    public void RemoveFrom(int pos){
        if(pos == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for(int i=0;i<pos-1;i++){
            if(current==null){
                System.out.println("Index out of range");
                return;
            }
            current = current.next;
        }
        current.next = current.next.next;
    }
}

public class Program {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        // Insert at end
        l1.insert(141);
        l1.insert(302);
        l1.insert(164);
        l1.insert(530);
        l1.insert(474);

        System.out.println("Original List");
        l1.displayList();
        Scanner sc = new Scanner(System.in);

        //Insert at Given Key
        System.out.println("Enter the position to Delete: ");
        int pos = sc.nextInt();
        System.out.println("\nAfter Deletion");

        l1.RemoveFrom(pos-1);
        l1.displayList();
    }
}
