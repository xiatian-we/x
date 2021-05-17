package 命令模式与职责链模式;

public class FileManager {
    // ls命令
    public static String ls(String path) {
        return "file1\nfile2\nfile3\nfile4";
    }
 
    // ls-l命令
    public static String ls_l(String path) {
        String str = "drw-rw-rw root system 1024 2018-1-10 18:00 file1/n";
        str += "drw-rw-rw root system 1024 2018-1-10 18:01 file2/n";
        str += "drw-rw-rw root system 1024 2018-1-10 18:02 file3/n";
        return str;
    }
 
    // ls-a命令
    public static String ls_a(String path) {
        return ".\n..\nfile1\nfile2\nfile3";
    }
}
