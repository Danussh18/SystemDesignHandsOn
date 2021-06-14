package Handson4_2_DesignPrinciples.main;

import Handson4_2_DesignPrinciples.handler.Supervisor;
import Handson4_2_DesignPrinciples.model.LeaveRequest;
import Handson4_2_DesignPrinciples.repository.ILeaveRequestHandler;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LOGGER.info("Enter employee name:");
		String empName = sc.nextLine();

		LOGGER.info("Enter no. of days for leave:");
		int noOfDays = sc.nextInt();

		LeaveRequest request = new LeaveRequest(empName, noOfDays);
		LOGGER.info("Forwarding your request to the Supervisor!");
		ILeaveRequestHandler handler = new Supervisor();
		handler.HandleRequest(request);
	}
}
