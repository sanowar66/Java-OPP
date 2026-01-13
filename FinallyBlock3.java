public class FinallyBlock3{

    public static void main(String [] args){

      try{
        int x=10/0;
        Runtime.getRuntime().halt(1);
      }  
        
      finally{System.out.println("This will be called");}

    }
}