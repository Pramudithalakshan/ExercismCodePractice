public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int remaningTime){
        return expectedMinutesInOven()-remaningTime;
    }
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }
    public int totalTimeInMinutes(int layers,int ovenTime){
        return (layers*2)+ovenTime;
    }
}
