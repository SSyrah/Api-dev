package com.example.linux;


public class Dog {
    private String name;
    private int age;
    
    public Dog(String name){
        this.name = name;
        this.age = 0;
               
    }
    
   public void setName (String aName){
       this.name = aName;
   }
   
   public String getName(){
       return name;
   }
   
   public void setAge(int age){
       this.age = age;
   }
   public int getAge(){
       return age;
   }
   
   public void play(){
       System.out.println(this.name + " is playing");
   }
   
   public void play(Dog friend){
       System.out.println(this.name + " is playing with "+ friend.getName() + ".");
   }
   
}
