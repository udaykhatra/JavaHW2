class PatternLoop_9 {

    public static void main(String[] args) {
        int find =0;
        for (int i=1;i<=5;i++){

            for (int J=1; J<=i; J++)
            {
                find=find+1;
                System.out.print( find );
            }
            System.out.println();
        }
}   }