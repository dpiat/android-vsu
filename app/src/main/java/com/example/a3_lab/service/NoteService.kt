package com.example.a3_lab.service

import com.example.a3_lab.model.Note
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteService {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Note)

    @Update
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("select * from notes order by id asc")
    fun getAllNotes(): LiveData<List<Note>>
}
