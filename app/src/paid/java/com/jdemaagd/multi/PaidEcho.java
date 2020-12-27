package com.jdemaagd.multi;

import android.util.Log;

import com.jdemaagd.multi.Echo;

import java.util.ArrayList;
import java.util.Collection;

public class PaidEcho extends Echo {
    public static <T> Collection<T> echo(T o, int count, boolean log) {
        if (log) Log.i(Echo.class.getName(), o.toString());

        Collection<T> collection = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            collection.add(o);
        }

        return collection;
    }

    public static <T> Collection<T> echo(T o, int count) {
        return echo(o, count, false);
    }
}
