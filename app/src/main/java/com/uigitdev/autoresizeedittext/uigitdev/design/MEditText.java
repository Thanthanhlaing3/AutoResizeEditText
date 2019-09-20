package com.uigitdev.autoresizeedittext.uigitdev.design;

import android.graphics.Color;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.cardview.widget.CardView;

import com.uigitdev.autoresizeedittext.R;

public class MEditText {
    private CardView edit_text_card_parent;
    private RelativeLayout edit_text_parent;
    private EditText edit_text;

    public MEditText(View view) {
        setType(view);
    }

    public enum  INPUT_TYPE{
        NUMBER,
        TEXT_PASSWORD,
    }

    private void setType(View view){
        edit_text_card_parent = view.findViewById(R.id.edit_text_card_parent);
        edit_text_parent = view.findViewById(R.id.edit_text_parent);
        edit_text = view.findViewById(R.id.edit_text);
    }

    public String getText(){
        return edit_text.getText().toString();
    }

    public void setBackgroundColor(String backgroundColor){
        edit_text_card_parent.setCardBackgroundColor(Color.parseColor(backgroundColor));
    }

    public void setTextColor(String textColor){
        edit_text.setTextColor(Color.parseColor(textColor));
    }

    public void setHintColor(String hintColor){
        edit_text.setHintTextColor(Color.parseColor(hintColor));
    }

    public void setText(String text){
        edit_text.setText(text);
    }

    public void setType(INPUT_TYPE inputType){
        if(inputType == INPUT_TYPE.NUMBER){
            edit_text.setInputType(InputType.TYPE_CLASS_NUMBER);
        }
        else if(inputType == INPUT_TYPE.TEXT_PASSWORD){
            edit_text.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }
}
