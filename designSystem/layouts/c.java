package com.forsale.designSystem.layouts;

import e2.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: e  reason: collision with root package name */
    public static final int f41896e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final float f41897a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41898b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41899c;

    /* renamed from: d  reason: collision with root package name */
    private final float f41900d;

    /* compiled from: Cards.kt */
    /* loaded from: classes3.dex */
    public static final class a extends c {

        /* renamed from: f  reason: collision with root package name */
        public static final int f41901f = 0;

        public a() {
            super(1.7777778f, 1, 1, h.l(254), null);
        }
    }

    /* compiled from: Cards.kt */
    /* loaded from: classes3.dex */
    public static final class b extends c {

        /* renamed from: f  reason: collision with root package name */
        public static final int f41902f = 0;

        public /* synthetic */ b(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z11);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(boolean r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L9
                e2.h$a r7 = e2.h.f54555b
                float r7 = r7.c()
                goto L10
            L9:
                r7 = 159(0x9f, float:2.23E-43)
                float r7 = (float) r7
                float r7 = e2.h.l(r7)
            L10:
                r4 = r7
                r1 = 1068149419(0x3faaaaab, float:1.3333334)
                r2 = 2
                r3 = 1
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.layouts.c.b.<init>(boolean):void");
        }
    }

    public /* synthetic */ c(float f11, int i11, int i12, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, i11, i12, f12);
    }

    public final float a() {
        return this.f41897a;
    }

    public final int b() {
        return this.f41899c;
    }

    public final int c() {
        return this.f41898b;
    }

    public final float d() {
        return this.f41900d;
    }

    private c(float f11, int i11, int i12, float f12) {
        this.f41897a = f11;
        this.f41898b = i11;
        this.f41899c = i12;
        this.f41900d = f12;
    }
}
