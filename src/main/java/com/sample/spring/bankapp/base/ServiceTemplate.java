package com.sample.spring.bankapp.base;

public class ServiceTemplate {
	EmailMessageSender emailMessageSender;
	JmsMessageSender jmsMessageSender;
	WebServiceInvoker webServiceInvoker;
	public EmailMessageSender getEmailMessageSender() {
		return emailMessageSender;
	}
	public void setEmailMessageSender(EmailMessageSender emailMessageSender) {
		this.emailMessageSender = emailMessageSender;
	}
	public JmsMessageSender getJmsMessageSender() {
		return jmsMessageSender;
	}
	public void setJmsMessageSender(JmsMessageSender jmsMessageSender) {
		this.jmsMessageSender = jmsMessageSender;
	}
	public WebServiceInvoker getWebServiceInvoker() {
		return webServiceInvoker;
	}
	public void setWebServiceInvoker(WebServiceInvoker webServiceInvoker) {
		this.webServiceInvoker = webServiceInvoker;
	}	
}
