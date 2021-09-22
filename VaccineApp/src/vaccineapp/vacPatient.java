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
public class vacPatient {
    
 private String name;
    private boolean medCondition;
    private int age;
    
    public vacPatient(){
       name = new String();
       medCondition = new Boolean(medCondition);
       age = new Integer(50);
       
 
    }

        public void setName(String n){
            name = n;
        }
        public String getName(){
            return name;
        }
        public void setMedCondition(boolean m){
            medCondition = m;
        }
        public boolean getMedCondition(){
            return medCondition;
        }
        public void setAge(int a){
            age = a;
        }
        public int getAge(){
            return age;
        }
    


}
