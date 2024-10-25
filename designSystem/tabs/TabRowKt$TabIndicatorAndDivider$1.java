package com.forsale.designSystem.tabs;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.layout.b0;
import androidx.compose.ui.layout.c0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.u0;
import androidx.compose.ui.layout.z;
import c0.g;
import e2.b;
import g00.l;
import g00.p;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import y0.e;
/* compiled from: TabRow.kt */
/* loaded from: classes3.dex */
final class TabRowKt$TabIndicatorAndDivider$1 extends Lambda implements p<u0, b, b0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f42134a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<ck.b> f42135b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42136c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TabRow.kt */
    /* renamed from: com.forsale.designSystem.tabs.TabRowKt$TabIndicatorAndDivider$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements l<o0.a, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f42137a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f42138b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f42139c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f42140d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<ck.b> f42141e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f42142f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f42143g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TabRow.kt */
        /* renamed from: com.forsale.designSystem.tabs.TabRowKt$TabIndicatorAndDivider$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C04721 extends Lambda implements p<a, Integer, wz.p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f42144a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04721(float f11) {
                super(2);
                this.f42144a = f11;
            }

            public final void b(a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (c.I()) {
                    c.U(98067315, i11, -1, "com.forsale.designSystem.tabs.TabIndicatorAndDivider.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:131)");
                }
                BoxKt.a(BackgroundKt.b(SizeKt.i(androidx.compose.ui.c.f7566a, this.f42144a), dk.a.f54291a.a(aVar, 6).e().d(aVar, 0), null, 2, null), aVar, 0);
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TabRow.kt */
        /* renamed from: com.forsale.designSystem.tabs.TabRowKt$TabIndicatorAndDivider$1$1$3  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends Lambda implements p<a, Integer, wz.p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<ck.b> f42145a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f42146b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f42147c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(List<ck.b> list, int i11, float f11) {
                super(2);
                this.f42145a = list;
                this.f42146b = i11;
                this.f42147c = f11;
            }

            public final void b(a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (c.I()) {
                    c.U(-280930020, i11, -1, "com.forsale.designSystem.tabs.TabIndicatorAndDivider.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:140)");
                }
                androidx.compose.ui.c i12 = SizeKt.i(TabIndicatorOffsetKt.a(androidx.compose.ui.c.f7566a, this.f42145a.get(this.f42146b)), this.f42147c);
                float f11 = this.f42147c;
                BoxKt.a(BackgroundKt.b(SizeKt.h(e.a(i12, g.e(f11, f11, 0.0f, 0.0f, 12, null)), 0.0f, 1, null), dk.a.f54291a.a(aVar, 6).f().i(aVar, 0), null, 2, null), aVar, 0);
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(u0 u0Var, float f11, long j11, int i11, List<ck.b> list, int i12, int i13) {
            super(1);
            this.f42137a = u0Var;
            this.f42138b = f11;
            this.f42139c = j11;
            this.f42140d = i11;
            this.f42141e = list;
            this.f42142f = i12;
            this.f42143g = i13;
        }

        public final void b(o0.a layout) {
            o.i(layout, "$this$layout");
            List<z> u02 = this.f42137a.u0(TabSlots.Divider, r0.b.c(98067315, true, new C04721(this.f42138b)));
            long j11 = this.f42139c;
            int i11 = this.f42140d;
            int size = u02.size();
            int i12 = 0;
            while (i12 < size) {
                o0 P = u02.get(i12).P(b.e(j11, 0, 0, 0, 0, 11, null));
                o0.a.j(layout, P, 0, i11 - P.j0(), 0.0f, 4, null);
                i12++;
                size = size;
                i11 = i11;
                j11 = j11;
            }
            List<z> u03 = this.f42137a.u0(TabSlots.Indicator, r0.b.c(-280930020, true, new AnonymousClass3(this.f42141e, this.f42142f, this.f42138b)));
            int i13 = this.f42143g;
            int i14 = this.f42140d;
            int size2 = u03.size();
            for (int i15 = 0; i15 < size2; i15++) {
                o0.a.j(layout, u03.get(i15).P(b.f54545b.c(i13, i14)), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // g00.l
        public /* bridge */ /* synthetic */ wz.p invoke(o0.a aVar) {
            b(aVar);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabIndicatorAndDivider$1(float f11, List<ck.b> list, int i11) {
        super(2);
        this.f42134a = f11;
        this.f42135b = list;
        this.f42136c = i11;
    }

    public final b0 b(u0 SubcomposeLayout, long j11) {
        o.i(SubcomposeLayout, "$this$SubcomposeLayout");
        int n11 = b.n(j11);
        int o11 = b.o(j11);
        return c0.i1(SubcomposeLayout, n11, o11, null, new AnonymousClass1(SubcomposeLayout, this.f42134a, j11, o11, this.f42135b, this.f42136c, n11), 4, null);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ b0 invoke(u0 u0Var, b bVar) {
        return b(u0Var, bVar.t());
    }
}
