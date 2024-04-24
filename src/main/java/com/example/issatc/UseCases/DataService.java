package com.example.issatc.UseCases;

import com.example.issatc.Entities.Responses.TeacherWithDepResponse;
import com.example.issatc.Ports.DataRepository;
import com.example.issatc.Ports.DataServicePort;

import java.util.List;

public class DataService implements DataServicePort {
    private final DataRepository dataRepository;
    public DataService(DataRepository dataRepository){
        this.dataRepository=dataRepository;
    }

    @Override
    public List<TeacherWithDepResponse> getTeachers(){
        List<TeacherWithDepResponse> list1 =this.dataRepository.getAllTeachers();
        List<TeacherWithDepResponse> list2 =this.dataRepository.getChefs();
        for(int i=0;i<list2.size();i++){

            for(int j=0;j<list1.size();j++){
               if(list1.get(j).getEmail().equals(list2.get(i).getEmail())){
               list1.remove(j);
               list1.add(list2.get(i));
               }
            }
        }
        return list1;

    }


}
