package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;

/**
 * Created by Bharath on 5/9/2017.
 */
public class FetchJokeTaskTest extends AndroidTestCase {

    private static final String TAG = FetchJokeTaskTest.class.getSimpleName();

    public void testFetchesNonEmptyString() {
        FetchJokeTask fetchJokeTask = new FetchJokeTask();
        fetchJokeTask.execute();
        try {
            String joke = fetchJokeTask.get();
            Log.d(TAG, "Joke text: " + joke);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException | ExecutionException e) {
            Log.e(TAG, Log.getStackTraceString(e));
        }
    }

}
