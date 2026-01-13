public class FinallyBlock{

    public static void main(String [] args){

      try{
        int x=10/0;
      }  
      catch(ArrayIndexOutOfBoundsException a){System.out.println(a);}
      
      finally{System.out.println("This will be called");}

    }
}