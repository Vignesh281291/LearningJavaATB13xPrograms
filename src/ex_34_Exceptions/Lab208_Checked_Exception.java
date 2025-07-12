package ex_34_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab208_Checked_Exception {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("c://test.txt");
    }
}
