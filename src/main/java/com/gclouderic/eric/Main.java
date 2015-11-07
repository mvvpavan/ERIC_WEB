package com.gclouderic.eric;

import static spark.Spark.get;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//Server server = new Server(Integer.valueOf(System.getenv("PORT")));
     	//port(Integer.valueOf(System.getenv("PORT")));
	    staticFileLocation("/public");


	    get("/", (request, response) -> {
	            Map<String, Object> attributes = new HashMap<>();
	            attributes.put("message", "Hello World!");

	            return new ModelAndView(attributes, "index.ftl");
	        }, new FreeMarkerEngine());
	    
	    get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");

            return new ModelAndView(attributes, "index.ftl");
        }, new FreeMarkerEngine());
	}

	}


