package com.example.issatc.Ports;

import com.example.issatc.Entities.Responses.TeacherWithDepResponse;

import java.util.List;

public interface DataServicePort {
    List<TeacherWithDepResponse> getTeachers();
}
