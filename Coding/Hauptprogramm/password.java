// Autor: Julian Krieger
// Datum: 15.10.2019

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*; //ARRAYS

public class password extends nordwind_tool {
  
  public static void main(String[] args) {
    
  }
  
  public static boolean check(char[] input){
    boolean return_variable = true;
    char[] password = {'A', 'B', 'C'};
    if(input.length != password.length){
      return_variable = false;
    }
    else {
      return_variable = Arrays.equals(input, password);    
      }
    Arrays.fill(password, '0');
    return return_variable;
  }
}

