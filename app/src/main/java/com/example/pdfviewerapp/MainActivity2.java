package com.example.pdfviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity { @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main2);
        PDFView pdfView=findViewById(R.id.pd);
        int s=getIntent().getIntExtra("pos",0);
       switch (s){
           case 0:
               pdfView.fromAsset("amcat_certificate.pdf").load();break;
           case 1:
               pdfView.fromAsset("android_components_coursera.pdf").load();break;
           case 2:
               pdfView.fromAsset("build_simple_app{coursera}_{1}.pdf").load();break;
           case 3:
               pdfView.fromAsset("table_layout_(coursera)_(1).pdf").load();break;
           case 4:
               pdfView.fromAsset("coursera_android.pdf").load();break;
           case 5:
               pdfView.fromAsset("capgemini_tech_challenge.pdf").load();break;
           case 6:
               pdfView.fromAsset("cv.pdf").load();break;
           case 7:
               pdfView.fromAsset("nptel_marksheet.pdf").load();break;
           case 8:
               pdfView.fromAsset("1g_5g.pdf").load();break;
           case 9:
               pdfView.fromAsset("a.pdf").load();break;
           case 10:
               pdfView.fromAsset("b.pdf").load();break;
           case 11:
               pdfView.fromAsset("c.pdf").load();break;
           case 12:
               pdfView.fromAsset("d.pdf").load();break;
           case 13:
               pdfView.fromAsset("e.pdf").load();break;
           case 14:
               pdfView.fromAsset("project.pdf").load();break;
           case 15:
               pdfView.fromAsset("thesis.pdf").load();break;
               
       }

    }
}