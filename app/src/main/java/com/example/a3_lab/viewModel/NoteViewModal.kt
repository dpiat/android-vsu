package com.example.a3_lab.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.a3_lab.db.NoteDatabase
import com.example.a3_lab.model.Note
import com.example.a3_lab.repository.NoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteViewModal(application: Application) : AndroidViewModel(application) {
    val allNotes: LiveData<List<Note>>
    private val noteRepository: NoteRepository

    init {
        val noteService = NoteDatabase.getDatabase(application).getNoteService()
        noteRepository = NoteRepository(noteService)
        allNotes = noteRepository.allNotes
    }

    fun deleteNote(note: Note) = viewModelScope.launch(Dispatchers.IO) {
        noteRepository.delete(note)
    }

    fun updateNote(note: Note) = viewModelScope.launch(Dispatchers.IO) {
        noteRepository.update(note)
    }

    fun addNote(note: Note) = viewModelScope.launch(Dispatchers.IO) {
        noteRepository.insert(note)
    }
}