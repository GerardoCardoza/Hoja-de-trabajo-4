/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*Factory
******************************/
import java.util.*;

public class Factory{
	private Object datos;

	public Factory(int tipo,int List){
		if(tipo==1)
			datos=new Vector<Object>();
		else if(tipo==2)
			datos=new ArrayList<Object>();
		else
			if(List==1)
				datos=new SingleLikedList();
			else if(List==2)
				datos=new DoubleLinkedList();
			else
				datos=new CircularLinkedList();
	}

	public Object getDatos(){
		return datos;
	}
}