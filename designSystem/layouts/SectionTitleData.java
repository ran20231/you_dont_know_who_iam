package com.forsale.designSystem.layouts;

import androidx.compose.ui.text.a0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.h;
/* compiled from: SectionTitle.kt */
/* loaded from: classes3.dex */
public abstract class SectionTitleData {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41869a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f41870b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static final h<c> f41871c;

    /* renamed from: d  reason: collision with root package name */
    private static final h<b> f41872d;

    /* compiled from: SectionTitle.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SectionTitleData a() {
            return (SectionTitleData) SectionTitleData.f41872d.getValue();
        }

        public final SectionTitleData b() {
            return (SectionTitleData) SectionTitleData.f41871c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SectionTitle.kt */
    /* loaded from: classes3.dex */
    public static final class b extends SectionTitleData {
        public b() {
            super(null);
        }

        @Override // com.forsale.designSystem.layouts.SectionTitleData
        public long c(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(1169411904);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1169411904, i11, -1, "com.forsale.designSystem.layouts.SectionTitleData.Large.<get-titleColor> (SectionTitle.kt:100)");
            }
            long m11 = dk.a.f54291a.a(aVar, 6).e().m(aVar, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return m11;
        }

        @Override // com.forsale.designSystem.layouts.SectionTitleData
        public a0 d(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(678653181);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(678653181, i11, -1, "com.forsale.designSystem.layouts.SectionTitleData.Large.<get-titleFont> (SectionTitle.kt:96)");
            }
            a0 l11 = dk.a.f54291a.c(aVar, 6).l();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return l11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SectionTitle.kt */
    /* loaded from: classes3.dex */
    public static final class c extends SectionTitleData {
        public c() {
            super(null);
        }

        @Override // com.forsale.designSystem.layouts.SectionTitleData
        public long c(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-1870551308);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1870551308, i11, -1, "com.forsale.designSystem.layouts.SectionTitleData.Small.<get-titleColor> (SectionTitle.kt:90)");
            }
            long j11 = dk.a.f54291a.a(aVar, 6).e().j(aVar, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return j11;
        }

        @Override // com.forsale.designSystem.layouts.SectionTitleData
        public a0 d(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(1933657265);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1933657265, i11, -1, "com.forsale.designSystem.layouts.SectionTitleData.Small.<get-titleFont> (SectionTitle.kt:86)");
            }
            a0 r11 = dk.a.f54291a.c(aVar, 6).r();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar.S();
            return r11;
        }
    }

    static {
        h<c> a11;
        h<b> a12;
        a11 = kotlin.d.a(SectionTitleData$Companion$Small$2.f41874a);
        f41871c = a11;
        a12 = kotlin.d.a(SectionTitleData$Companion$Large$2.f41873a);
        f41872d = a12;
    }

    private SectionTitleData() {
    }

    public /* synthetic */ SectionTitleData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long c(androidx.compose.runtime.a aVar, int i11);

    public abstract a0 d(androidx.compose.runtime.a aVar, int i11);
}
