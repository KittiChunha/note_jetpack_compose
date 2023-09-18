package com.example.noteapplication.data.local.model

import android.provider.ContactsContract.RawContacts.Data
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0,
    val title:String,
    val content:String,
    val createdDate:Data,
    val isBookMarked:Boolean = false,
)