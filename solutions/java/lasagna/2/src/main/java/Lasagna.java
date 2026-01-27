public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }
    
    public int remainingMinutesInOven(int actualMinutesInOven) {
        int remainingMinutes = expectedMinutesInOven() - actualMinutesInOven;
        return remainingMinutes;
    }
    
    public int preparationTimeInMinutes(int numberOfLayers) {
        int minutesAmount = numberOfLayers*2;
        return minutesAmount;
    } 
    
    public int totalTimeInMinutes(int numbersOfLayers, int actualMinutesInOven) {
        int totalTime = preparationTimeInMinutes(numbersOfLayers) + actualMinutesInOven;
        return totalTime;
    } 
}
