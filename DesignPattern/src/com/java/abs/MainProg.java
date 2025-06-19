package com.java.abs;

public class MainProg {

    public static void main(String[] args) {
        String topic = "React";
        
        AbstractFactory obj = new TrainingFactory();  // No space in class name
        Training result = obj.getDetails(topic);      // Fixed typo: getDeatils → getDetails
        
        System.out.println(result.getClass().getSimpleName());
        System.out.println(result.getTrainningDetails()); // Keep this only if your method uses "Trainning"
    }
}
