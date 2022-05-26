package org.overlake.mat803.chemistryproject;

import android.widget.TextView;

public class Element {

    //defines basic values for elements
    private String elementName;

    private int elementIndex;
    private TextView elementTextView;

    private static int elementIndexCounter = 1;

    public Element(String name) {
        this.elementName = name;
        this.elementIndex = elementIndexCounter++;
    }

    public TextView getElementTextView() {
        return elementTextView;
    }

    public void setTextView(TextView v) {
        elementTextView = v;
    }

    public String getElementName() {
        return elementName;
    }
}
