public class MainPrefix {
    public static void printPrefix(String input, int length){
        if (length>input.length()){
            return;
        }
        printPrefix(input,(length+1));
        System.out.println(input.substring(0,length));

    }
    public static void hanoiTowers(int n, char src, char aux, char end){
        if (n==1){
            System.out.println("Move from "+src+" to "+end);
        }else {
            hanoiTowers((n - 1), src, end, aux);
            System.out.println("Move from "+src+" to "+end);
            hanoiTowers((n - 1), aux, src, end);
        }
    }
    public static void subsets(String input, int x, String current){
        if (x>=input.length()){
            System.out.println(current);
            return;
        }
        subsets(input,x+1,current+input.charAt(x));
        subsets(input,x+1,current);
    }

    public static void main(String[] args) {
        System.out.println();
        subsets("jon",0,"");

    }
}
//abscd