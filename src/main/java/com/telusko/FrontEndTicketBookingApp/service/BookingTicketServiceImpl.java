package com.telusko.FrontEndTicketBookingApp.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telusko.FrontEndTicketBookingApp.ReqestResponse.Passenger;
import com.telusko.FrontEndTicketBookingApp.ReqestResponse.Ticket;


@Service
public class BookingTicketServiceImpl implements IBookingTicketService {

	private String Booking_URL="http://localhost:8484/TicketBookingApp/api/book-ticket/getTicketNumber";
	private String GET_URL="http://localhost:8484/TicketBookingApp/api/book-ticket/getTicket/{ticketNumber}";



	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = restTemplate.postForEntity(Booking_URL, passenger, Ticket.class);
		
		return responseEntity.getBody();
	}

	
	
	@Override
	public Ticket getFullTicketInfo(Integer ticketNumber) {
		
		RestTemplate restTemplate = new RestTemplate();
		Ticket ticket = restTemplate.getForObject(GET_URL, Ticket.class, ticketNumber);
		
		return ticket;
	}
	
	
	
	

}
