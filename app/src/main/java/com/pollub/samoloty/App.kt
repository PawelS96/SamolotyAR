package com.pollub.samoloty

import android.app.Application
import com.pollub.samoloty.database.PlaneDatabase
import com.pollub.samoloty.database.Repository

class App : Application(){

    override fun onCreate() {
        super.onCreate()

        val database = PlaneDatabase.getDatabase(this)
        Repository.create(database)
    }
}