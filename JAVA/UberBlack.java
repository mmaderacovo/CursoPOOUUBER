package JAVA;

import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    Map<String, Map<String,Integer>> typeCarAcepted;
    ArrayList<String> seatsMaterial;

    public UberBlack (String license, Account driver, Map<String, 
    Map<String,Integer>> typeCarAcepted,ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAcepted = typeCarAcepted;
        this.seatsMaterial = seatsMaterial;        
    }
    
}
