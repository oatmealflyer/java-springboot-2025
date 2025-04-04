package com.oatmealflyer.spring05;

//부모클래스 동물
public class Animal { //public 어디서든지 불러서 사용가능 
    // String name; // default 
    // public String name; //public 
    private String name; //private 
    //protected String name;  //protected 
    private int age; //동물의 나이 
    
    public int getAge(){
        return age;
    }
    
    //정확한 캡슐화를 위해서 필터링 
    public void setAge(int age){
        //음수나 너무 큰 수가 들어가지 않도록 막아줌 
        
    }
    
    void setName(String name){
        this.name = name;
    }

    String getName() {
        return this.name;
    }
    void cry(){
        System.out.println(this.name+"이 웁니다");
    }
}
