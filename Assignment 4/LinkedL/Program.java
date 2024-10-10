package com.Assignment4.LinkedL;

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

    public void addFirst(int data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
    }

    public void insertAt(int pos, int data){
        if(pos == 0) {
            addFirst(data);
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
        Node temp = current.next;
        current.next = new Node(data);
        current.next.next = temp;
    }

    public void reverseList(){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
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

        //Insert at Start
        l1.addFirst(200);
        l1.addFirst(525);

        System.out.println("Original List");
        l1.displayList();

        //Insert at Given Key
        System.out.println("\nAfter Insering the value \"558\" at position \"5\":");
        l1.insertAt(5,558);
        l1.displayList();
        System.out.println("After Insering the value \"297\" at position \"1\":");
        l1.insertAt(1,297);
        l1.displayList();


        //Reverse List
        l1.reverseList();
        System.out.println("\nReversed List: ");
        l1.displayList();
    }
}
