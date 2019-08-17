/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumbergame;

/**
 *
 * @author User
 */
public class Player {
    int number = 0; //Переменная для хранения варианта числа
    public void guess(){
        number = (int) (Math.random() * 10);//Вариант числа
        System.out.println("Думаю, это число " + number);
    }
    
}
