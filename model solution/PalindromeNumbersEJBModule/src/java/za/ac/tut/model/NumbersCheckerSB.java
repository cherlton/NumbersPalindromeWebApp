package za.ac.tut.model;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author MemaniV
 */
@Stateless
@LocalBean
public class NumbersCheckerSB implements NumbersCheckerInterface {

    @Override
    public boolean isNumberValid(int number) throws NumbersException {       
        int remainder = number / 100;
        
        if(remainder > 0 && remainder < 10){
            boolean isValid = true;
            return isValid;
        } else {
            throw new NumbersException(number + " is not a 3-digit number. Hence it is invalid.");
        }
    }  

    @Override
    public boolean isNumberPalindrome(int number)  {
        boolean isPalindrome = false;
        
        if(isThisNumberAPalindrome(number)){
            isPalindrome = true;
        }
     
        return isPalindrome;
    }
    
    private boolean isThisNumberAPalindrome(int number) {
        boolean isAPalindrome = false;
        int  reversedNumber, firstDigit, secondDigit, thirdDigit, rem;
        
        firstDigit = number / 100;
        rem = number % 100;
        secondDigit = rem / 10;
        thirdDigit = rem % 10;
        
        reversedNumber = thirdDigit*100 + secondDigit * 10 + firstDigit;
        
        if(reversedNumber == number){
            isAPalindrome = true;
        }
                
        return isAPalindrome;     
    }

    @Override
    public int setInReverse(int number) {
        int  reversedNumber, firstDigit, secondDigit, thirdDigit, rem;
        
        firstDigit = number / 100;
        rem = number % 100;
        secondDigit = rem / 10;
        thirdDigit = rem % 10;
        
        reversedNumber = thirdDigit*100 + secondDigit * 10 + firstDigit;  
        
        return reversedNumber;
    }
}

