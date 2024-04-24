package com.example.issatc.Ports;

import com.example.issatc.Entities.Responses.TeacherWithDepResponse;

import java.util.List;

public interface DataRepository {
    List<TeacherWithDepResponse> getAllTeachers();

    List<TeacherWithDepResponse> getChefs();
}
