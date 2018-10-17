/*
 * WeeklyTemp class for tracking temperatures in a 7-day periods.
 * Author: Pawel Buda (Comments were copied and modified from ex. 64, p. 515, Java Illuminated, Anderson, Franceschi)
 * Created: 10-17-2018
 * Edited:
 * */


public class WeeklyTemp {

    // Declare the only instance variable: an array of temperatures.
    int[] temperatures;

    /**
     * Create a constructor method for the WeeklyTemp object
     * accepting an array of seven temperatures as a parameter.
     * @param tempsArr
     * */

    WeeklyTemp(int[] tempsArr) {
        // Use the mutator method:
        setTemperatures(tempsArr);
    }

    /**
     * Create an accessor method for this.temps array.
     * @return the copy of this.temps array
     * */
    public int[] getTemperatures() {
        int[] temporaryArray = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            temporaryArray[i] = temperatures[i];
        }
        return temporaryArray;
    }

    /**
     * Create a mutator method for this.temps array.
     * @param tArray of 7 doubles.
     * */
    public void setTemperatures(int[] tArray) {
        this.temperatures = new int[tArray.length];
        for (int i = 0; i < tArray.length; i++) {
            this.temperatures[i] = tArray[i];
        }
    }

    /**
     * toString method
     * @return dailyTemps daily temperatures for 7 days
     * */
    @Override
    public String toString() {
        String dailyTemps = "Weekly temperatures on Mars\n";
        for (int i = 0; i < temperatures.length; i++) {
            dailyTemps += temperatures[i] + ", ";
        }

        return dailyTemps;
    }

    /**
     * Create a method returning how many temperatures were below freezing, aka, below 32F.
     * Utilize the sequential search algorithm
     * @return belowFreezeCount integer
     * */
    public int getFreezeTemps() {
        int numBelowFreeze = 0;
        for(int i =0; i<temperatures.length; i++) {
            if(temperatures[i] < 32) {
                numBelowFreeze++;
            }
        }

        return numBelowFreeze;
    }

    /**
     * Create a method that returns the index of a maximum value in the array
     * @param arraySize
     * @param array given as input argument to this method
     * @return - maxValueIndex - index of the max value in the array
     * */
    private int getMaxValueIndex(int arraySize, int[] array) {
        int maxIndex;
        int maxValue;
        maxValue = array[0];
        maxIndex = 0;
        for(int i =1; i<arraySize; i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }


    /**
     * Create a method that sorts a copy of the temperatures array from smallest to largest.
     * Utilize the getTemperatures() getter method that was already programmed to obtain a copy of the array.
     * Utilize the selection sort algorithm.
     * @return arrayCopy
     * */
    public int[] temperatureSort() {
        // get the copy of the array
        int[] arrayCopy = this.getTemperatures();
        int maxIndx;
        int temp;

        for(int i=0; i<arrayCopy.length-1; i++) {
            maxIndx = getMaxValueIndex(arrayCopy.length-i,arrayCopy);
            temp = arrayCopy[maxIndx];
            arrayCopy[maxIndx] = arrayCopy[arrayCopy.length-i-1];
            arrayCopy[arrayCopy.length-i-1] = temp;
        }

        return arrayCopy;
    }

    public String tempToString(int[] array) {

        String returnStr = "[ ";
        for(int i=0; i<array.length; i++) {
            if(array.length == 1){
                System.out.println(array[i]);
                returnStr += array[i] + "]";
            } else {

                if(i== array.length-1) {
                    returnStr += Integer.toString(array[i]) + "]";
                }
                else {
                    returnStr += Integer.toString(array[i]) + ", ";
                }
            }
        }
        return returnStr;
    }

    public int[] getHighTemps() {
        int[] tempCopy = temperatureSort();
        int[] highTemp;
        int arrayLen = 0;
        int indx = 0;

        for(int i=0; i<tempCopy.length; i++) {
            if (tempCopy[i] > 50) {
                arrayLen++;
            }
        }
        System.out.println(arrayLen);
        highTemp = new int[arrayLen];
        while(indx < highTemp.length-1) {
            for(int i=0; i<tempCopy.length; i++) {
                if(tempCopy[i] > 50) {
                    highTemp[indx] = tempCopy[i];
                    indx++;
                    System.out.println(tempCopy[i]);
                }
            }
        }

        return highTemp;
    }

}
