import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            int M = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            
            for(int i = 0; i < M; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String category = st.nextToken();
                map.put(category, map.getOrDefault(category, 0) + 1);
            }
            
            int result = 1;
            
            for(int count : map.values()) {
                result *= (count + 1);
            }
            
            System.out.println(result - 1);
        }
    
    }
}