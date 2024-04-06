package za.ac.tut.model;

import javax.ejb.Local;

/**
 *
 * @author MemaniV
 */
@Local
public interface NumbersCheckerInterface {
    public boolean isNumberValid(int number) throws NumbersException;
    public boolean isNumberPalindrome(int number);
    public int setInReverse(int number);
}

