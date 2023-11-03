package com.mvaldiviezoutp.automaticbrightness

import android.app.Service
import android.content.ContentResolver
import android.content.Intent
import android.os.IBinder
import android.provider.Settings

class BrightnessService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Establecer el brillo al máximo
        setBrightnessToMax()
        return Service.START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    private fun setBrightnessToMax() {
        val contentResolver: ContentResolver = contentResolver
        Settings.System.putInt(contentResolver, Settings.System.SCREEN_BRIGHTNESS, 255)
    }
}