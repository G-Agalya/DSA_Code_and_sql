package doublylinkedList;

public class Double {
      Node head,tail;
      class Node{
    	  int data;
    	  Node next;
    	  Node prv;
    	  Node(int val){
    		  data=val;
    		  next=null;
    		  prv=null;
    	  }
      }
      Double(){
    	  head=null;
    	  tail=head;
      }
      public void insert(int val) {
    	  Node d=new Node(val);
    	  if(head==null) {
    		  head=d;
    		  tail=d;
    	  }
    	  else {
    		  tail.next=d;
    		  d.prv=tail;
    		  tail=d;
    	  }
      }
      public void display() {
    	  Node temp=head;
    	  while(temp!=null) {
    		  System.out.print(temp.data+" ");
    		  temp=temp.next;
    	  }
      }
      public void lasttodis() {
    	  Node temp=tail;
    	  while(temp!=null) {
    		  System.out.print(temp.data+" ");
    		  temp.prv=temp;
    		  temp.prv.next=temp;
    	  }
      }
      public void insertAtfirst(int val) {
    	  Node temp=head;
    	  Node n=new Node(val);
    	  if(head==null) {
    		  head=n;
    	  }
    	  else {
    		  n.next=head;
    		  head.prv=n;
    		  head=n;
    	  }
      }
      public void insertAtLast(int val) {
    	  Node temp=tail;
    	  Node n=new Node(val);
    	  if(head==null) {
    		  head=temp;
    	  }
    	  else {
    		  temp.next=n;
    		  n.prv=temp;
    		  temp=temp.next;
    	  }
    	  tail=temp;
      }
      public void insertAtmid(int val,int pos) {
    	  Node n=new Node(val);
    	  if(pos==0) {
    		  head=n;
    		  
    	  }
    	  else {
    		  Node temp=head;
    		 for(int i=1;i<pos;i++) {
    			 temp=temp.next;
    		 }
    		 n.prv=temp;
    		 n.next=temp.next;
    		 temp.next=n;
    		 temp.next.prv=n;
    	  }
      }
      public void deleteAtfirst() {
    	  Node temp=head;
    	  if(head.next==null) {
    		  head=null;
    	  }
    	  else {
    		  head=head.next;
    		  temp.next=null;
    		  head.prv=null;
    		  
    	  }
      }
      public void deleteAtLast() {
    	  Node temp=tail.prv;
    	  temp.next.prv=null;
    	  temp.next=null;
    	  tail=temp;
      }
      public void deleteAtpos(int pos) {
    	  if(pos==0) {
    		  head=null;
    	  }
    	  else {
    		  Node temp=head;
    		  for(int i=1;i<pos;i++) {
    			  temp=temp.next;
    		  }
    		  temp.next.prv=null;
    		  temp.next=temp.next.next;
    		  temp.next.prv=temp;
    			  
    	  }
      }
      public static void main(String args[]) {
    	  Double list=new Double();
    	  list.insert(1);
    	  list.insert(2);
    	  list.insert(3);
    	  list.insert(4);
    	  list.insertAtfirst(10);
    	  list.insertAtLast(60);
    	  list.insertAtmid(90, 1);
    	 list.deleteAtfirst();
    	 
    	  list.display();
    	  list.deleteAtLast();
    	  System.out.println();
    	  list.deleteAtpos(3);
    	  //list.lasttodis();
    	  list.display();
    	  
    	  
      }
      
}
