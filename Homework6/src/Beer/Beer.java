package Beer;

public class Beer extends Object{
    String name;
    String type;
    double alcoholAmount;
    int volume;

    public Beer(String name,String type,double alcoholAmount,int volume){
        this.name=name;
        this.type=type;
        this.alcoholAmount=alcoholAmount;
        this.volume=volume;
    }
    @Override
    public boolean equals(Object another){
        if(another==null){
            return false;
        }
        if(!(another instanceof Beer)){
            return false;
        }
        Beer anotherBeer = (Beer) another;
        if(this.name!=anotherBeer.name){
            return false;
        }
        if(this.type!=anotherBeer.type){
            return false;
        }
        if(this.alcoholAmount!=anotherBeer.alcoholAmount){
            return false;
        }
        if(this.volume!=anotherBeer.volume){
            return false;
        }
        return true;
    }



}

//Override equals and hashCode methods for class Beer.
//Create another class with main method.
//Create several instances of beers and compare each with another.
//Check hash codes for them.