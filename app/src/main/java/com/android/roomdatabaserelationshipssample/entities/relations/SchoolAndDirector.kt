package com.android.roomdatabaserelationshipssample.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.android.roomdatabaserelationshipssample.entities.Director
import com.android.roomdatabaserelationshipssample.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,// parent entity
    @Relation(
        parentColumn = "schoolName",// primary key of parent entity
        entityColumn = "schoolName" // foreign key (refers to primary key of parent entity)
    )
    val director: Director // child entity
)