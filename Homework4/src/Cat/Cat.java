package Cat;

public class Cat {
public String name;
public Boolean isItHungry = true;
public void isHungry(){
    if(!isItHungry){
        System.out.println(name+ " is not hungry");
    }
    if(isItHungry){
        System.out.println(name+" is hungry");
    }
    }
    public Cat(String name) {
        this.name = name;
    }
    public void eat (String food) {
        if(!isItHungry){
            System.out.println(name+ " is not hungry");
        }
        if(isItHungry){
        System.out.println(name+" is eating " + food);
        isItHungry = false;
        }
    }
    public void play (String toy){
        System.out.println(name+" is playing around with " + toy);
    }
    public void sleep (int hours){
        System.out.println(name + " is sleeping for " +hours+" hours");
        isItHungry = true;
    }

}
