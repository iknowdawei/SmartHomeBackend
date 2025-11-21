package com.smarthome.backend;

public class Main {

	public static void main(String[] args) {
	    System.out.println("Smart Home Backend - Motion Sensor Service");
	    System.out.println("Starting backend demo...");

	    String sensorId = "MotionSensor01";
	    boolean motionDetected = true;

	    logStartup();
	    processMotionEvent(sensorId, motionDetected);
	    
	 // NEW line on feature-diagnostics branch
	    printDiagnostics();

	    System.out.println("Backend processing complete.");
	}

	/**
	 * New method for the second commit demo.
	 */
	private static void logStartup() {
	    System.out.println("Initializing connections to database... (simulated)");
	    System.out.println("Initializing connections to message broker... (simulated)");
	}

	/**
	 * Extracted logic into a separate method for clarity.
	 */
	private static void processMotionEvent(String sensorId, boolean motionDetected) {
	    if (motionDetected) {
	        logEvent(sensorId, "MOTION_DETECTED");
	    } else {
	        logEvent(sensorId, "NO_MOTION");
	    }
	}
	/**
	 * Simple diagnostics method for the feature-diagnostics branch.
	 */
	private static void printDiagnostics() {
	    System.out.println("=== Diagnostics ===");
	    System.out.println("Backend version: 1.0.0");
	    System.out.println("Motion sensor endpoints: OK");
	    System.out.println("Database connection: OK (simulated)");
	    System.out.println("===================");
	}


