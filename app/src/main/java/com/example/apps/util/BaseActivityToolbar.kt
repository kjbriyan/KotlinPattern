package com.example.apps.util

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

public class BaseActivityToolbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        toolbar.title = toolbarTitle
        if (toolbarSubtitle != null) toolbar.subtitle = toolbarSubtitle
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { view: View? -> onToolbarClickBack() }

    }


    protected val toolbar: Toolbar = TODO()
    protected val toolbarTitle: String?
    protected val toolbarSubtitle: String?
        protected get() = null

    protected fun onToolbarClickBack() {
        finish()
    }
}