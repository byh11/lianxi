package Test;

import java.util.Scanner;

public class T_24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder s1=new StringBuilder();
        int i=1;
        boolean b=true;
        if(s.length()%2!=0){
            b=false;
        }
        for (int j = 0; j < s.length(); j++) {
            if(i>=s.length())
                break;
            s1.append(s.substring(i,i+1));
            s=s.substring(0,i)+s.substring(i+1,s.length());
            i++;
        }
        if(b){
            i=1;
        }else {
            i=0;
        }
        while (s.length()!=0){
            for (int j = 0; j < s.length(); j++) {
                if(i>=s.length())
                    break;
                s1.append(s.substring(i,i+1));
                s=s.substring(0,i)+s.substring(i+1,s.length());
                i++;
            }
            if(s.length()%2!=0 && s.length()!=1){
                i=1;
            }else {
                i=0;
            }
        }
        System.out.println(s1.toString());
    }

//    accept  cetcap  ecptca  ctapec  tpcace  paectc
//  abcde  bdaec  debca  ecdab  caebd
//  abcd  bdca  dacb

//    abcdefg
//            bdfaecg
//    dacbefg
//            abfdecg
//    bdcaefg
//            dafbecg
//    abcdefg


//    abcdefgh                  bdfh
//            bdfhcgea
//    dhgafecb
//            haebgcfd
//    abcdefgh
//            bdfhcgea
//    dhgafecb
//            haebgcfd
//    abcdefgh


//    abcdefghi     -acegi
//    bdfhcg        -aei
//    bdfhcge       -ai
//    bafhcgeia
//
//    abcdefghij
//    bdfhj     --acegi
//    bdfhjaei  --cg
//    bdfhjaeigc
//
    //abcdefghijk
//    bdfhj         -acegik
//    bdfhjaeickg



//    abcdefghij
//            bdfhjcgaie


//    abcdefghijkl
//    bdfhjl        -acegik
//    bdfhjl
//            bdfhjlcgkeai

//    abcdefghijklm
//    bdfhjl        -acegikm
//    bdfhjlaeim    -cgk
//
//            bdfhjlaeimgck



//    abcdefghijklmnopqrstuvwxyz
//    bdfhjlnprtvxz                 -acegikmoqsuwy
//    bdfhjlnprtvxzcgkosw           -aeimquy
//    bdfhjlnprtvxzcgkoswaiqy       -emu
//


//            bdfhjlnprtvxzcgkoswaiqymeu


//    askmflskehgkajjdnklasfklaenfjklnaslkdsjgnkejhrnkansjkfnsrkjg
//            smlkhkjdkaflefknsksgkjrknjfskgksgjlknlljensnjfasjdhkanaaenar

}
