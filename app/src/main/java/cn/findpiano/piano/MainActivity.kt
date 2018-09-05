package cn.findpiano.piano

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cn.findpiano.romsdk.FindMidPlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hw.setText(FindMidPlayer().description())
    }
}
