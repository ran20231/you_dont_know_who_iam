package com.forsale.designSystem.layouts;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ScreenLayout.kt */
@f00.b
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41907b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f41908c = c(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f41909d = c(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f41910a;

    /* compiled from: ScreenLayout.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f41909d;
        }
    }

    private /* synthetic */ e(int i11) {
        this.f41910a = i11;
    }

    public static final /* synthetic */ e b(int i11) {
        return new e(i11);
    }

    public static boolean d(int i11, Object obj) {
        if (!(obj instanceof e) || i11 != ((e) obj).h()) {
            return false;
        }
        return true;
    }

    public static final boolean e(int i11, int i12) {
        if (i11 == i12) {
            return true;
        }
        return false;
    }

    public static int f(int i11) {
        return Integer.hashCode(i11);
    }

    public static String g(int i11) {
        if (e(i11, f41908c)) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return d(this.f41910a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f41910a;
    }

    public int hashCode() {
        return f(this.f41910a);
    }

    public String toString() {
        return g(this.f41910a);
    }

    public static int c(int i11) {
        return i11;
    }
}
