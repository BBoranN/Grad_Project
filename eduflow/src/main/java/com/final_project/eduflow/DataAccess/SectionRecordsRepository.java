package com.final_project.eduflow.DataAccess;


import com.final_project.eduflow.Data.Entities.SectionRecords;
import com.final_project.eduflow.Data.Entities.SectionRecordsId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRecordsRepository extends JpaRepository<SectionRecords, SectionRecordsId> {
    SectionRecords findBySectionNumber(Integer sectionNumber);
    SectionRecords findByCourseCode(String CourseCode);
    SectionRecords findByTerm(String term);

}
