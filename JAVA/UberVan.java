package JAVA;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAcepted;
    ArrayList<String> seatsMaterial;

    public UberVan (String license, Account driver){
        super(license, driver);          
    }
}