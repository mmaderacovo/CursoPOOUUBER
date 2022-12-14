package JAVA;

class Paypal extends Payment{
    Integer idPaypal;
    String email;
    
    public Paypal (Integer idPaypal, String email,Integer id){
        super(id);
        this.id = id;
        this.email = email;
    }
}
