package com.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.Pattern.decorator.BasicCar;
import com.Pattern.decorator.Car;
import com.Pattern.decorator.LuxuryCar;

@SpringBootApplication
public class PatternApplication {

  public static void main(String[] args) {
    Car car = new BasicCar();
    car.assembly();

    Car luxurycar = new LuxuryCar(new BasicCar());

    luxurycar.assembly();

    SpringApplication.run(PatternApplication.class, args);
  }

}
