package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

/**
 * Created by pc on 06/12/2016.
 */


@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Test
    public void testJoke() throws Exception {
        GetJokeTask jokeTask = new GetJokeTask();
        jokeTask.execute(InstrumentationRegistry.getContext());
        String joke = jokeTask.get(30, TimeUnit.SECONDS);
        Assert.assertNotNull(joke);
    }
}
