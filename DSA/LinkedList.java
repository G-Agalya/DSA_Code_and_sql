package placement;

public class linkedlist {
      Node head;
      public class Node{
    	  int data;
    	  Node next;
    	 public Node(int val){
    		  data=val;
    		  next=null;
    	  }
		
      }
      linkedlist(){
    	  head=null;
      }
      public void insertAtfirst(int val) {
    	  Node newnode=new Node(val);
    	  if(head==null) {
    		  head=newnode;
    	  }
    	  else {
    		  newnode.next=head;
    		  head=newnode;
    	  }
      }
      public void insertAtLast(int val) {
    	  Node newnode1=new Node(val);
    	  if(head==null) {
    		  head=newnode1;
    		  return;
    	  }
    	  
    		  Node temp1=head;
    		  while(temp1.next!=null) {
    			  temp1=temp1.next;
    		  }
    		  temp1.next=newnode1;
    		  
    	  
    	  
      }
      public void maxval(){
    	  Node temp=head;
    	  int max=Integer.MIN_VALUE;
    	  while(temp!=null) {
    		  if(temp.data>max) {
    			  max=temp.data;
    		  }
    		  temp=temp.next;
    	  }
    	  System.out.print(max);
      }
      public void display(){
    	  Node temp=head;
    	  while(temp!=null) {
    		  System.out.print(temp.data+" ");
    		  temp=temp.next;
    	  }
    	  
      }
      public void insertAtpos(int pos,int val) {
    	  Node newnode =new Node(val);
    	  if(head==null) {
    		  head=newnode;
    	  }
    	  else {
    		  int c=0;
    		  Node temp=head;
    		  while(temp.next!=null) {
    			  if(c<pos) {
    				  newnode.next=temp.next.next;
    				  temp.next=newnode;
    			  }
    			  c++;
    			  temp=temp.next;
    		  }
    	  }
      }
     public void deleteAtLast() {
    	 if(head==null) {
    		 System.out.print("no");
    	 }
    	 if(head.next==null) {
    		 head=null;
    	 }
    	 Node temp=head; 
    	 while(temp.next.next!=null) {
    		  temp=temp.next;
    		 
    	 }
    	 temp.next=null;
      }
     public void deleteAtpos(int pos) {
    	 if(pos==0) {
    		 head=null;
    		 return;
    	 }
    	 Node temp=head;
    	 Node prv=null;
    	 for(int i=1;i<=pos;i++) {
    		 prv=temp;
    		 temp=temp.next;
    	 }
    	 prv.next=temp.next;
    	 
     }
     public void deleteAtfirst() {
    	 if(head==null) {
    		 System.out.print("not");
    		 return;
    	 }
    	  head=head.next;
     }
      
          public static void main(String[] args) {
        	  linkedlist list=new linkedlist();
        	 list.insertAtfirst(1);
        	  list.insertAtfirst(2);
        	 list.insertAtfirst(100);
        	 list.insertAtfirst(19);
        	 list.insertAtfirst(10);
        	  list.insertAtLast(200);
        	  list.maxval();
        	  list.insertAtpos(1, 10);
        	  list.display();
        	  //list.deleteAtLast();
        	  //list.deleteAtpos(2);
        	 // list.deleteAtfirst();
        	 // list.display();
        	  
          }
    
}
