package lesson9;

import homework7.User;

public class LogicForArray {

    public void findJava(String[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Java")){
                count = count+1;
            }

        }
        System.out.println(count);
    }

    public void printString(String[] garry){

        for  (int i = 0; i < garry.length; i++){
            System.out.println(garry[i]);


        }
    }

    public void printCat(Cat[] cats){

        for (int i = 0; i < cats.length; i++) {


        }
        System.out.println(cats);


    }


    public void printUser(User[] users){




    }



}
