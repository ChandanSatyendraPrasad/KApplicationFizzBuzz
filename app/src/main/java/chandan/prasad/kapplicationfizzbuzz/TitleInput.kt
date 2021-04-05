package chandan.prasad.kapplicationfizzbuzz

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

class TitleInput(context: Context,attributeSet: AttributeSet):LinearLayout(context,attributeSet) {
    init {
        LayoutInflater.from(context).inflate(R.layout.title,this,true)
    }
}