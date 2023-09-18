package com.example.noteapplication.data.local

import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapplication.data.local.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false

)
abstract class NoteDatabase:RoomDatabase() {
}