package com.cognizant.authorization.exception;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@NoArgsConstructor
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		super(message);
		log.info("START");
		log.debug("message{}:", message);
		log.info("END");
	}

}
