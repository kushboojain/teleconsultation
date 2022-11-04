package org.openmrs.module.teleconsultation.api;

import org.openmrs.api.OpenmrsService;

import javax.transaction.Transactional;

@Transactional
public interface TeleconsultationService extends OpenmrsService {
	
	public String generateTeleconsultationLink(String uuid);
}
