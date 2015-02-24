package com.example.signalandlocation;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingFragment extends PreferenceFragment{
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		//load preferences from an XML resource
		addPreferencesFromResource(R.xml.settings);
	}

}
