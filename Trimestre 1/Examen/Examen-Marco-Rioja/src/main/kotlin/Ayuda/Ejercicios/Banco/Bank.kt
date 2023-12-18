package com.example.myapplication.primerospasos.Ejercicios.Banco

class Bank(var clients: ArrayList<Client>, var money: Float) {
    constructor() : this(ArrayList<Client>(), 0f)

    fun deposit(client: Client, moneyToDeposit: Float) {
        if (clients.contains(client)) {
            client.deposit(moneyToDeposit,this)
        } else {
            println(" - Cliente no registrado - ")
        }
    }

    fun addClient(client: Client) {
        clients.add(client)
    }

    fun showClients() {
        clients.forEach {
            client -> client
            client.show()
        }
    }
}