package com.example.macbookpro.assignment1;

import java.util.ArrayList;

public class helperclass {

    public String[] strSplitter(String nonFormatedStrong)
    {
        String[] formatted=nonFormatedStrong.split("\n");
        String randAttendences=((int)(Math.random() * (100)) + 10)+"";
        formatted[4]=formatted[4]+"This event is for coding and hacking on fun projects in a social setting, there are no " +
                "talks. Bring your computer and be ready to write code!" +
                "If you have a project to work on leave a message in the " +
                "comments here, or just show up ready to hack! If you're a " +
                "beginner there are usually people working through tutorials for either " +
                "the JS language or the various frameworks, so you'll usually be able to find " +
                "help and people to work with.";
        formatted[5]=formatted[5]+randAttendences;
        return formatted;


    }
}



