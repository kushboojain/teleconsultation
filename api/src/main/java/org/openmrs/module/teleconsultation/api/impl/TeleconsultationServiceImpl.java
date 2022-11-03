package org.openmrs.module.teleconsultation.api.impl;

import org.openmrs.api.context.Context;
import org.openmrs.module.teleconsultation.api.TeleconsultationService;

import java.text.MessageFormat;

public class TeleconsultationServiceImpl implements TeleconsultationService {
	
	private final static String PROP_TC_SERVER = "bahmni.appointment.teleConsultation.serverUrlPattern";
	
	private final static String DEFAULT_TC_SERVER_URL_PATTERN = "https://meet.jit.si/{0}";
	
	public String generateTeleconsultationLink(String uuid) {
		String tcServerUrl = Context.getAdministrationService().getGlobalProperty(PROP_TC_SERVER);
		if ((tcServerUrl == null) || "".equals(tcServerUrl)) {
			tcServerUrl = DEFAULT_TC_SERVER_URL_PATTERN;
		}
		return new MessageFormat(tcServerUrl).format(new Object[] { uuid });
	}
	
}
