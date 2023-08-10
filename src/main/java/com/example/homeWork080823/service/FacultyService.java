package com.example.homeWork080823.service;

import com.example.homeWork080823.model.Faculty;

public interface FacultyService {
    Faculty addFaculty (Faculty faculty);
    Faculty findFaculty (long id);
    Faculty editFaculty (long id, Faculty faculty);
    void deleteFaculty (long id);
}
