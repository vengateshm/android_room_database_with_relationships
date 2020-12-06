package com.android.roomdatabaserelationshipssample

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.android.roomdatabaserelationshipssample.dao.SchoolDao
import com.android.roomdatabaserelationshipssample.entities.Director
import com.android.roomdatabaserelationshipssample.entities.School
import com.android.roomdatabaserelationshipssample.entities.Student
import com.android.roomdatabaserelationshipssample.entities.Subject
import com.android.roomdatabaserelationshipssample.entities.relations.StudentSubjectCrossRef

@Database(
    entities = [School::class,
        Director::class,
        Subject::class,
        Student::class,
        StudentSubjectCrossRef::class],
    version = 1
)
abstract class SchoolDatabase : RoomDatabase() {
    abstract val schoolDao: SchoolDao

    companion object {
        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context,
                    SchoolDatabase::class.java,
                    "school_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}