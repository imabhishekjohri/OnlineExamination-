package com.main;

import java.util.Scanner;

public class OnlineExamSystem {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        ExamSystem examSystem = new ExamSystem();
		        
		        // Login
		        examSystem.login(scanner);
		        
		        // Update Profile and Password
		        examSystem.updateProfile(scanner);
		        
		        // Selecting answers for MCQs
		        examSystem.selectAnswers(scanner);
		        
		        // Timer and auto submit
		        examSystem.startExam();
		        
		        // Closing session and Logout
		        examSystem.logout();
		    }
		}

		class ExamSystem {
		    private String username;
		    private String password;
		    
		    public void login(Scanner scanner) {
		        System.out.println("Login");
		        System.out.print("Enter username: ");
		        username = scanner.nextLine();
		        System.out.print("Enter password: ");
		        password = scanner.nextLine();
		        // Implement login logic
		    }
		    
		    public void updateProfile(Scanner scanner) {
		        System.out.println("Update Profile and Password");
		        // Implement profile and password update logic
		    }
		    
		    public void selectAnswers(Scanner scanner) {
		        System.out.println("Selecting answers for MCQs");
		        // Implement MCQ selection logic
		    }
		    
		    public void startExam() {
		        System.out.println("Timer and auto submit");
		        // Implement timer and auto submit logic
		    }
		    
		    public void logout() {
		        System.out.println("Closing session and Logout");
		        // Implement logout logic
		    }
		
	

	}


