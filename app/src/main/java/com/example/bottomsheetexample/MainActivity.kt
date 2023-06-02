package com.example.bottomsheetexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    private lateinit var btnShowBottomSheet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicilizarComponentes()
        buttomSheet()

    }

    private fun buttomSheet() {
        btnShowBottomSheet.setOnClickListener {

            val dialog = BottomSheetDialog(this)

            //iflando layout
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)

            val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)

            //eventpo do botao de ocultar
            btnClose.setOnClickListener {
                dialog.dismiss()
            }

            dialog.setCancelable(false)

            dialog.setContentView(view)

            //apresentar bottomsheet
            dialog.show()
        }
    }

    private fun inicilizarComponentes() {
        btnShowBottomSheet = findViewById(R.id.idBtnShowBottomSheet)
    }
}