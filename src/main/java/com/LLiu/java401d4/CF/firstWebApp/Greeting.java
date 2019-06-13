package com.LLiu.java401d4.CF.firstWebApp;



import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
       long id;
     String text;
     String language;

       public Greeting(){}

       public Greeting(String language,String text){
           this.language = language;
           this.text =text;
       }


       //getters
    public String getText(){
           return this.text;
    }
    public String getLanguage(){
        return this.language;
    }
}
