package com.zohocrm.services;

import com.zohocrm.entities.Lead;

public interface LeadService {
	
	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

}
