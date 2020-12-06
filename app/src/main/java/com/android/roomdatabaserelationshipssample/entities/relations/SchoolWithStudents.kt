package com.android.roomdatabaserelationshipssample.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.android.roomdatabaserelationshipssample.entities.School
import com.android.roomdatabaserelationshipssample.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)