class segitiga{
    public static void main(String[] args) {
        int a = 10;
        for (int b = 1; b <= a; b++){
            for (int c = 9; c >= b; c--) {
                System.out.print(' ');
            }
            for (int d = 1; d <= b; d++){
                System.out.print('#');
            }
            System.out.println();
        }
    }
}