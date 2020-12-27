package com.jdemaagd.jokes;

import com.jdemaagd.jokes.JokeSmith;

public class JokeWizard {
    public String tellAWizardJoke(){
        JokeSmith myJokeSmith = new JokeSmith();
        return "A Wizard says " + myJokeSmith.tellAHandCraftedJoke();
    }
}
