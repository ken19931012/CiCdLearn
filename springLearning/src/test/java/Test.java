import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Test{
    public static void main(String args[]) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符，按下q键退出");
        //读取字符
        do{
             c = (char) br.read();
             System.out.println(c);
        }while (c!='q');
    }
}