/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccineapp;

import java.util.ArrayList;

/**
 *
 * @author fitzg
 */
public class PriorityQueue implements PUInterface {
    private ArrayList<PUElement> myPQueue;
   
    
    public PriorityQueue() {
        myPQueue = new ArrayList<PUElement>();
        
    } 
    
    public boolean isEmpty() { 
        return myPQueue.isEmpty();
    }
  
    public int size(){
	  return myPQueue.size();
    }

    private int findInsertPosition(int newKey)
      {         
          boolean found;
          PUElement elem;
          int position;
          found = false;
          position =0;
          while (position<myPQueue.size() && !found)
          {
            elem = myPQueue.get(position);
            if(elem.getKey()>newKey)
                position = position +1;
              
            else
            {
                found = true;
            }
          }
         return position;
        }
    
    
    public void enqueue(int priorkey, Object item)
    {
        int index;
        PUElement elem = new PUElement(priorkey,(vacPatient)item);
        
        index = findInsertPosition(priorkey);

        if (index ==size())
            myPQueue.add(elem);
        else
            myPQueue.add(index, elem);
    }



    
    public Object dequeue()
    {
       return myPQueue.remove(0);
    }
    
    
    public String printPQueue()
    {
        String printStr = new String();
        PUElement elem;
        for (int i = 0; i<myPQueue.size();i++)
        {
            elem = myPQueue.get(i);
            printStr = printStr.concat (elem.printVacPatient()+" "+"Priority ="+elem.getKey()+"\n");
        }
        return printStr;
    }
    
}
