package com.abdurashid.showtoastlibrary

import android.content.Context
import android.widget.Toast

class ShowToast {
    companion object {
        fun showMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

}