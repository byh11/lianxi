package zuoye.zuoye1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Text {
    public static void main(String[] args) throws IOException {
        File file=new File("t.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
        String k="";
        String v="";
        Random random=new Random();
        for (int p=0;p<80;++p){
            for (int i=0;i<(random.nextInt(10)+3);++i){
                k+=(char)(random.nextInt(26)+65);
                v+=(char)(random.nextInt(26)+97);
            }
            bufferedWriter.write(k+"="+v+"\n");
            k="";
            v="";
        }
        bufferedWriter.close();
    }
}
