package Singleton;

public class Runner {
	
	public static void main(String[] args) {
        // Get the WebsiteStatusChecker instance
        WebsiteStatusChecker checker = WebsiteStatusChecker.getInstance();

        String websiteUrl = "https://www.example.com";
        boolean status = checker.checkWebsiteStatus(websiteUrl);
        if (status) {
            System.out.println(websiteUrl + " is UP");
        } else {
            System.out.println(websiteUrl + " is DOWN");
        }
    }
}
