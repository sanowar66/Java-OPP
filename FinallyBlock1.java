public class FinallyBlock1{

    public static void main(String [] args){

      try{
        int x=10/0;
      }  
        
      finally{System.out.println("This will be called");}

    }
}