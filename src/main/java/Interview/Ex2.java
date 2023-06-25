import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {

        String name = "haarrrissh";
        int count;
        char out[]=name.toCharArray();
        System.out.println("Duplicate characters in a string");

        for (int i=0;i<out.length;i++){
            count=1;
            for (int j=i+1;j<out.length;j++){
                if (out[i]==out[j] && out[i]!=' ') {
                    count++;
                    out[j]='0';
                }
            }
            //if count>1
            if (count>1 && out[i]!='0'){
                System.out.println(out[i]);
            }
        }

        }

    }


