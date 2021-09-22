/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccineapp;

/**
 *
 * @author fitzg
 */
public class PUElement {
     private int key;
      private vacPatient element;
     
      public PUElement(int priority, vacPatient e){
		key = priority;
                element = e;
	}

      public int getKey() {
		return key;
	}

      public void setKey(int val) {
		key = val;
	}
	
	public vacPatient getElement() {
            return element;
      }

	public void setElement(vacPatient e) {
		element = e;
      }

      public String printVacPatient() {
          String msg ; 
          msg = " name = "+element.getName()+ " "+ "age ="+element.getAge()+ " "+ "medCondition ="+element.getMedCondition();
          return msg;
      }
}

