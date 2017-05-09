package com.carllewis14.goustoextraproducts;

import android.content.Context;
import android.content.Intent;

import com.carllewis14.goustoextraproducts.Activity.MainActivity;

/**
 *
 */

public class Util {

    public static Intent createQuery(Context context, String title, String description, String listprice) {
        // Reuse MainActivity for simplification
        Intent i = new Intent(context, MainActivity.class);
        i.putExtra("title", title);
        i.putExtra("description", description);
        i.putExtra("listprice", listprice);
        return i;
    }
}
