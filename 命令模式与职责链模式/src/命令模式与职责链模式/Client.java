package ����ģʽ��ְ����ģʽ;

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
            // ����exit��quit���˳�
            if (input.equals("quit") || input.equals("exit")) {
                return;
            }
            System.out.println("ִ�н����" + invoker.exec(input));
        }
    }
}
