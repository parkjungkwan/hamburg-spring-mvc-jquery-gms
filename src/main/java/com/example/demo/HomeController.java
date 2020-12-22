package com.example.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String index() {
        logger.info("Project Initialized ... ");
        return "index";
    }
    
    @GetMapping("/move/{dir}/{page}")
    public String move(@PathVariable String dir, @PathVariable String page) {
        logger.info("이동 디렉토리: " + dir);
        logger.info("이동 파일: " + page);
        return String.format("%s/%s", dir, page);
    }

    @GetMapping("/transfer/{dir}/{sub}/{page}")
    public String transfer(@PathVariable String dir, @PathVariable String sub, @PathVariable String page) {
        logger.info("이동 디렉토리: " + dir);
        logger.info("이동 서브 디렉토리: " + sub);
        logger.info("이동 파일: " + page);
        return String.format("%s/%s/%s", dir, sub, page);
    }
	
}
