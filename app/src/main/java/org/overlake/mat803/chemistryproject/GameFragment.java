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

    static private FragmentGameBinding mBinding;
    private static Element currElement;
    private static int currMove;
    private static Element[] elements;
    private ElementListener listener;
    private static Integer[] gameArray;


    public static void initializeViewFeatures() {
        for (int i = 0; i < 54; i++) {
            //elements[i].setTextView(mBinding.elements[i].getName());
            //mBinding.elements[i].getName().setOnClickListener(listener);
        }
    }

    public static void updateCurrElement() {
        currElement = elements[currMove];
    }

    public static void initializeGameArray() {
        gameArray = new Integer[54];
        for(int i = 0; i < 54; i++) {
            gameArray[i] = i;
        }
        List<Integer> intList = Arrays.asList(gameArray);
        Collections.shuffle(intList);
        intList.toArray(gameArray);
    }

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

    static public Element getCurrElement() {
        return currElement;
    }

    public GameFragment() {
    }

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
        initializeViewFeatures();
        initializeGameArray();

        return mBinding.getRoot();
    }
}