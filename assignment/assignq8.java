package test;

public class assignq8 
{
    public static void main(String[] args) {

	      for(int i = 1; i <= 5; i++) {

	      int num;

	       if(i % 2 == 0)
	          num = 0;
	          else
	           num = 1;
	          int length;
           if(i <= 3)
	          length = i;
	          else
	          length = i + 1;
      for(int j = 1; j <= length; j++) {
	         System.out.print(num);
                 if(num == 0)
	                num = 1;
	              else
	                num = 0;
	            }
               System.out.println();
	        }
	    }
	}
