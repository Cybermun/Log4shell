 package com.example;

    import org.apache.logging.log4j.LogManager;
    import org.apache.logging.log4j.Logger;
    import org.springframework.web.bind.annotation.*;

    @RestController // Marks this class as a Spring Boot REST controller
    public class LogController {

        // Initialize a Log4j logger for this class
        private static final Logger logger = LogManager.getLogger(LogController.class);

        // Define a POST endpoint at "/log"
        @PostMapping("/log")
        public String logInput(@RequestBody String input) {
            // Log the user input directly. This is the vulnerable point.
            logger.info("User input: " + input);
            return "Logged: " + input;
        }
    }
    
