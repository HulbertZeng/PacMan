package com.example.pacman

import android.content.res.Resources
import android.content.Context;
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.widget.Button
import java.util.ArrayList

class pacman(ctrl : ArrayList<Button>) {
    var x: Int = 0
    var y: Int = 0
    var width: Int? = null
    var height: Int? = null
    var sprite: Bitmap? = null
    var controls : ArrayList<Button> = ctrl

    fun sprite(screenX : Int, screenY : Int, res : Resources) {
        sprite = BitmapFactory.decodeResource(res, R.drawable.PacMan_Closed)

        width = sprite?.width
        height = sprite?.height
    }

    // button control logic
    fun move_direction() {
        // if right button is clicked
        controls.component1().setOnClickListener() {
            x += 10
        }
        // if left button is clicked
        controls.component2().setOnClickListener() {
            x -= 10
        }
        // if up button is clicked
        controls.component3().setOnClickListener() {
            y += 10
        }
        // if down button is clicked
        controls.component4().setOnClickListener() {
            y -= 10
        }
    }

    // WILL NEED TO ADD DISPLAY FUNCTION
}