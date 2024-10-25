package com.forsale.app.utils.analytics.logger;

import android.os.Bundle;
import g00.l;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wi.e;
import wi.f;
import wz.h;
import wz.p;
/* compiled from: AnalyticsParamBuilder.kt */
/* loaded from: classes3.dex */
public class AnalyticsParamBuilder {

    /* renamed from: c  reason: collision with root package name */
    public static final a f40066c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f40067d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final h f40068a;

    /* renamed from: b  reason: collision with root package name */
    private final h f40069b;

    /* compiled from: AnalyticsParamBuilder.kt */
    /* loaded from: classes3.dex */
    public static final class a implements l<l<? super AnalyticsParamBuilder, ? extends p>, AnalyticsParamBuilder> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // g00.l
        /* renamed from: b */
        public AnalyticsParamBuilder invoke(l<? super AnalyticsParamBuilder, p> paramsBuilder) {
            o.i(paramsBuilder, "paramsBuilder");
            AnalyticsParamBuilder analyticsParamBuilder = new AnalyticsParamBuilder();
            paramsBuilder.invoke(analyticsParamBuilder);
            return analyticsParamBuilder;
        }
    }

    public AnalyticsParamBuilder() {
        h a11;
        h a12;
        a11 = d.a(AnalyticsParamBuilder$bundle$2.f40070a);
        this.f40068a = a11;
        a12 = d.a(AnalyticsParamBuilder$map$2.f40071a);
        this.f40069b = a12;
    }

    public final Bundle a() {
        return (Bundle) this.f40068a.getValue();
    }

    public final HashMap<String, String> b() {
        return (HashMap) this.f40069b.getValue();
    }

    public final void c(e key, double d11) {
        o.i(key, "key");
        a().putDouble(key.getValue(), d11);
        b().put(key.getValue(), String.valueOf(d11));
    }

    public final void d(e key, int i11) {
        o.i(key, "key");
        a().putInt(key.getValue(), i11);
        b().put(key.getValue(), String.valueOf(i11));
    }

    public final void e(e key, String value) {
        o.i(key, "key");
        o.i(value, "value");
        a().putString(key.getValue(), value);
        b().put(key.getValue(), value);
    }

    public final void f(e key, List<String> value) {
        String t02;
        String t03;
        o.i(key, "key");
        o.i(value, "value");
        if (value.isEmpty()) {
            return;
        }
        Bundle a11 = a();
        String value2 = key.getValue();
        List<String> list = value;
        t02 = CollectionsKt___CollectionsKt.t0(list, null, null, null, 0, null, null, 63, null);
        a11.putString(value2, f.a(t02));
        HashMap<String, String> b11 = b();
        String value3 = key.getValue();
        t03 = CollectionsKt___CollectionsKt.t0(list, null, null, null, 0, null, null, 63, null);
        b11.put(value3, f.a(t03));
    }
}
