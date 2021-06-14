package Handson4_2_DesignPrinciples.handler;

import Handson4_2_DesignPrinciples.model.LeaveRequest;
import Handson4_2_DesignPrinciples.repository.ILeaveRequestHandler;

import java.util.logging.Logger;

public class Supervisor implements ILeaveRequestHandler {

	private static final Logger LOGGER = Logger.getLogger(Supervisor.class.getName());

	private ILeaveRequestHandler nextHandler;

	@Override
	public void HandleRequest(LeaveRequest request) {

		if (request.getNoOfDays() >= 1 && request.getNoOfDays() < 3) {
			LOGGER.info(
					"Hi " + request.getEmployeeName() + "! Your leave request has been accepted by the Supervisor!");
		} else {
			LOGGER.info("Forwarding your request to the Project Manager!");
			nextHandler = new ProjectManager();
			nextHandler.HandleRequest(request);
		}
	}
}
