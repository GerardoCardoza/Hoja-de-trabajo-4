/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*DoubleLinkedList
******************************/
import java.util.*;

public class DoubleLinkedList extends AbstractList{
	private DoubleNode head;
	private DoubleNode tail;

	public DoubleLinkedList(){
		head = null;
		count = 0;
		tail=null;
	}

	public void setHead(DoubleNode head){
		this.head=DoubleNode;
	}

	public DoubleNode getHead(){
		return head;
	}

	public void setTail(DoubleNode tail){
		this.tail=tail;
	}

	public DoubleNode getTail(){
		return tail;
	}

	/*******************************
	*********************************/


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
		DoubleNode newNode=new DoubleNode(valor,null);
		if (head != null){
			Node finger = head;
			while (finger.getNext() != null){
				finger = finger.getNext();
			}
			finger.setNext(newNode);
			newNode.setPrevious(finger);
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
		finger.setPrevious(null);
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