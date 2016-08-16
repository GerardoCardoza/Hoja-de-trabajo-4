/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*abstractList
******************************/
import java.util.*;

public class Stack implements IStack{
	private Object datos;

	public Stack(int tipo,int tipo2){

		Factory temp=new Factory(tipo,tipo2);
		datos=temp.getDatos();
	}

	public void push(Object e){
		if(datos.getClass().getName()!="java.util.Vector" || datos.getClass().getName()!="java.util.ArrayList"){
			datos.push(e);
		}
		else
			datos.add(e);	
	}

	public int size(){
		return datos.size();
	}

	public Object pop(){
		if(datos.getClass().getName()!="java.util.Vector"){
			return datos.lastElement();
			datos.remove(datos.lastElement());
		}
		if(datos.getClass().getName()!="java.util.ArrayList"){
			int temp=datos.size();
			return datos.get(temp);
			datos.remove(temp);
		}
		return datos.pop();
	}

	public boolean isEmpty(){
		return datos.isEmpty();
	}

	public void clear(){
		datos.clear();
	}

	public Object getLast(){
		if(datos.getClass().getName()!="java.util.Vector"){
			return datos.lastElement();
		}
		if(datos.getClass().getName()!="java.util.ArrayList"){
			int temp=datos.size();
			return datos.get(temp);
		}
		return datos.pop();
		return datos.getLast();
	}
}