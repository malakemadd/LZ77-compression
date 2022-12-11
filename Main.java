import java.util.Scanner;


public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the sequence");
        String s;
        boolean flag = true;
        Scanner obj = new Scanner(System.in);
        s = obj.next();
        String Searchwindow = "";
        String Lookahead = s;
        System.out.print("Enter the window size");
        int window_size, lookahead_size;
        window_size = obj.nextInt();
        int difference = 0;
        String longestmatch = "";
        for(int i = 0; i < s.length(); i++) {

            int x; //bnkhzen feh akher index etkrr feh el 7rf


            if(Searchwindow.length() > window_size ) {
                difference = Searchwindow.length() - window_size;
                String temp="";
                for(int j=difference;j<Searchwindow.length();j++) {
                    temp+=Searchwindow.charAt(j);

                }
                Searchwindow = temp;
                //int z = Searchwindow.length() - window_size;

            }

            x = Searchwindow.lastIndexOf(longestmatch + Lookahead.charAt(i));

            if( x != -1) {
                longestmatch = longestmatch + Lookahead.charAt(i);
            }
            else {
                if( i == s.length()-1) {
                    flag = false;

                }

                System.out.print(Searchwindow.length() - Searchwindow.lastIndexOf(longestmatch) + " , ");
                System.out.print( longestmatch.length() + " , ");
                System.out.println(Lookahead.charAt(i));


                Searchwindow = Searchwindow + longestmatch;
                Searchwindow = Searchwindow + Lookahead.charAt(i);
                longestmatch = "";
            }

        }
        if(flag == true) {

            System.out.print(Searchwindow.length() - Searchwindow.lastIndexOf(longestmatch) + " , ");
            System.out.print( longestmatch.length() + " , ");
            System.out.println("NULL");

        }
    }

}