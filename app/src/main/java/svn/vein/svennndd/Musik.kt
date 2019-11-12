package svn.vein.svennndd

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.music.*

class Musik:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.music)

        var MediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.bravelyou)

        btn_Play.setOnClickListener {
            MediaPlayer?.start()
        }
        button_pause.setOnClickListener {
            MediaPlayer?.pause()
        }
        button_stop.setOnClickListener {
            MediaPlayer?.stop()
            MediaPlayer?.seekTo(0)
        }

    }
}