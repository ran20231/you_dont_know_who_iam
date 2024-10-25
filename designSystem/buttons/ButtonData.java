package com.forsale.designSystem.buttons;

import androidx.compose.ui.text.a0;
import b1.s4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.h;
/* compiled from: ButtonData.kt */
/* loaded from: classes3.dex */
public abstract class ButtonData {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40994a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f40995b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static final h<e> f40996c;

    /* renamed from: d  reason: collision with root package name */
    private static final h<e> f40997d;

    /* renamed from: e  reason: collision with root package name */
    private static final h<e> f40998e;

    /* renamed from: f  reason: collision with root package name */
    private static final h<d> f40999f;

    /* renamed from: g  reason: collision with root package name */
    private static final h<d> f41000g;

    /* renamed from: h  reason: collision with root package name */
    private static final h<d> f41001h;

    /* renamed from: i  reason: collision with root package name */
    private static final h<c> f41002i;

    /* renamed from: j  reason: collision with root package name */
    private static final h<c> f41003j;

    /* renamed from: k  reason: collision with root package name */
    private static final h<c> f41004k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ButtonData.kt */
    /* loaded from: classes3.dex */
    public static final class IconPosition {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ IconPosition[] $VALUES;
        public static final IconPosition Leading = new IconPosition("Leading", 0);
        public static final IconPosition Trailing = new IconPosition("Trailing", 1);

        private static final /* synthetic */ IconPosition[] $values() {
            return new IconPosition[]{Leading, Trailing};
        }

        static {
            IconPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private IconPosition(String str, int i11) {
        }

        public static a00.a<IconPosition> getEntries() {
            return $ENTRIES;
        }

        public static IconPosition valueOf(String str) {
            return (IconPosition) Enum.valueOf(IconPosition.class, str);
        }

        public static IconPosition[] values() {
            return (IconPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: ButtonData.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ButtonData a() {
            return (ButtonData) ButtonData.f41002i.getValue();
        }

        public final ButtonData b() {
            return (ButtonData) ButtonData.f41003j.getValue();
        }

        public final ButtonData c() {
            return (ButtonData) ButtonData.f40999f.getValue();
        }

        public final ButtonData d() {
            return (ButtonData) ButtonData.f41000g.getValue();
        }

        public final ButtonData e() {
            return (ButtonData) ButtonData.f40996c.getValue();
        }

        public final ButtonData f() {
            return (ButtonData) ButtonData.f40998e.getValue();
        }
    }

    /* compiled from: ButtonData.kt */
    /* loaded from: classes3.dex */
    public static final class b extends ButtonData {

        /* renamed from: l  reason: collision with root package name */
        public static final b f41014l = new b();

        private b() {
            super(null);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float g() {
            return e2.h.l(40);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float h() {
            return e2.h.l(24);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float i() {
            return e2.h.l(0);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float j() {
            return e2.h.l(0);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public s4 k(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(1889674622);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1889674622, i11, -1, "com.forsale.designSystem.buttons.ButtonData.Icon.<get-shape> (ButtonData.kt:166)");
            }
            s4 a11 = dk.a.f54291a.b(aVar, 6).a().a();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return a11;
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float l() {
            return e2.h.f54555b.c();
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public a0 m(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-277887833);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-277887833, i11, -1, "com.forsale.designSystem.buttons.ButtonData.Icon.<get-textStyle> (ButtonData.kt:170)");
            }
            a0 a11 = a0.f9205d.a();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ButtonData.kt */
    /* loaded from: classes3.dex */
    public static final class c extends ButtonData {

        /* renamed from: l  reason: collision with root package name */
        private final boolean f41015l;

        /* renamed from: m  reason: collision with root package name */
        private final IconPosition f41016m;

        /* compiled from: ButtonData.kt */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f41017a;

            static {
                int[] iArr = new int[IconPosition.values().length];
                try {
                    iArr[IconPosition.Leading.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IconPosition.Trailing.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f41017a = iArr;
            }
        }

        public /* synthetic */ c(boolean z11, IconPosition iconPosition, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, (i11 & 2) != 0 ? null : iconPosition);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float g() {
            return e2.h.l(48);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float h() {
            return e2.h.l(24);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float i() {
            int i11;
            if (this.f41015l) {
                IconPosition iconPosition = this.f41016m;
                if (iconPosition == null) {
                    i11 = -1;
                } else {
                    i11 = a.f41017a[iconPosition.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        return e2.h.l(16);
                    }
                    return e2.h.l(12);
                }
                return e2.h.l(16);
            }
            return e2.h.l(16);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float j() {
            int i11;
            if (this.f41015l) {
                IconPosition iconPosition = this.f41016m;
                if (iconPosition == null) {
                    i11 = -1;
                } else {
                    i11 = a.f41017a[iconPosition.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        return e2.h.l(16);
                    }
                    return e2.h.l(16);
                }
                return e2.h.l(12);
            }
            return e2.h.l(16);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public s4 k(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-887873622);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-887873622, i11, -1, "com.forsale.designSystem.buttons.ButtonData.Large.<get-shape> (ButtonData.kt:125)");
            }
            s4 b11 = dk.a.f54291a.b(aVar, 6).a().b();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return b11;
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float l() {
            return e2.h.l(8);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public a0 m(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(637167009);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(637167009, i11, -1, "com.forsale.designSystem.buttons.ButtonData.Large.<get-textStyle> (ButtonData.kt:129)");
            }
            a0 e11 = dk.a.f54291a.c(aVar, 6).e();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return e11;
        }

        public c(boolean z11, IconPosition iconPosition) {
            super(null);
            this.f41015l = z11;
            this.f41016m = iconPosition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ButtonData.kt */
    /* loaded from: classes3.dex */
    public static final class d extends ButtonData {

        /* renamed from: l  reason: collision with root package name */
        private final boolean f41018l;

        /* renamed from: m  reason: collision with root package name */
        private final IconPosition f41019m;

        /* compiled from: ButtonData.kt */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f41020a;

            static {
                int[] iArr = new int[IconPosition.values().length];
                try {
                    iArr[IconPosition.Leading.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IconPosition.Trailing.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f41020a = iArr;
            }
        }

        public /* synthetic */ d(boolean z11, IconPosition iconPosition, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, (i11 & 2) != 0 ? null : iconPosition);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float g() {
            return e2.h.l(40);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float h() {
            return e2.h.l(20);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float i() {
            int i11;
            if (this.f41018l) {
                IconPosition iconPosition = this.f41019m;
                if (iconPosition == null) {
                    i11 = -1;
                } else {
                    i11 = a.f41020a[iconPosition.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        return e2.h.l(16);
                    }
                    return e2.h.l(12);
                }
                return e2.h.l(16);
            }
            return e2.h.l(16);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float j() {
            int i11;
            if (this.f41018l) {
                IconPosition iconPosition = this.f41019m;
                if (iconPosition == null) {
                    i11 = -1;
                } else {
                    i11 = a.f41020a[iconPosition.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        return e2.h.l(16);
                    }
                    return e2.h.l(16);
                }
                return e2.h.l(12);
            }
            return e2.h.l(16);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public s4 k(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(192160706);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(192160706, i11, -1, "com.forsale.designSystem.buttons.ButtonData.Medium.<get-shape> (ButtonData.kt:80)");
            }
            s4 c11 = dk.a.f54291a.b(aVar, 6).a().c();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return c11;
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float l() {
            return e2.h.l(6);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public a0 m(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(223780011);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(223780011, i11, -1, "com.forsale.designSystem.buttons.ButtonData.Medium.<get-textStyle> (ButtonData.kt:84)");
            }
            a0 f11 = dk.a.f54291a.c(aVar, 6).f();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return f11;
        }

        public d(boolean z11, IconPosition iconPosition) {
            super(null);
            this.f41018l = z11;
            this.f41019m = iconPosition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ButtonData.kt */
    /* loaded from: classes3.dex */
    public static final class e extends ButtonData {

        /* renamed from: l  reason: collision with root package name */
        private final boolean f41021l;

        /* renamed from: m  reason: collision with root package name */
        private final IconPosition f41022m;

        /* compiled from: ButtonData.kt */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f41023a;

            static {
                int[] iArr = new int[IconPosition.values().length];
                try {
                    iArr[IconPosition.Leading.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IconPosition.Trailing.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f41023a = iArr;
            }
        }

        public /* synthetic */ e(boolean z11, IconPosition iconPosition, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, (i11 & 2) != 0 ? null : iconPosition);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float g() {
            return e2.h.l(32);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float h() {
            return e2.h.l(16);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float i() {
            int i11;
            if (this.f41021l) {
                IconPosition iconPosition = this.f41022m;
                if (iconPosition == null) {
                    i11 = -1;
                } else {
                    i11 = a.f41023a[iconPosition.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        return e2.h.l(12);
                    }
                    return e2.h.l(8);
                }
                return e2.h.l(12);
            }
            return e2.h.l(12);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float j() {
            int i11;
            if (this.f41021l) {
                IconPosition iconPosition = this.f41022m;
                if (iconPosition == null) {
                    i11 = -1;
                } else {
                    i11 = a.f41023a[iconPosition.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        return e2.h.l(12);
                    }
                    return e2.h.l(12);
                }
                return e2.h.l(8);
            }
            return e2.h.l(12);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public s4 k(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-608244898);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-608244898, i11, -1, "com.forsale.designSystem.buttons.ButtonData.Small.<get-shape> (ButtonData.kt:34)");
            }
            s4 d11 = dk.a.f54291a.b(aVar, 6).a().d();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return d11;
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public float l() {
            return e2.h.l(4);
        }

        @Override // com.forsale.designSystem.buttons.ButtonData
        public a0 m(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(916795733);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(916795733, i11, -1, "com.forsale.designSystem.buttons.ButtonData.Small.<get-textStyle> (ButtonData.kt:38)");
            }
            a0 g11 = dk.a.f54291a.c(aVar, 6).g();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return g11;
        }

        public e(boolean z11, IconPosition iconPosition) {
            super(null);
            this.f41021l = z11;
            this.f41022m = iconPosition;
        }
    }

    static {
        h<e> a11;
        h<e> a12;
        h<e> a13;
        h<d> a14;
        h<d> a15;
        h<d> a16;
        h<c> a17;
        h<c> a18;
        h<c> a19;
        a11 = kotlin.d.a(ButtonData$Companion$Small$2.f41011a);
        f40996c = a11;
        a12 = kotlin.d.a(ButtonData$Companion$SmallIconLeading$2.f41012a);
        f40997d = a12;
        a13 = kotlin.d.a(ButtonData$Companion$SmallIconTrailing$2.f41013a);
        f40998e = a13;
        a14 = kotlin.d.a(ButtonData$Companion$Medium$2.f41008a);
        f40999f = a14;
        a15 = kotlin.d.a(ButtonData$Companion$MediumIconLeading$2.f41009a);
        f41000g = a15;
        a16 = kotlin.d.a(ButtonData$Companion$MediumIconTrailing$2.f41010a);
        f41001h = a16;
        a17 = kotlin.d.a(ButtonData$Companion$Large$2.f41005a);
        f41002i = a17;
        a18 = kotlin.d.a(ButtonData$Companion$LargeIconLeading$2.f41006a);
        f41003j = a18;
        a19 = kotlin.d.a(ButtonData$Companion$LargeIconTrailing$2.f41007a);
        f41004k = a19;
    }

    private ButtonData() {
    }

    public /* synthetic */ ButtonData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float g();

    public abstract float h();

    public abstract float i();

    public abstract float j();

    public abstract s4 k(androidx.compose.runtime.a aVar, int i11);

    public abstract float l();

    public abstract a0 m(androidx.compose.runtime.a aVar, int i11);
}
