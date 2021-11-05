package com.mycompany;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LoggerOperations {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerOperations.class);
	


	@MediaType(value = ANY, strict = false)
	@Alias("LOG")
	public void log(@Content 
			InputStream content,@ParameterGroup(name= "customparams") CustomParameters p) {
		
		try {
		  String result  = new BufferedReader(
				new InputStreamReader(content, StandardCharsets.UTF_8))
					.lines()
					.collect(Collectors.joining("\n"));
			
		  LOGGER.info(result);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 
	}

}
