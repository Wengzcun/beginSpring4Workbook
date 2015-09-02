package com.sample.spring.bankapp.controller;

import com.sample.spring.bankapp.base.ServiceTemplate;
import com.sample.spring.bankapp.domain.Request;

public class UserRequestControllerImpl implements UserRequestController {
	private ServiceTemplate serviceTemplate;

	public void setServiceTemplate(ServiceTemplate serviceTemplate) {
		this.serviceTemplate = serviceTemplate;
	}
	@Override
	public void submitRequest(Request request) {
		serviceTemplate.getJmsMessageSender();
	}
}
