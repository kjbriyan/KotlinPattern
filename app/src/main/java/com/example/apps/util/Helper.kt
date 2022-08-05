package com.example.apps.util

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Helper {
    fun modifyDate(inputDate: String): String? {
        val date = SimpleDateFormat("MMM dd, yyyy").parse(inputDate)
        return SimpleDateFormat("dd/MM/yyyy").format(date)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun currentDate():String?{
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val formatted = current.format(formatter)

        return formatted
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun currentTime():String?{
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("HH:mm")
        val formatted = current.format(formatter)

        return formatted
    }

    fun moveActivity(context: Context?, tujuan: Class<*>) {
        val i = Intent(context, tujuan)
        context?.startActivity(i)
    }

    fun log(text: String) {
        println("Debuglog : $text")
    }

    fun toast(text: String, context: Context?){
        Toast.makeText(context,text, Toast.LENGTH_SHORT).show()
    }
    fun alertDialog(context: Context?, title: String, message: String, positive: Unit){
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton("Yes"){dialog,which -> positive}
        builder.setNegativeButton("no"){dialog,which ->}
        builder.show()
    }

}