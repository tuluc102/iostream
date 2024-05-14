import java.io.File;

public class DeleteFile {
  public static void main(String[] args) {
    String path = "D:\\Bài tập tiếng anh\\BT2.docx";
    boolean deleted = deleteFileOrDirectory(path);
    if (deleted) {
      System.out.println("Xoá thành công.");
    } else {
      System.out.println("Không thể xoá thư mục hoặc file.");
    }
  }

  public static boolean deleteFileOrDirectory(String path) {
    File file = new File(path);
    if (!file.exists()) {
      return false;
    }

    if (file.isDirectory()) {
      File[] files = file.listFiles();
      if (files != null) {
        for (File f : files) {
          deleteFileOrDirectory(f.getAbsolutePath());
        }
      }
    }
    return file.delete();
  }
}
