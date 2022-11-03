class PrintChess{
   // Tupwnei tin  n-osti grammi tis 'skakieras'
   public void Printline(int n, int st){
       for (int i=1;i<n+1;i++){
            if (i != st)
                System.out.print("__|");
            else
                System.out.print("_Q|"); 
        }   
       System.out.println();
   }
}