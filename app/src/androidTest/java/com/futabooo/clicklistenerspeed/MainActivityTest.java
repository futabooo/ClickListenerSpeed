package com.futabooo.clicklistenerspeed;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.robotium.solo.Solo;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo mSolo;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        mSolo = new Solo(getInstrumentation(), getActivity());
        super.setUp();
        getActivity().arrayList.clear();
    }

    public void tearDown() throws Exception {
        mSolo.finishOpenedActivities();
        super.tearDown();
    }

    public void testClickButton1() {
        for (int i = 0; i < 100; i++) {
            mSolo.clickOnButton("button1");
        }
        long sum = 0;
        for (int i = 0; i < getActivity().arrayList.size(); i++) {
            sum =+ getActivity().arrayList.get(i);
        }
        Log.d("Button1 平均タイム = ", "" + sum/getActivity().arrayList.size());
    }

    public void testClickButton2() {
        for (int i = 0; i < 100; i++) {
            mSolo.clickOnButton("button2");
        }
        long sum = 0;
        for (int i = 0; i < getActivity().arrayList.size(); i++) {
            sum =+ getActivity().arrayList.get(i);
        }
        Log.d("Button2 平均タイム = ", "" + sum/getActivity().arrayList.size());
    }

    public void testClickButton3() {
        for (int i = 0; i < 100; i++) {
            mSolo.clickOnButton("button3");
        }
        long sum = 0;
        for (int i = 0; i < getActivity().arrayList.size(); i++) {
            sum =+ getActivity().arrayList.get(i);
        }
        Log.d("Button3 平均タイム = ", "" + sum/getActivity().arrayList.size());
    }
}