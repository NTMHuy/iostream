package iostream;

import java.io.File;
import java.util.Scanner;

public class filesize {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap duong dan cua file:");
        String filePath = scanner.nextLine();
        
        File file = new File(filePath);

        if (file.exists()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKB = fileSizeInBytes * 1024.0;
            double fileSizeInMB = fileSizeInKB * 1024.0;

            System.out.println("Bytes: " + fileSizeInBytes);
            System.out.println("KB: " + fileSizeInKB);
            System.out.println("MB: " + fileSizeInMB);
        } else {
            System.out.println("File khong ton tai.");
        }

        scanner.close();
    }
}
