package Singleton;

import java.net.HttpURLConnection;
import java.net.URL;

public class WebsiteStatusChecker {
    // Private static variable to hold the single instance of the class
    private static volatile WebsiteStatusChecker instance;

    // Private constructor to prevent instantiation from outside the class
    private WebsiteStatusChecker() {}

    // Public static method to get the single instance of the class
    public static WebsiteStatusChecker getInstance() {
        // Double-checked locking to ensure thread safety
        if (instance == null) {
            synchronized (WebsiteStatusChecker.class) {
                if (instance == null) {
                    instance = new WebsiteStatusChecker();
                }
            }
        }
        return instance;
    }

    // Method to check the status of a website
    public synchronized boolean checkWebsiteStatus(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            return (responseCode == HttpURLConnection.HTTP_OK);
        } catch (Exception e) {
            System.err.println("Error while checking website status: " + e.getMessage());
            return false;
        }
    }

    // Example main method to demonstrate usage
    
}
