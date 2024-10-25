package com.forsale.designSystem.chips;

import androidx.compose.ui.text.a0;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.h;
/* compiled from: ChipsData.kt */
/* loaded from: classes3.dex */
public abstract class ChipsData {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41251a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final h<c> f41252b;

    /* renamed from: c  reason: collision with root package name */
    private static final h<b> f41253c;

    /* compiled from: ChipsData.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChipsData a() {
            return (ChipsData) ChipsData.f41253c.getValue();
        }

        public final ChipsData b() {
            return (ChipsData) ChipsData.f41252b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChipsData.kt */
    /* loaded from: classes3.dex */
    public static final class b extends ChipsData {
        public b() {
            super(null);
        }

        @Override // com.forsale.designSystem.chips.ChipsData
        public a0 c(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(1547676381);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1547676381, i11, -1, "com.forsale.designSystem.chips.ChipsData.Large.<get-font> (ChipsData.kt:36)");
            }
            a0 c11 = dk.a.f54291a.c(aVar, 6).c();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return c11;
        }

        @Override // com.forsale.designSystem.chips.ChipsData
        public float d() {
            return e2.h.l(20);
        }

        @Override // com.forsale.designSystem.chips.ChipsData
        public float e() {
            return e2.h.l(40);
        }

        @Override // com.forsale.designSystem.chips.ChipsData
        public float f() {
            return e2.h.l(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChipsData.kt */
    /* loaded from: classes3.dex */
    public static final class c extends ChipsData {
        public c() {
            super(null);
        }

        @Override // com.forsale.designSystem.chips.ChipsData
        public a0 c(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-1058246511);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1058246511, i11, -1, "com.forsale.designSystem.chips.ChipsData.Small.<get-font> (ChipsData.kt:23)");
            }
            a0 c11 = dk.a.f54291a.c(aVar, 6).c();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return c11;
        }

        @Override // com.forsale.designSystem.chips.ChipsData
        public float d() {
            return e2.h.l(16);
        }

        @Override // com.forsale.designSystem.chips.ChipsData
        public float e() {
            return e2.h.l(32);
        }

        @Override // com.forsale.designSystem.chips.ChipsData
        public float f() {
            return e2.h.l(6);
        }
    }

    static {
        h<c> a11;
        h<b> a12;
        a11 = d.a(ChipsData$Companion$Small$2.f41255a);
        f41252b = a11;
        a12 = d.a(ChipsData$Companion$Large$2.f41254a);
        f41253c = a12;
    }

    public /* synthetic */ ChipsData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract a0 c(androidx.compose.runtime.a aVar, int i11);

    public abstract float d();

    public abstract float e();

    public abstract float f();

    private ChipsData() {
    }
}
