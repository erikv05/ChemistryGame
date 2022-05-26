package org.overlake.mat803.chemistryproject;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


public class ElementListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        GameFragment.compareElements((TextView) view); {
        }
    }
}
