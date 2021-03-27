/**
 *  Assignment 3
 *  Hyobin Im
 *  991526068
 *  Class: 1211_34780
 */
package hyobin.im.s991526068;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class S991526068Fragment extends Fragment {

    private static final String TAG = "S991526068";
    private PageViewModel pageViewModel;

    public S991526068Fragment() {
        // Required empty public constructor
    }


    public static S991526068Fragment newInstance() {
        return new S991526068Fragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        pageViewModel.setIndex(TAG);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_s991526068, container, false);
    }
}