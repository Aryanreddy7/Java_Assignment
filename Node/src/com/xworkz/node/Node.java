package com.xworkz.node;

public class Node {
    String value;
    Node next;

    public Node(String value){
        this.value=value;
    }
    public static void main(String[] args) {
        Node node=new Node("100");
        Node node1=new Node("200");
        Node node2=new Node("300");
        node.next=node1;
        node1.next=node2;

        Node Currentnode=node;

        while (Currentnode!=null){
            System.out.print(Currentnode.value+"->");
            Currentnode=Currentnode.next;
        }
    }
}
