package pila;

public class Node < E extends Comparable >
{
   private E info;
   private Node <E> next;
   
   public Node ( )
   {
   }
   
   public Node (E x, Node <E> p)
   {
     info = x;
     next = p;
   }
   
   public Node <E> getNext()
   {
     return next;
   }
   
   public void setNext(Node <E> p)
   {
     next = p;
   }
   
   public E getInfo()
   {
     return info;
   }
   
   public void setInfo(E p)
   {
     info = p;
   }

   @Override
   public String toString()
   {
     return info.toString();   
   }
}

