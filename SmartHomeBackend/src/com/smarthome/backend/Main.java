package com.smarthome.backend;

public class Main {

    public static void main(String[] args) {
        System.out.println("Smart Home Backend - Motion Sensor Service");
        System.out.println("Starting backend demo...");

        // Simulate receiving motion sensor data
        String sensorId = "MotionSensor01";
        boolean motionDetected = true;

        if (motionDetected) {
            logEvent(sensorId, "MOTION_DETECTED");
        } else {
            logEvent(sensorId, "NO_MOTION");
        }

        System.out.println("Backend processing complete.");
    }

    /**
     * Very simple 'backend' method to handle motion sensor events.
     * In a real backend, this might save to a database or send data to the cloud.
     */
    private static void logEvent(String sensorId, String status) {
        System.out.println("Logging event from sensor: " + sensorId);
        System.out.println("Status: " + status);
        System.out.println("Saving event to backend system... (simulated)");
    }
}
