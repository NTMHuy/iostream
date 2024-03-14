package iostream;

import java.io.File;
import java.util.Scanner;

public class Deletefile {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap duong dan file:");
        String path = scanner.nextLine();

        File file = new File(path);

        if (file.exists()) {
            if (deleteFile(file)) {
                System.out.println("Xoa thanh cong");
            } else {
                System.out.println("Xoa khong thanh cong");
            }
        } else {
            System.out.println("File khong ton tai");
        }

        scanner.close();
    }

    private static boolean deleteFile(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    deleteFile(subFile);
                }
            }
        }
        return file.delete();
    }
}
