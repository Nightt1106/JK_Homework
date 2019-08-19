package com.train;

public class Ticket {

    private int priceOfTicket = 1000;
    private double discount = 0.9;

    /*---------Setting Getting--------------*/
    public int getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(int priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    /*--------------------------------------*/

    //price
    public double totalOfPrice(int num, int numOfRound){
        return 2*numOfRound*this.priceOfTicket*this.discount + (num - numOfRound)*priceOfTicket;
    }

}
