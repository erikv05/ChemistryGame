package org.overlake.mat803.chemistryproject;

import android.widget.TextView;

public class Element {

    /** name of element*/
    private final String elementName;

    /** index of element in array */
    private int elementIndex;

    /** TextView assigned to element */
    private TextView elementTextView;

    /** static variable updated on construction of element */
    private static int elementIndexCounter = 0;

    /** listener for all elements */
    private static ElementListener listener = new ElementListener();

    /** GameFragment object for method calls */
    private final GameFragment mFragment = new GameFragment();

    /** default constructor for element */
    public Element(String name) {
        this.elementName = name;
        this.elementIndex = elementIndexCounter++;
        this.elementTextView = mFragment.getTextView(this.elementName);
        this.elementTextView.setOnClickListener(listener);
    }

    /** changes element name to be visible in TextView after a guess */
    public void setVisible() {
        this.elementTextView.setText(this.elementName);
    }

    /** elementTextView getter
     *
     * @return elementTextView
     */
    public TextView getElementTextView() {
        return elementTextView;
    }

    /** elementName getter
     *
     * @return elementName
     */
    public String getElementName() {
        return elementName;
    }
}
