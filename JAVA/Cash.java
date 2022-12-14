package JAVA;

class Cash extends Payment {
    Integer idCash; 
    
    public Cash (Integer idCash, Integer id){
        super(id);
        this.idCash = idCash;
    }
}
