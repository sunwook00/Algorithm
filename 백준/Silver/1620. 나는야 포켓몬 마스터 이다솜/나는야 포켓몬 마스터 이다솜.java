import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> nameToNumber = new LinkedHashMap<>();
        String[] numberToName = new String[N + 1];
        
        for(int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToNumber.put(name, i);
            numberToName[i] = name;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < M; i++) {
            String answer = br.readLine();
            
            if(nameToNumber.containsKey(answer)) {
                sb.append(nameToNumber.get(answer));
            } else {
                int index = Integer.parseInt(answer);
                sb.append(numberToName[index]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}