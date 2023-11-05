package com.example.a3_lab.repository

import androidx.lifecycle.LiveData
import com.example.a3_lab.service.NoteService
import com.example.a3_lab.model.Note

class NoteRepository(private val noteService: NoteService) {
    val allNotes: LiveData<List<Note>> = noteService.getAllNotes()

    suspend fun insert(note: Note) {
        noteService.insert(note)
    }
    suspend fun delete(note: Note){
        noteService.delete(note)
    }

    suspend fun update(note: Note){
        noteService.update(note)
    }
}