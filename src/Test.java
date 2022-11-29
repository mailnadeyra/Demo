import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String s="my road number is 10. My plat numbers are 101,102, 103 .";

        //s= s.replace("^0-9","");

        String[] arr = new String[5];
        int j=0;
        for(int i =0 ;i<s.length();i++){

            String str ="";
            char ch = s.charAt(i);
            int i1 = Integer.parseInt(ch + "");
            if(i1>=0){
                str=str+ch;
            }else{
                arr[i]=str;
                str="";

                j++;
            }
        }
System.out.println(Arrays.toString(arr));
system
System.out.println(Arrays."Rizwana");
    }
}
