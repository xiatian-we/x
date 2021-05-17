package 命令模式与职责链模式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Client {
    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        while (true) {
            System.out.println("#");
            String input = (new BufferedReader(new InputStreamReader(System.in)))
                    .readLine();
            // 输入exit或quit则退出
            if (input.equals("quit") || input.equals("exit")) {
                return;
            }
            System.out.println("执行结果：" + invoker.exec(input));
        }
    }
}
