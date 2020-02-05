package jp.mydns.dego.sampleviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class SampleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater aInflater,
                             ViewGroup aContainer,
                             Bundle aSavedInstanceState) {
        return aInflater.inflate(R.layout.sample_fragment, aContainer, false);
    }
}
