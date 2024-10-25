package com.forsale.app.utils;

import android.app.Activity;
import androidx.core.view.q3;
/* compiled from: ActivityUtils.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final void a(Activity activity) {
        kotlin.jvm.internal.o.i(activity, "<this>");
        activity.getWindow().getDecorView().setBackgroundColor(activity.getResources().getColor(sj.c.J));
        activity.getWindow().setNavigationBarColor(activity.getResources().getColor(sj.c.J));
        q3.a(activity.getWindow(), activity.getWindow().getDecorView()).d(false);
        q3.a(activity.getWindow(), activity.getWindow().getDecorView()).c(false);
    }

    public static final void b(Activity activity) {
        kotlin.jvm.internal.o.i(activity, "<this>");
        activity.getWindow().getDecorView().setBackgroundColor(activity.getResources().getColor(sj.c.O));
        activity.getWindow().setNavigationBarColor(activity.getResources().getColor(sj.c.O));
        q3.a(activity.getWindow(), activity.getWindow().getDecorView()).d(true);
        q3.a(activity.getWindow(), activity.getWindow().getDecorView()).c(true);
    }
}
