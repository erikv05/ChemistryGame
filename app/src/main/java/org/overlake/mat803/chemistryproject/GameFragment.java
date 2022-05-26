package org.overlake.mat803.chemistryproject;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.overlake.mat803.chemistryproject.databinding.FragmentGameBinding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameFragment extends Fragment {

    /** binding for GameFragment */
    static private FragmentGameBinding mBinding;

    /** current element being guessed that is stored as element */
    private static Element currElement;

    /** current move (starting at 0) */
    private static int currMove;

    /** array of all elements in game */
    private static Element[] elements;

    /** randomized array of ints from 0, 53 indicating element guessing order */
    private static Integer[] gameArray;

    /** gets TextView of a certain id
     *
     * @param id id of TextView as string
     * @return TextView
     */
    public static TextView getTextView(String id) {
        //this will be changed to get text view for specific element
        return mBinding.Na;
    }

    /** changes element that is being guessed and makes last element text visible */
    public static void updateCurrElement() {
        currElement.setVisible();
        currElement = elements[currMove];
    }

    /** shuffles and creates gameArray */
    public static void initializeGameArray() {
        gameArray = new Integer[54];
        for(int i = 0; i < 54; i++) {
            gameArray[i] = i;
        }
        List<Integer> intList = Arrays.asList(gameArray);
        Collections.shuffle(intList);
        intList.toArray(gameArray);
    }

    /** initializes array of all elements used */
    public static void initializeElementArray() {
        elements = new Element[54];
        elements[0] = new Element("H");
        elements[1] = new Element("He");
        elements[2] = new Element("Li");
        elements[3] = new Element("Be");
        elements[4] = new Element("B");
        elements[5] = new Element("C");
        elements[6] = new Element("N");
        elements[7] = new Element("O");
        elements[8] = new Element("F");
        elements[9] = new Element("Ne");
        elements[10] = new Element("Na");
        elements[11] = new Element("Mg");
        elements[12] = new Element("Al");
        elements[13] = new Element("Si");
        elements[14] = new Element("P");
        elements[15] = new Element("S");
        elements[16] = new Element("Cl");
        elements[17] = new Element("Ar");
        elements[18] = new Element("K");
        elements[19] = new Element("Ca");
        elements[20] = new Element("Sc");
        elements[21] = new Element("Ti");
        elements[22] = new Element("V");
        elements[23] = new Element("Cr");
        elements[24] = new Element("Mn");
        elements[25] = new Element("Fe");
        elements[26] = new Element("Co");
        elements[27] = new Element("Ni");
        elements[28] = new Element("Cu");
        elements[29] = new Element("Zn");
        elements[30] = new Element("Ga");
        elements[31] = new Element("Ge");
        elements[32] = new Element("As");
        elements[33] = new Element("Se");
        elements[34] = new Element("Br");
        elements[35] = new Element("Kr");
        elements[36] = new Element("Rb");
        elements[37] = new Element("Sr");
        elements[38] = new Element("Y");
        elements[39] = new Element("Zr");
        elements[40] = new Element("Nb");
        elements[41] = new Element("Mo");
        elements[42] = new Element("Tc");
        elements[43] = new Element("Ru");
        elements[44] = new Element("Rh");
        elements[45] = new Element("Pd");
        elements[46] = new Element("Ag");
        elements[47] = new Element("Cd");
        elements[48] = new Element("In");
        elements[49] = new Element("Sn");
        elements[50] = new Element("Sb");
        elements[51] = new Element("Te");
        elements[52] = new Element("I");
        elements[53] = new Element("Xe");
    }

    /** getter for currElement
     *
     * @return currElement
     */
    static public Element getCurrElement() {
        return currElement;
    }

    /** required default constructor */
    public GameFragment() {
    }

    /** checks if user input is correct
     *
     * @param v TextView of element that is clicked
     */
    static public void compareElements(TextView v) {
        if(GameFragment.getCurrElement().getElementTextView() == v) {
            mBinding.moveText.setText(R.string.correct_text);
        }
        else {
            mBinding.moveText.setText(R.string.incorrect_text);
        }

        currMove++;
        updateCurrElement();
    }



    /** required onCreate override */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentGameBinding.inflate(inflater);
        initializeElementArray();
        initializeGameArray();

        return mBinding.getRoot();
    }
}