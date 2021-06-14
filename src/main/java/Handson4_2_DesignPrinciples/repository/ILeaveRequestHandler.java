package Handson4_2_DesignPrinciples.repository;

import Handson4_2_DesignPrinciples.model.LeaveRequest;

public interface ILeaveRequestHandler {

	public void HandleRequest(LeaveRequest request);
}
