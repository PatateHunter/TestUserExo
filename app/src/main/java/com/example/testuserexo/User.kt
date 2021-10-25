package com.example.testuserexo

class User(val email:String, val nom:String, val prenom:String, val age:Int) {

    fun isValid():Boolean{
        if(nom.isEmpty())
            return false
        if(prenom.isEmpty())
            return false
        if(age < 13)
            return false
       return email.matches(Regex("/[a-z0-9_\\-.]+@[a-z0-9_\\-.]+.[a-z]+"))
    }
}