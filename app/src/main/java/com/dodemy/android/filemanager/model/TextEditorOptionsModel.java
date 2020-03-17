package com.dodemy.android.filemanager.model;


public class TextEditorOptionsModel {
    int textSize;

    public TextEditorOptionsModel(int textSize) {
        this.textSize = textSize;
    }

    public TextEditorOptionsModel() {
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }
}
