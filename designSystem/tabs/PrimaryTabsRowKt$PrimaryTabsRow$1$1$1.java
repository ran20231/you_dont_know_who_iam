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
import e2.b;
import e2.h;
import g00.l;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTabsRow.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabsRowKt$PrimaryTabsRow$1$1$1 extends Lambda implements p<u0, b, b0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42098a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42099b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrimaryTabsRow.kt */
    /* renamed from: com.forsale.designSystem.tabs.PrimaryTabsRowKt$PrimaryTabsRow$1$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements l<o0.a, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<o0> f42100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u0 f42101b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref$IntRef f42102c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f42103d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f42104e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f42105f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List<ck.b> f42106g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f42107h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PrimaryTabsRow.kt */
        /* renamed from: com.forsale.designSystem.tabs.PrimaryTabsRowKt$PrimaryTabsRow$1$1$1$1$3  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends Lambda implements p<a, Integer, wz.p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f42108a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List<ck.b> f42109b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(int i11, List<ck.b> list) {
                super(2);
                this.f42108a = i11;
                this.f42109b = list;
            }

            public final void b(a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (c.I()) {
                    c.U(285037244, i11, -1, "com.forsale.designSystem.tabs.PrimaryTabsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrimaryTabsRow.kt:104)");
                }
                if (this.f42108a < this.f42109b.size()) {
                    BoxKt.a(BackgroundKt.b(SizeKt.i(SizeKt.h(TabIndicatorOffsetKt.a(androidx.compose.ui.c.f7566a, this.f42109b.get(this.f42108a)), 0.0f, 1, null), h.l(3)), dk.a.f54291a.a(aVar, 6).f().i(aVar, 0), null, 2, null), aVar, 0);
                }
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
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends o0> list, u0 u0Var, Ref$IntRef ref$IntRef, long j11, int i11, int i12, List<ck.b> list2, int i13) {
            super(1);
            this.f42100a = list;
            this.f42101b = u0Var;
            this.f42102c = ref$IntRef;
            this.f42103d = j11;
            this.f42104e = i11;
            this.f42105f = i12;
            this.f42106g = list2;
            this.f42107h = i13;
        }

        public final void b(o0.a layout) {
            o.i(layout, "$this$layout");
            Ref$IntRef ref$IntRef = this.f42102c;
            int i11 = 0;
            for (Object obj : this.f42100a) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    r.x();
                }
                o0.a.j(layout, (o0) obj, ref$IntRef.f61776a * i11, 0, 0.0f, 4, null);
                i11 = i12;
            }
            long j11 = this.f42103d;
            int i13 = this.f42104e;
            for (z zVar : this.f42101b.u0(TabSlots.Divider, ComposableSingletons$PrimaryTabsRowKt.f42073a.a())) {
                o0 P = zVar.P(b.e(j11, 0, 0, 0, 0, 11, null));
                o0.a.j(layout, P, 0, i13 - P.j0(), 0.0f, 4, null);
                i13 = i13;
                j11 = j11;
            }
            int i14 = this.f42107h;
            int i15 = this.f42104e;
            for (z zVar2 : this.f42101b.u0(TabSlots.Indicator, r0.b.c(285037244, true, new AnonymousClass3(this.f42105f, this.f42106g)))) {
                o0.a.j(layout, zVar2.P(b.f54545b.c(i14, i15)), 0, 0, 0.0f, 4, null);
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
    /* JADX WARN: Multi-variable type inference failed */
    public PrimaryTabsRowKt$PrimaryTabsRow$1$1$1(p<? super a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f42098a = pVar;
        this.f42099b = i11;
    }

    public final b0 b(u0 SubcomposeLayout, long j11) {
        int y11;
        o.i(SubcomposeLayout, "$this$SubcomposeLayout");
        int n11 = b.n(j11);
        List<z> u02 = SubcomposeLayout.u0(TabSlots.Tabs, this.f42098a);
        int size = u02.size();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        if (size > 0) {
            ref$IntRef.f61776a = n11 / size;
        }
        List<z> list = u02;
        int i11 = 0;
        for (z zVar : list) {
            i11 = Math.max(zVar.j(ref$IntRef.f61776a), i11);
        }
        y11 = s.y(list, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (z zVar2 : list) {
            int i12 = ref$IntRef.f61776a;
            arrayList.add(zVar2.P(b.d(j11, i12, i12, i11, i11)));
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(new ck.b(h.l(SubcomposeLayout.x(ref$IntRef.f61776a) * i13), SubcomposeLayout.x(ref$IntRef.f61776a), null));
        }
        return c0.i1(SubcomposeLayout, n11, i11, null, new AnonymousClass1(arrayList, SubcomposeLayout, ref$IntRef, j11, i11, this.f42099b, arrayList2, n11), 4, null);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ b0 invoke(u0 u0Var, b bVar) {
        return b(u0Var, bVar.t());
    }
}
