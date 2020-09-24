package com.borzenkov.findpair

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val handler = android.os.Handler()
    private var prevButton: Int = 0
    private var list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Newgame()

    }

    fun click(view: View) {
        when (view.id) {
            R.id.button1 -> handler(button1.id)
            R.id.button2 -> handler(button2.id)
            R.id.button3 -> handler(button3.id)
            R.id.button4 -> handler(button4.id)
            R.id.button5 -> handler(button5.id)
            R.id.button6 -> handler(button6.id)
            R.id.button7 -> handler(button7.id)
            R.id.button8 -> handler(button8.id)
            R.id.button9 -> handler(button9.id)
            R.id.button10 -> handler(button10.id)
            R.id.button11 -> handler(button11.id)
            R.id.button12 -> handler(button12.id)
            R.id.button13 -> handler(button13.id)
            R.id.button14 -> handler(button14.id)
            R.id.button15 -> handler(button15.id)
            R.id.button16 -> handler(button16.id)
        }
    }
    private fun handler(current: Int){
            val btn:Button = findViewById(current)
            btn.text = list[Integer.parseInt(btn.tag as String)].toString()
            btn.isClickable = false
            if (prevButton != 0) {
                val prevbtn: Button = findViewById(prevButton)
                if (list[Integer.parseInt(btn.tag as String)] == list[Integer.parseInt(prevbtn.tag as String)]) {
                    btn.isEnabled = false
                    prevbtn.isEnabled = false
                    prevButton = 0
                    win()
                } else {
                    btblock(0)
                    handler.postDelayed({
                        btn.text = ""
                        prevbtn.text = ""
                        btblock(1)
                    }, 2000)
                    prevButton = 0
                }
            } else prevButton = btn.id
        }

    private fun Newgame() {
        list.shuffle()
    }

    fun Newgameclick(view: View) {
        Newgame()
        prevButton=0
        btblock(2)
        textView.visibility = View.INVISIBLE
    }
    private fun win(){
        if (!button1.isEnabled && !button2.isEnabled && !button3.isEnabled && !button4.isEnabled && !button5.isEnabled && !button6.isEnabled && !button7.isEnabled && !button8.isEnabled && !button9.isEnabled && !button10.isEnabled && !button11.isEnabled && !button12.isEnabled && !button13.isEnabled && !button14.isEnabled && !button15.isEnabled && !button16.isEnabled){
            textView.visibility = View.VISIBLE
        }
    }
    private fun btblock(x: Int){
        when(x){
            1 -> {
                button1.isClickable = true
                button2.isClickable = true
                button3.isClickable = true
                button4.isClickable = true
                button5.isClickable = true
                button6.isClickable = true
                button7.isClickable = true
                button8.isClickable = true
                button9.isClickable = true
                button10.isClickable = true
                button11.isClickable = true
                button12.isClickable = true
                button13.isClickable = true
                button14.isClickable = true
                button15.isClickable = true
                button16.isClickable = true
            }
            0 -> {
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                button10.isClickable = false
                button11.isClickable = false
                button12.isClickable = false
                button13.isClickable = false
                button14.isClickable = false
                button15.isClickable = false
                button16.isClickable = false
            }
            2 -> {
                button1.isClickable = true
                button2.isClickable = true
                button3.isClickable = true
                button4.isClickable = true
                button5.isClickable = true
                button6.isClickable = true
                button7.isClickable = true
                button8.isClickable = true
                button9.isClickable = true
                button10.isClickable = true
                button11.isClickable = true
                button12.isClickable = true
                button13.isClickable = true
                button14.isClickable = true
                button15.isClickable = true
                button16.isClickable = true
                button1.isEnabled = true
                button2.isEnabled = true
                button3.isEnabled = true
                button4.isEnabled = true
                button5.isEnabled = true
                button6.isEnabled = true
                button7.isEnabled = true
                button8.isEnabled = true
                button9.isEnabled = true
                button10.isEnabled = true
                button11.isEnabled = true
                button12.isEnabled = true
                button13.isEnabled = true
                button14.isEnabled = true
                button15.isEnabled = true
                button16.isEnabled = true
                button1.text = ""
                button1.text = ""
                button2.text = ""
                button3.text = ""
                button4.text = ""
                button5.text = ""
                button6.text = ""
                button7.text = ""
                button8.text = ""
                button9.text = ""
                button10.text = ""
                button11.text = ""
                button12.text = ""
                button13.text = ""
                button14.text = ""
                button15.text = ""
                button16.text = ""
            }
        }
    }
}