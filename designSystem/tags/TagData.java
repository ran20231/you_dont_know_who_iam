package com.forsale.designSystem.tags;

import androidx.compose.ui.text.a0;
import b1.s4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.h;
/* compiled from: TagData.kt */
/* loaded from: classes3.dex */
public abstract class TagData {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42177a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f42178b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static final h<d> f42179c;

    /* renamed from: d  reason: collision with root package name */
    private static final h<d> f42180d;

    /* renamed from: e  reason: collision with root package name */
    private static final h<c> f42181e;

    /* renamed from: f  reason: collision with root package name */
    private static final h<c> f42182f;

    /* renamed from: g  reason: collision with root package name */
    private static final h<b> f42183g;

    /* renamed from: h  reason: collision with root package name */
    private static final h<b> f42184h;

    /* compiled from: TagData.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TagData a() {
            return (TagData) TagData.f42183g.getValue();
        }

        public final TagData b() {
            return (TagData) TagData.f42184h.getValue();
        }

        public final TagData c() {
            return (TagData) TagData.f42181e.getValue();
        }

        public final TagData d() {
            return (TagData) TagData.f42179c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TagData.kt */
    /* loaded from: classes3.dex */
    public static final class b extends TagData {

        /* renamed from: i  reason: collision with root package name */
        private final boolean f42191i;

        public b(boolean z11) {
            super(null);
            this.f42191i = z11;
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float e() {
            return e2.h.l(24);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float f() {
            int i11;
            if (this.f42191i) {
                i11 = 4;
            } else {
                i11 = 8;
            }
            return e2.h.l(i11);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float g() {
            return e2.h.l(16);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public s4 h(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-1609928440);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1609928440, i11, -1, "com.forsale.designSystem.tags.TagData.Large.<get-shape> (TagData.kt:71)");
            }
            s4 a11 = dk.a.f54291a.b(aVar, 6).b().a();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return a11;
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float i() {
            return e2.h.l(4);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public a0 j(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(1094338865);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1094338865, i11, -1, "com.forsale.designSystem.tags.TagData.Large.<get-textStyle> (TagData.kt:75)");
            }
            a0 h11 = dk.a.f54291a.c(aVar, 6).h();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return h11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TagData.kt */
    /* loaded from: classes3.dex */
    public static final class c extends TagData {

        /* renamed from: i  reason: collision with root package name */
        private final boolean f42192i;

        public c(boolean z11) {
            super(null);
            this.f42192i = z11;
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float e() {
            return e2.h.l(20);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float f() {
            int i11;
            if (this.f42192i) {
                i11 = 4;
            } else {
                i11 = 6;
            }
            return e2.h.l(i11);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float g() {
            return e2.h.l(12);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public s4 h(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(680063472);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(680063472, i11, -1, "com.forsale.designSystem.tags.TagData.Medium.<get-shape> (TagData.kt:49)");
            }
            s4 b11 = dk.a.f54291a.b(aVar, 6).b().b();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return b11;
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float i() {
            return e2.h.l(4);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public a0 j(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-1386995993);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1386995993, i11, -1, "com.forsale.designSystem.tags.TagData.Medium.<get-textStyle> (TagData.kt:53)");
            }
            a0 h11 = dk.a.f54291a.c(aVar, 6).h();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return h11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TagData.kt */
    /* loaded from: classes3.dex */
    public static final class d extends TagData {

        /* renamed from: i  reason: collision with root package name */
        private final boolean f42193i;

        public d(boolean z11) {
            super(null);
            this.f42193i = z11;
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float e() {
            return e2.h.l(16);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float f() {
            int i11;
            if (this.f42193i) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            return e2.h.l(i11);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float g() {
            return e2.h.l(12);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public s4 h(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(700312276);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(700312276, i11, -1, "com.forsale.designSystem.tags.TagData.Small.<get-shape> (TagData.kt:27)");
            }
            s4 c11 = dk.a.f54291a.b(aVar, 6).b().c();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return c11;
        }

        @Override // com.forsale.designSystem.tags.TagData
        public float i() {
            return e2.h.l(4);
        }

        @Override // com.forsale.designSystem.tags.TagData
        public a0 j(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-890387715);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-890387715, i11, -1, "com.forsale.designSystem.tags.TagData.Small.<get-textStyle> (TagData.kt:31)");
            }
            a0 n11 = dk.a.f54291a.c(aVar, 6).n();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return n11;
        }
    }

    static {
        h<d> a11;
        h<d> a12;
        h<c> a13;
        h<c> a14;
        h<b> a15;
        h<b> a16;
        a11 = kotlin.d.a(TagData$Companion$Small$2.f42189a);
        f42179c = a11;
        a12 = kotlin.d.a(TagData$Companion$SmallIcon$2.f42190a);
        f42180d = a12;
        a13 = kotlin.d.a(TagData$Companion$Medium$2.f42187a);
        f42181e = a13;
        a14 = kotlin.d.a(TagData$Companion$MediumIcon$2.f42188a);
        f42182f = a14;
        a15 = kotlin.d.a(TagData$Companion$Large$2.f42185a);
        f42183g = a15;
        a16 = kotlin.d.a(TagData$Companion$LargeIcon$2.f42186a);
        f42184h = a16;
    }

    private TagData() {
    }

    public /* synthetic */ TagData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float e();

    public abstract float f();

    public abstract float g();

    public abstract s4 h(androidx.compose.runtime.a aVar, int i11);

    public abstract float i();

    public abstract a0 j(androidx.compose.runtime.a aVar, int i11);
}
