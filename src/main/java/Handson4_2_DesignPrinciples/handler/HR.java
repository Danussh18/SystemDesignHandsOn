package Handson4_2_DesignPrinciples.handler;


import Handson4_2_DesignPrinciples.model.LeaveRequest;
import Handson4_2_DesignPrinciples.repository.ILeaveRequestHandler;

import java.util.logging.Logger;

public class HR implements ILeaveRequestHandler {

	private static final Logger LOGGER = Logger.getLogger(HR.class.getName());

	@Override
	public void HandleRequest(LeaveRequest request) {

		if (request.getNoOfDays() >= 5) {
			LOGGER.info("Hi " + request.getEmployeeName() + "! Your leave request has been accepted by the HR!");
		} else {
			LOGGER.info("Hi " + request.getEmployeeName() + "! Your leave request has been rejected!");
		}
	}
}
