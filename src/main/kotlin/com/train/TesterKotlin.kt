package com.train

fun main(){
    val tk = TicketKotlin()
    while(true){
        println("Please enter number of tickets: ")
        val num = readLine()?.toInt()
        if(num==-1) break
        println("How many round-trip tickets: ")
        val numOfRound = readLine()?.toInt()
        print("Total tickets: $num \n Round-trip: $numOfRound \n Total: ${tk.totalOfPrice(num!!, numOfRound!!)} \n")
    }
}