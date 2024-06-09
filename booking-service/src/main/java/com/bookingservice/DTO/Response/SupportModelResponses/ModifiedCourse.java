package com.bookingservice.DTO.Response.SupportModelResponses;


import com.bookingservice.Enums.COURSE_TYPE;
import com.bookingservice.Enums.STATUS;
import com.bookingservice.Models.SupportModels.Course;
import com.bookingservice.Models.SupportModels.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ModifiedCourse {
    private UUID id;
    private String code;
    private String name;
    private COURSE_TYPE courseType;
    private String department;
    private Short semester;
    private ModifiedStaffSimple coordinator;
    private Set<ModifiedStaffSimple> responsibleStaffs= new HashSet<>();
    private STATUS status;

    public ModifiedCourse(Course course){
        this.id=course.getId();
        this.code= course.getCode();
        this.name=course.getName();
        this.courseType=course.getCourseType();
        this.semester=course.getSemester();

        if(course.getCoordinator() != null){
            this.coordinator = new ModifiedStaffSimple(course.getCoordinator());
        }

        if(course.getDepartment() != null){
            this.department = course.getDepartment().getName();
        }

        Set<Staff> responsibleStaffs = course.getResponsibleStaffs();
        if (responsibleStaffs != null) {
            for (Staff staff : responsibleStaffs) {
                this.responsibleStaffs.add(new ModifiedStaffSimple(staff));
            }
        }


    }
}
