package PracticeTests;

public class DuplicateWordCount {
    public static void main(String[] args) {
        String in ="This is a string which needs to be tested for duplicate word count is string";
        int count=1;
        String out[]=in.split(" ");
        System.out.println("Duplicate words in a string: ");
        for (int i=0;i<out.length;i++){
            for (int j=i+1;j<out.length;j++){
                if (out[j].equals(out[i])){
                    count++;
                    out[j]="0";
                }
            }

            //if count>1;
            if (out[i]!="0"){
                System.out.println(out[i]+" = "+count);
                count=1;
            }
        }
    }
}
