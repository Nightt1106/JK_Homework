package com.train

class TicketKotlin() {

    var priceOfTicket : Int = 1000
    var discount : Double = 0.9

    fun totalOfPrice (num : Int, numOfRound : Int) : Double{
        return 2*numOfRound*this.priceOfTicket*this.discount + (num - numOfRound)*priceOfTicket;
    }

}