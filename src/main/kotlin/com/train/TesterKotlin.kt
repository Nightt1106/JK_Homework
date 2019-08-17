package com.train

fun main(){
    val tk = TicketKotlin()
    while(true){
        println("Please enter number of tickets: ")
        val num = readLine()?.toInt()
        println("How many round-trip tickets: ")
        val numRound = readLine()?.toInt()
        print("Total tickets: $num \n Round-trip: $numRound \n Total: ${tk.totalOf_price(num!!, numRound!!)} \n")
    }
}