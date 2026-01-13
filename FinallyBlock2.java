public class FinallyBlock2{

    public static void main(String [] args){

      try{
        int x=10/10;
        System.exit(1);
      }  
        
      finally{System.out.println("This will be called");}

    }
}