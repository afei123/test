package JavaCore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by AFei on 2017/11/6.
 */
public class FormatAFei {
    public static void main(String[] args){
        String format = String.format("你好啊,%s,给你%d个苹果", "小明", 4);
        System.out.println(format);
        try {
            Scanner scanner = new Scanner(new File(""));
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNextLine()){
                stringBuilder = stringBuilder.append(scanner.nextLine());
            }
            PrintWriter printWriter = new PrintWriter("");
            printWriter.write(stringBuilder.toString());
            printWriter.write("你想加入的");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
