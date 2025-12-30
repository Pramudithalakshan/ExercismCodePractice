
class BirdWatcher {
    private final int[] birdsPerDay;
    private int todayCount =4;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        return todayCount;
    }

    public void incrementTodaysCount() {
       todayCount++;
    }

    public boolean hasDayWithoutBirds() {
       for(int v : birdsPerDay){
          if(v==0){
              return true;
          }
       }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
      int[] tempArray = getLastWeek();
        int count=0;
        if(tempArray.length>numberOfDays){
            for(int i = 0; i < numberOfDays; i++){
             count+=tempArray[i];           
            }
            return count;
        }
        for(int i = 0; i < tempArray.length; i++){
             count+=tempArray[i];           
         }
        return count;
    }

    public int getBusyDays() {
      int busyDays=0;
        for(int v : birdsPerDay){
            if(v>=5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
