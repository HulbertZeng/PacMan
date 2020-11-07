package com.example.pacman

import android.content.Context
import android.view.SurfaceView


class GameView : SurfaceView {
    constructor(ctx: Context) : super(ctx)

    val isPlaying: Boolean = true

    // called before run()
    // setups initial character, environment, and item positions
    fun setup() {}

    // game loop
    fun run() {
        while(isPlaying) {
            update()
            draw()
            //sleep()
            // may or may not need sleep()
        }
    }

    // update character positions, score, and game status
    fun update() {}

    // updates the current sprites
    fun draw() {}

}