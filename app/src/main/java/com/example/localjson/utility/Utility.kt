package com.example.localjson.utility

import android.content.Context
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset
import org.json.JSONException
import org.json.JSONObject

object Utility {

     fun loadJSONFromAsset(context: Context): String {
        val json: String?
        try {
            val inputStream:InputStream =context.assets.open("user_list.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            val charset: Charset = Charsets.UTF_8
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, charset)
        }
        catch (ex: IOException) {
            ex.printStackTrace()
            return ""
        }
        return json
    }
     fun getJSONFromAssets(context: Context): String? {

        var json: String? = null
        val charset: Charset = Charsets.UTF_8
        try {
            val myUsersJSONFile = context.assets.open("Users.json")
            val size = myUsersJSONFile.available()
            val buffer = ByteArray(size)
            myUsersJSONFile.read(buffer)
            myUsersJSONFile.close()
            json = String(buffer, charset)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json
    }
}