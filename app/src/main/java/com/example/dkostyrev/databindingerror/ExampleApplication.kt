package com.example.dkostyrev.databindingerror

import android.app.Application

class ExampleApplication : Application(), ComponentProvider {
    private lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }

    override fun getComponent() = component
}
