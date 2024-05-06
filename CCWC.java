import java.io.*;

public class CCWC {
    public static void main(String[] args) {
        if (args.length != 2 || !args[0].equals("-c")) {
            System.out.println("Usage: java CCWC -c <file>");
            return;
        }

        String fileName = args[1];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
            return;
        }

        long byteCount = 0;
        try (FileInputStream fis = new FileInputStream(file)) {
            byteCount = fis.available();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(byteCount + " " + fileName);
    }
}
