package chandan.prasad.kapplicationfizzbuzz

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

class InputOutputUI(context: Context, attributeSet: AttributeSet): LinearLayout(context,attributeSet) {
    init {
        LayoutInflater.from(context).inflate(R.layout.input_user_value,this,true)
    }
}