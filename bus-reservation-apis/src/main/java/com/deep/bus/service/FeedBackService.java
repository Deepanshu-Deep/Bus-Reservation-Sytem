package com.deep.bus.service;

import java.util.List;

import com.deep.bus.entities.Feedback;
import com.deep.bus.exception.FeedBackException;

public interface FeedBackService {

	public Feedback addFeedBack(Feedback fb ,  int reservationid) throws FeedBackException;
	
	public Feedback updateFeedBack (Feedback fb) throws FeedBackException;
	
	public Feedback viewFeedBack( int fedbackid) throws FeedBackException;
	
	public List<Feedback> viewAllFeedBackOfUser() throws FeedBackException;
	
	public List<Feedback> viewAllFeedBacks() throws FeedBackException;
}
