import java.util.Scanner;

public class DownloadTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Prompt the user for the file size in MB
            System.out.print("Enter the file size (in MB): ");
            double fileSize = scanner.nextDouble();

            // Prompt the user for the download speed in Mbps
            System.out.print("Enter the download speed (in Mbps): ");
            double downloadSpeed = scanner.nextDouble();

            // Calculate the download time in seconds
            double downloadTime = fileSize / (downloadSpeed / 8);

            // Convert the download time to hours, minutes, and seconds
            int hours = (int) (downloadTime / 3600);
            int minutes = (int) ((downloadTime % 3600) / 60);
            int seconds = (int) (downloadTime % 60);

            // Print the result
            System.out.println("At a download speed of " + downloadSpeed + "Mbps, it will take approximately " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds to download a " + fileSize + "MB file.");
            System.out.print("Do you want to calculate again? (y/n)");
            String ans = scanner.next();
            if(ans.equals("n")){
                break;
            }
        }
    }
}
