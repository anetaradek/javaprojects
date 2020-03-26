public class ApplicationArgumentsAgain {
    public static void main(String[] args) {
        int a = args.length;
        for(int i=(a-1);i>=0;i--){
            System.out.println(args[i]);
        }
    }
}
