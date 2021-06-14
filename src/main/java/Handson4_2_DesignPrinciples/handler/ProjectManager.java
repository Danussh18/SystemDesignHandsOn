package Handson4_2_DesignPrinciples.handler;


import Handson4_2_DesignPrinciples.model.LeaveRequest;
import Handson4_2_DesignPrinciples.repository.ILeaveRequestHandler;

import java.util.logging.Logger;

public class ProjectManager implements ILeaveRequestHandler {

	private static final Logger LOGGER = Logger.getLogger(ProjectManager.class.getName());

	private ILeaveRequestHandler nextHandler;

	@Override
	public void HandleRequest(LeaveRequest request) {

		if (request.getNoOfDays() >= 3 && request.getNoOfDays() < 5) {
			LOGGER.info("Hi " + request.getEmployeeName()
					+ "! Your leave request has been accepted by the Project Manager!");
		} else {
			LOGGER.info("Forwarding your request to the HR!");
			nextHandler = new HR();
			nextHandler.HandleRequest(request);
		}
	}
}
