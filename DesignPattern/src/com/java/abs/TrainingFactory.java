package com.java.abs;

public class TrainingFactory extends AbstractFactory {

	@Override
	public Training getDetails(String topic) {
		// TODO Auto-generated method stub
		if(topic.equals("Java")) {
		return new JavaTraining();
		
		}
		
		if(topic.equals("Dotnet")) {
		return new JavaTraining();
		
		}
		
		if(topic.equals("React")) {
		return new JavaTraining();
		
		}


		return null;
		
	}

}
