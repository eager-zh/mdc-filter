package com.github.mdcfilter.controller;

import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

import static com.github.mdcfilter.filter.MdcFilter.REQUEST_ID_ATTRIBUTE_NAME;

@org.springframework.stereotype.Controller
public class Controller {

	private static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@RequestMapping("/handle")
	@ResponseBody
	public String handle(HttpServletRequest request) throws InterruptedException, ExecutionException  {
		Object requestId = MDC.get(REQUEST_ID_ATTRIBUTE_NAME);
		logger.info("Request Id " + requestId + " handled");
		return "Hello, Request ID " + requestId + " handled";
	}

}
