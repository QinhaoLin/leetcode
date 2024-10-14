package showmebug;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Java获取某个目录下的所有文件
 */
public class T3670 {
    public static void main(String[] args) {

    }

    /**
     * 查询整个目录下的所有文件
     *
     * @param dirPath 目录
     * @return 文件列表
     */
    public static List<File> searchAllFile(String dirPath) {
        File dir = new File(dirPath);
        List<File> fileList = new ArrayList<>();
        searchFiles(dir, fileList);
        return fileList;
    }


    /**
     * 递归获取某个目录下的所有文件
     *
     * @param dir       被递归的文件/目录
     * @param fileList 文件列表
     */
    public static void searchFiles(File dir, List<File> fileList) {
        // 判断是否是目录
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    searchFiles(file, fileList);
                }
            }
        } else {
            fileList.add(dir);
        }
    }
}
