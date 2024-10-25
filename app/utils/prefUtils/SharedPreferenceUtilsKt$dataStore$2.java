package com.forsale.app.utils.prefUtils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import d3.b;
import g00.l;
import h3.a;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* compiled from: SharedPreferenceUtils.kt */
/* loaded from: classes3.dex */
final class SharedPreferenceUtilsKt$dataStore$2 extends Lambda implements l<Context, List<? extends b<a>>> {

    /* renamed from: a  reason: collision with root package name */
    public static final SharedPreferenceUtilsKt$dataStore$2 f40439a = new SharedPreferenceUtilsKt$dataStore$2();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedPreferenceUtils.kt */
    /* renamed from: com.forsale.app.utils.prefUtils.SharedPreferenceUtilsKt$dataStore$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements g00.a<SharedPreferences> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f40440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.f40440a = context;
        }

        @Override // g00.a
        /* renamed from: b */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f40440a.getSharedPreferences("for_sale_preference", 0);
            o.h(sharedPreferences, "getSharedPreferences(...)");
            return sharedPreferences;
        }
    }

    SharedPreferenceUtilsKt$dataStore$2() {
        super(1);
    }

    @Override // g00.l
    /* renamed from: b */
    public final List<b<a>> invoke(Context it2) {
        List<b<a>> e11;
        o.i(it2, "it");
        e11 = q.e(SharedPreferencesMigrationKt.b(new AnonymousClass1(it2), null, 2, null));
        return e11;
    }
}
