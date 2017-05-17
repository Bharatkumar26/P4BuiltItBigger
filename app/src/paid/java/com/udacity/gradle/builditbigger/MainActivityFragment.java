package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bharath.jokesdisplayandroidlib.JokeDisplayActivity;

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);


        Button button = (Button) root.findViewById(R.id.jokebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchJoke();
            }
        });
        return root;
    }

    private void startJokeActivity(String joke){
        Intent mIntent = new Intent(getActivity(),JokeDisplayActivity.class);
        mIntent.putExtra(JokeDisplayActivity.INTENT_EXTRA_JOKE,joke);
        startActivity(mIntent);
    }
    private void fetchJoke(){

        new FetchJokeTask(){

            @Override
            protected void onPostExecute(String joketext) {

                if (joketext != null) {
                    Log.d("log", joketext);

                     startJokeActivity(joketext);

                }
            }
        }.execute();

    }

}
