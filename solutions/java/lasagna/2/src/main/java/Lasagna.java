public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int a){
        return expectedMinutesInOven()-a;
    }
    public int preparationTimeInMinutes(int a){
        return a*2;
    }
    public int totalTimeInMinutes(int a,int b){
        return (a*2)+b;
    }
}
