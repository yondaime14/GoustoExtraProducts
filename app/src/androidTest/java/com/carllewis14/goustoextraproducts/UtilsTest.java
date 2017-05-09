package com.carllewis14.goustoextraproducts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

/**
 * tests put extra functionality works for detail page from main activity
 */
@RunWith(AndroidJUnit4.class)
public class UtilsTest {

    @Test
    public void shouldContainTheCorrectExtras()  throws Exception {
        Context context = mock(Context.class);
        Intent intent = Util.createQuery(context, "title", "description", "listprice");
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("title", extras.getString("title"));
        assertEquals("description", extras.getString("description"));
        assertEquals("listprice", extras.getString("listprice"));
    }

}
