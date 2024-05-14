import java.io.File;

public class FileSizeCalculator {
  public static void main(String[] args) {
    String filePath = "D:\\Bài tập tiếng anh\\BT1.docx";
    long fileSize = getFileSize(filePath);
    if (fileSize != -1) {
      System.out.println("Độ lớn của file là: " + fileSize + " bytes");
    } else {
      System.out.println("File không tồn tại hoặc không thể truy cập.");
    }
  }
  public static long getFileSize(String filePath) {
    File file = new File(filePath);
    if (file.exists() && file.isFile()) {
      return file.length();
    }
    return -1;
  }
}
