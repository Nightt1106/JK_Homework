package com.train

class TicketKotlin() {

    var priceOfTicket : Int = 1000
    var discount : Double = 0.9

    fun totalOf_price (num : Int, num_round : Int) : Double{
        return 2*num_round*this.priceOfTicket*this.discount + (num - num_round)*priceOfTicket;
    }

}