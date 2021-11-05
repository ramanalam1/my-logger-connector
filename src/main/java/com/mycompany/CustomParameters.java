package com.mycompany;

import java.io.InputStream;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class CustomParameters {

	@Parameter
	@Expression(ExpressionSupport.SUPPORTED)
   	@Optional(defaultValue = "#[{correlationId}]")
    private String MessageId;
	
	@Parameter
	@Expression(ExpressionSupport.SUPPORTED)
	@Optional(defaultValue = "FlowName")
    private String flowName;

	@Parameter
	@Expression(ExpressionSupport.SUPPORTED)
    @Optional(defaultValue = "LOG LEVEL")
	private String loglevel;
	
	
	public String getMessageId() {
		return MessageId;
	}

	public void setMessageId(String messageId) {
		MessageId = messageId;
	}

	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public String getLoglevel() {
		return loglevel;
	}

	public void setLoglevel(String loglevel) {
		this.loglevel = loglevel;
	}

	
	
}
