package com.jdemaagd.multi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jdemaagd.jokes.JokeSmith;
import com.jdemaagd.jokes.JokeWizard;
import com.jdemaagd.jokes.Joker;

import androidx.fragment.app.Fragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        TextView textView = rootView.findViewById(R.id.text_view);
        Joker myJoker = new Joker();
        textView.setText(myJoker.getJoke());

        JokeWizard myJokeWizard = new JokeWizard();
        TextView wizardTextView = rootView.findViewById(R.id.wizardJokeTextView);
        wizardTextView.setText(myJokeWizard.tellAWizardJoke());

        JokeSmith myJokeSmith = new JokeSmith();
        TextView handcraftedJokeTextView = rootView.findViewById(R.id.handcraftedJokeTextView);
        handcraftedJokeTextView.setText(myJokeSmith.tellAHandCraftedJoke());

        return rootView;
    }
}
