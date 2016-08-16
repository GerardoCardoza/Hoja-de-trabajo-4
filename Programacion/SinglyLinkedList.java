/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*Singly Linked List
******************************/
import java.util.*;

public class SinglyLinkedList extends AbstractList{
	public Node head;

	public SinglyLinkedList(){
		head = null;
		count = 0;
	}

	public void setHead(Node head){
		this.head=head;
	}

	public Node getHead(){
		return head;
	}

	public int size(){
		Node finger=head;
		while(finger!=null){
			finger=finger.getNext();
			count++;
		}
		return count;
	}

	public int isEmpty(){
		if(count==0)
			return true;
		else
			return false;
	}

	public Object getLast(){
		Node finger=head;
		while(finger.next()!=null){
			finger=finger.getNext();
		}
		return finger;
	}

	public void push(Object valor){
		Node newNode=new Node(valor,null);
		if (head != null){
			Node finger = head;
			while (finger.getNext() != null){
				finger = finger.getNext();
			}
			finger.setNext(newNode);
		}
		else
			head = newNode;
		count++;
	}

	public Object pop(){
		Node finger=head;
		int temp=0;
		while(finger.next()!=null){
			finger=finger.getNext();
			temp++;
		}
		count--;
		return finger;
		Node tempNode=head;
		if(temp!=0){
			tempNode=tempNode.getNext();
			temp--;
		}
		tempNode.setNext(null);	
	}

	public void clear(){
		head=null;
	}
}