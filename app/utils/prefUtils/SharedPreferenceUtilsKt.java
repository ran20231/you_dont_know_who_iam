package com.forsale.app.utils.prefUtils;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import h3.a;
import j00.c;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.s;
import n00.k;
/* compiled from: SharedPreferenceUtils.kt */
/* loaded from: classes3.dex */
public final class SharedPreferenceUtilsKt {

    /* renamed from: a */
    static final /* synthetic */ k<Object>[] f40437a = {s.g(new PropertyReference1Impl(SharedPreferenceUtilsKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b */
    private static final c f40438b = PreferenceDataStoreDelegateKt.b("for_sale_preference", null, SharedPreferenceUtilsKt$dataStore$2.f40439a, null, 10, null);

    public static final d3.c<a> b(Context context) {
        return (d3.c) f40438b.getValue(context, f40437a[0]);
    }
}
