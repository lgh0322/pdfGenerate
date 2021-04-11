package com.aaa.myapplication

import android.graphics.pdf.PdfDocument
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.io.File
import java.io.FileOutputStream
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PathUtil.initVar(this)

    }

    fun fuck(view: View) {

        val view=findViewById<ReportBpResultView>(R.id.view)
        val document = PdfDocument()
        val pageInfo = PdfDocument.PageInfo.Builder(
                view.measuredWidth, view.measuredHeight, 1).create()
        val page = document.startPage(pageInfo);
        view.draw(page.canvas);
        document.finishPage(page);

        document.writeTo(FileOutputStream(File(PathUtil.getPathX("fuck.pdf"))))
        document.close()

    }
}