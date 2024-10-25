package com.forsale.app.utils;

import android.os.Build;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
/* compiled from: Constants.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40106a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final MediaType f40107b = MediaType.Companion.parse("image/*");

    /* renamed from: c  reason: collision with root package name */
    private static final String f40108c = "{device_name: " + Build.DEVICE + ", device_model: " + Build.MODEL + ", device_model_name: " + Build.MANUFACTURER + "}";

    /* renamed from: d  reason: collision with root package name */
    private static final Pair<Double, Double> f40109d = new Pair<>(Double.valueOf(29.317692d), Double.valueOf(47.442181d));

    /* compiled from: Constants.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return e.f40108c;
        }

        public final Pair<Double, Double> b() {
            return e.f40109d;
        }
    }
}
