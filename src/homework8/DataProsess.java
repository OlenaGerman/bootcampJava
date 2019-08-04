package homework8;

import java.util.ArrayList;

public class DataProsess {
    public void DataProsessing(ArrayList<Teacher> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getFirstName() + " " + teachers.get(i).getLastName() + " " + teachers.get(i).getLOS());
        }

    }

    public void DataProsessingAW(ArrayList<Teacher> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getFirstName() + " " + teachers.get(i).getLastName() + " " + teachers.get(i).getAW());


        }
    }

    public void DataPro(ArrayList<Teacher> teachers){
        double years = teachers.get(0).getAW();
        int index = 0;

        for (int i = 0; i < teachers.size();i++){
            if (teachers.get(i).getAW() > years){
                years = teachers.get(i).getAW();
                index = i;
            }
        }
    }


}