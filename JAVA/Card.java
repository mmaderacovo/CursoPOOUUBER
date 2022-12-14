package JAVA;

class Card extends Payment {
    Integer idCard;
    int numberCard;
    int ccv;
    int expDate;

    public Card (Integer idCard,int numberCard, int ccv, int expDate,Integer id){
        super(id);
        this.numberCard = numberCard;
        this.ccv = ccv;
        this.expDate = expDate;
        this.idCard = idCard;
    }
}
