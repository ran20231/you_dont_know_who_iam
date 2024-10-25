package com.forsale.designSystem;

import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.PressInteractionKt;
import b1.t1;
import d1.f;
import j0.n1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s.n;
import s.o;
import v.i;
/* compiled from: CustomIndication.kt */
/* loaded from: classes3.dex */
public final class CustomIndication implements n {

    /* renamed from: a  reason: collision with root package name */
    private final long f40647a;

    /* renamed from: b  reason: collision with root package name */
    private final long f40648b;

    /* renamed from: c  reason: collision with root package name */
    private final c f40649c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CustomIndication.kt */
    /* loaded from: classes3.dex */
    public static final class CircleSize {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CircleSize[] $VALUES;
        public static final CircleSize FULL_WIDTH = new CircleSize("FULL_WIDTH", 0);
        public static final CircleSize HALF_WIDTH = new CircleSize("HALF_WIDTH", 1);
        public static final CircleSize DEFAULT = new CircleSize("DEFAULT", 2);

        private static final /* synthetic */ CircleSize[] $values() {
            return new CircleSize[]{FULL_WIDTH, HALF_WIDTH, DEFAULT};
        }

        static {
            CircleSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CircleSize(String str, int i11) {
        }

        public static a00.a<CircleSize> getEntries() {
            return $ENTRIES;
        }

        public static CircleSize valueOf(String str) {
            return (CircleSize) Enum.valueOf(CircleSize.class, str);
        }

        public static CircleSize[] values() {
            return (CircleSize[]) $VALUES.clone();
        }
    }

    /* compiled from: CustomIndication.kt */
    /* loaded from: classes3.dex */
    private final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final n1<Boolean> f40650a;

        /* renamed from: b  reason: collision with root package name */
        private final n1<Boolean> f40651b;

        /* renamed from: c  reason: collision with root package name */
        private final n1<Boolean> f40652c;

        /* renamed from: d  reason: collision with root package name */
        private final n1<Boolean> f40653d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CustomIndication f40654e;

        public a(CustomIndication customIndication, n1<Boolean> isPressed, n1<Boolean> isHover, n1<Boolean> isFocused, n1<Boolean> isDragged) {
            kotlin.jvm.internal.o.i(isPressed, "isPressed");
            kotlin.jvm.internal.o.i(isHover, "isHover");
            kotlin.jvm.internal.o.i(isFocused, "isFocused");
            kotlin.jvm.internal.o.i(isDragged, "isDragged");
            this.f40654e = customIndication;
            this.f40650a = isPressed;
            this.f40651b = isHover;
            this.f40652c = isFocused;
            this.f40653d = isDragged;
        }

        @Override // s.o
        public void a(d1.c cVar) {
            kotlin.jvm.internal.o.i(cVar, "<this>");
            cVar.B1();
            if (this.f40650a.getValue().booleanValue()) {
                CustomIndication customIndication = this.f40654e;
                customIndication.c(cVar, customIndication.d().d());
            } else if (this.f40651b.getValue().booleanValue()) {
                CustomIndication customIndication2 = this.f40654e;
                customIndication2.c(cVar, customIndication2.d().c());
            } else if (this.f40652c.getValue().booleanValue()) {
                CustomIndication customIndication3 = this.f40654e;
                customIndication3.c(cVar, customIndication3.d().b());
            } else if (this.f40653d.getValue().booleanValue()) {
                CustomIndication customIndication4 = this.f40654e;
                customIndication4.c(cVar, customIndication4.d().a());
            }
        }
    }

    /* compiled from: CustomIndication.kt */
    /* loaded from: classes3.dex */
    public static final class b {
    }

    /* compiled from: CustomIndication.kt */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final float f40655a;

        /* renamed from: b  reason: collision with root package name */
        private final float f40656b;

        /* renamed from: c  reason: collision with root package name */
        private final float f40657c;

        /* renamed from: d  reason: collision with root package name */
        private final float f40658d;

        public c() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        public final float a() {
            return this.f40658d;
        }

        public final float b() {
            return this.f40657c;
        }

        public final float c() {
            return this.f40656b;
        }

        public final float d() {
            return this.f40655a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Float.compare(this.f40655a, cVar.f40655a) == 0 && Float.compare(this.f40656b, cVar.f40656b) == 0 && Float.compare(this.f40657c, cVar.f40657c) == 0 && Float.compare(this.f40658d, cVar.f40658d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f40655a) * 31) + Float.hashCode(this.f40656b)) * 31) + Float.hashCode(this.f40657c)) * 31) + Float.hashCode(this.f40658d);
        }

        public String toString() {
            return "IndicatorAlpha(pressedAlpha=" + this.f40655a + ", hoverAlpha=" + this.f40656b + ", focusedAlpha=" + this.f40657c + ", draggedAlpha=" + this.f40658d + ')';
        }

        public c(float f11, float f12, float f13, float f14) {
            this.f40655a = f11;
            this.f40656b = f12;
            this.f40657c = f13;
            this.f40658d = f14;
        }

        public /* synthetic */ c(float f11, float f12, float f13, float f14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.08f : f11, (i11 & 2) != 0 ? 0.16f : f12, (i11 & 4) != 0 ? 0.08f : f13, (i11 & 8) != 0 ? 0.16f : f14);
        }
    }

    /* compiled from: CustomIndication.kt */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f40659a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final c f40660b = new c(0.08f, 0.16f, 0.08f, 0.16f);

        private d() {
        }

        public final c a() {
            return f40660b;
        }
    }

    public /* synthetic */ CustomIndication(long j11, long j12, b bVar, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(d1.c cVar, float f11) {
        long o11 = t1.o(this.f40647a, f11, 0.0f, 0.0f, 0.0f, 14, null);
        f.Z0(cVar, t1.o(o11, f11, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.b(), this.f40648b, null, 0.0f, null, 0, 242, null);
    }

    @Override // s.n
    public o a(i interactionSource, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.o.i(interactionSource, "interactionSource");
        aVar.C(-2065120143);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-2065120143, i11, -1, "com.forsale.designSystem.CustomIndication.rememberUpdatedInstance (CustomIndication.kt:74)");
        }
        int i12 = i11 & 14;
        n1<Boolean> a11 = PressInteractionKt.a(interactionSource, aVar, i12);
        n1<Boolean> a12 = HoverInteractionKt.a(interactionSource, aVar, i12);
        n1<Boolean> a13 = FocusInteractionKt.a(interactionSource, aVar, i12);
        n1<Boolean> a14 = DragInteractionKt.a(interactionSource, aVar, i12);
        aVar.C(1157296644);
        boolean T = aVar.T(interactionSource);
        Object D = aVar.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new a(this, a11, a12, a13, a14);
            aVar.u(D);
        }
        aVar.S();
        a aVar2 = (a) D;
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return aVar2;
    }

    public final c d() {
        return this.f40649c;
    }

    private CustomIndication(long j11, long j12, b bVar, c indicatorAlpha) {
        kotlin.jvm.internal.o.i(indicatorAlpha, "indicatorAlpha");
        this.f40647a = j11;
        this.f40648b = j12;
        this.f40649c = indicatorAlpha;
    }

    public /* synthetic */ CustomIndication(long j11, long j12, b bVar, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t1.f15974b.a() : j11, (i11 & 2) != 0 ? a1.b.a(16.0f, 16.0f) : j12, (i11 & 4) != 0 ? null : bVar, (i11 & 8) != 0 ? d.f40659a.a() : cVar, null);
    }
}
