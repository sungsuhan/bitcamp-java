package com.example.han;

import com.example.han.algorithm.controller.AlgoController;
import com.example.han.auth.controller.MemberController;
import com.example.han.oop.controller.PhoneController;
import com.example.han.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class HanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HanApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		PhoneController phoneController = new PhoneController();
		MemberController memberController = new MemberController();
		QuizController quizController = new QuizController();
		AlgoController algoController = new AlgoController();


		while (true) {
			System.out.println("Main Menu : 0.Exit 1.Auth 2.OOP 3.Quiz 4.Algorithm");
			switch (scanner.next()) {
				case "0" :
					System.out.println("Exit"); return;
				case "1" :
					System.out.println("Auth");
					memberController.execute(scanner);
					break;
				case "2" :
					System.out.println("OOP");
					phoneController.execute(scanner);
					break;
				case "3" :
					System.out.println("Quiz");
					quizController.execute(scanner);
					break;
				case "4" :
					System.out.println("Algorithm");
					algoController.execute(scanner);
					break;
				default:
					System.out.println("Wrong Number"); break;
			}
		}


	}

}
