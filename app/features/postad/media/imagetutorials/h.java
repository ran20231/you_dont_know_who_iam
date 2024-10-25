package com.forsale.app.features.postad.media.imagetutorials;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ImageTutorialsSliderFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class h implements z3.h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f35994c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f35995a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35996b;

    /* compiled from: ImageTutorialsSliderFragmentArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(Bundle bundle) {
            o.i(bundle, "bundle");
            bundle.setClassLoader(h.class.getClassLoader());
            if (bundle.containsKey("visiblityPointX")) {
                int i11 = bundle.getInt("visiblityPointX");
                if (bundle.containsKey("visibiltyPointY")) {
                    return new h(i11, bundle.getInt("visibiltyPointY"));
                }
                throw new IllegalArgumentException("Required argument \"visibiltyPointY\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Required argument \"visiblityPointX\" is missing and does not have an android:defaultValue");
        }
    }

    public h(int i11, int i12) {
        this.f35995a = i11;
        this.f35996b = i12;
    }

    public static final h fromBundle(Bundle bundle) {
        return f35994c.a(bundle);
    }

    public final int a() {
        return this.f35996b;
    }

    public final int b() {
        return this.f35995a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f35995a == hVar.f35995a && this.f35996b == hVar.f35996b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f35995a) * 31) + Integer.hashCode(this.f35996b);
    }

    public String toString() {
        int i11 = this.f35995a;
        int i12 = this.f35996b;
        return "ImageTutorialsSliderFragmentArgs(visiblityPointX=" + i11 + ", visibiltyPointY=" + i12 + ")";
    }
}
