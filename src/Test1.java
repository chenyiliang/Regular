import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test1 {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
        System.out.print("输入你的正则表达式："); 
        Pattern pattern = Pattern.compile(scanner.nextLine()); 
        System.out.print("输入你要匹配的字符串"); 
        Matcher matcher = pattern.matcher(scanner.nextLine()); 
        boolean found = false; 
        while (matcher.find()) { 
            System.out.println("匹配到" + matcher.group() + 
                        "\" 开始于 " + matcher.start() + " 结束语 " + matcher.end() + "."); 
            found = true; 
        } 
        if (!found) { 
            System.out.println("没匹配到！"); 
        } 
    } 


}
