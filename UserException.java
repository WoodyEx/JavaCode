import java.util.*;
class NoBalanceException extends Exception{
    public NoBalanceException(String str){
        super(str);
    }
}
class YesBank{
    public static void main(String arg[]) throws NoBalanceException
    {
        int bal=24;
        int withdraw=50;
        if(withdraw>bal){
            NoBalanceException e=new NoBalanceException("You ain't got that money");
            throw e;
        }
        else{
            System.out.println("Don't you do dope with that");
        }
    }
}
