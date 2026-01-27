public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven) {
        int remainingMinutes = expectedMinutesInOven() - actualMinutesInOven;
        return remainingMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        int minutesAmount = numberOfLayers*2;
        return minutesAmount;
    } 
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numbersOfLayers, int actualMinutesInOven) {
        int totalTime = preparationTimeInMinutes(numbersOfLayers) + actualMinutesInOven;
        return totalTime;
    } 
}
