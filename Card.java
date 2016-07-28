class Card implements Comparable{
    private String suit;            //can have value such as club, diamond,
    private int pip;

    public Card(String suit, int pip){
        this.suit = suit;
        this.pip = pip;
    }
    public String getColor(){
        if(suit == "spade" || suit == "club") return "black";
        return "red";
    }
    public String getSuit(){
        return suit;
    }
    public String getPip(){
        if(pip == 1) return "A";
        if(pip == 10) return "T";
        if(pip == 11) return "J";
        if(pip == 12) return "Q";
        if(pip == 13) return "K";
        return "" + pip;
    }
    @Override
    public int compareTo(Object anotherCard){
        if(this.pip > ((Card)anotherCard).pip) return 1;
        if(this.pip < ((Card)anotherCard).pip) return -1;
        return 0;
    }
    @Override
    public String toString(){
        return "" + pip + suit;
    }
    public String compareSuit(Card anotherCard){
        if(anotherCard.suit == this.suit) return "same";
        return "different";
    }
    public String compareColor(Card anotherCard){
        if(anotherCard.getColor() == this.getColor()) return "same";
        return "different";
    }
}