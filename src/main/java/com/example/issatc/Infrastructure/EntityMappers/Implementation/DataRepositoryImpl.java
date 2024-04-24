package com.example.issatc.Infrastructure.EntityMappers.Implementation;

import com.example.issatc.Entities.Responses.TeacherWithDepResponse;
import com.example.issatc.Infrastructure.EntityMappers.JpaTeacherRepository;
import com.example.issatc.Ports.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

@RequiredArgsConstructor
public class DataRepositoryImpl implements DataRepository {
    private final JpaTeacherRepository teacherRepository;
    @Override
    public List<TeacherWithDepResponse> getAllTeachers() {
        return this.teacherRepository.getAllTeachers();
    }

    @Override
    public List<TeacherWithDepResponse> getChefs() {
        return this.teacherRepository.getChefs();
    }
}
