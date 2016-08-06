package model;

public class HealthCheckLogic {
	public void execute(Health health){
		//calcurate BMI
		double weight = health.getWeight();
		double height = health.getHeight();
		double bmi = weight / (height / 100.0 * height / 100.0);
		health.setBmi(bmi);

		//judge bodyType from BMI and set it
		String bodyType;
		if(bmi < 18.5){
			bodyType = "slim";
		}else if(bmi < 25){
			bodyType = "normal";
		}else{
			bodyType = "fat";
		}
		health.setBodyType(bodyType);
	}
}
