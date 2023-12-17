package com.example.myapplication.primerospasos.Ejercicios.Banco

class Client(var name: String, var bankMoney: Float, var cashMoney: Float) {
    constructor(name: String, cash: Float) : this( name, 0f, cash)
    fun deposit(moneyToDeposit: Float, bank: Bank) {
        if (cashMoney >= moneyToDeposit) {
            cashMoney -= moneyToDeposit
            bankMoney += moneyToDeposit

            bank.money += moneyToDeposit
        } else {
            println(" - Dinero Insuficiente - ")
        }
    }

    fun show() {
        println("Client: $name Money: $bankMoney")
    }
}