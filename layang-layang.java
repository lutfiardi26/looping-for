class Diamond{
    public static void main(String[] args) {
        int a,b,c;
        int x = 3;

        for (a=1; a<x; a++){
            for (b=2; b>=a; b--){
                System.out.print(' ');
            }
            for (c=1; c<a*2; c++){
                System.out.print('*');
            }
            System.out.println();
        }
        for (a=3; a>0; a--){
            for (c=x; c>a; c--){
                System.out.print(' ');
            } 
            for (b=1; b>a*2; b++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}