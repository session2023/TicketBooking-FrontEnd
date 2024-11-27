package com.telusko.FrontEndTicketBookingApp.service;

import com.telusko.FrontEndTicketBookingApp.ReqestResponse.Passenger;
import com.telusko.FrontEndTicketBookingApp.ReqestResponse.Ticket;

public interface IBookingTicketService {
	
	public Ticket bookTicket(Passenger passenger);
	public Ticket getFullTicketInfo(Integer ticketNumber);

}
