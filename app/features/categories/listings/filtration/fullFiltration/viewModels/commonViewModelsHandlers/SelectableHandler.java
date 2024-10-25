package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers;

import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType;
import fc.c;
import g00.l;
import hc.a;
import java.util.List;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: SelectableHandler.kt */
/* loaded from: classes2.dex */
public final class SelectableHandler implements a {

    /* renamed from: a */
    private final boolean f29460a;

    public SelectableHandler(FilterViewType viewType) {
        o.i(viewType, "viewType");
        this.f29460a = ((FilterViewType.FilterSelectionViewType) viewType).a();
    }

    public static final boolean g(l tmp0, Object obj) {
        o.i(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0020, code lost:
        r2 = kotlin.collections.CollectionsKt___CollectionsKt.W0(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List<? extends hi.b> r4, java.util.List<java.lang.Integer> r5, boolean r6, zz.a<? super java.util.List<dc.c>> r7) {
        /*
            r3 = this;
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.p.y(r4, r0)
            r7.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            hi.b r0 = (hi.b) r0
            if (r5 == 0) goto L31
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            int[] r2 = kotlin.collections.p.W0(r2)
            if (r2 == 0) goto L31
            int r1 = r0.getSelectedId()
            boolean r1 = kotlin.collections.j.I(r2, r1)
        L31:
            dc.c r0 = dc.d.b(r0, r1)
            r7.add(r0)
            goto L11
        L39:
            boolean r4 = r3.f29460a
            if (r4 == 0) goto L58
            if (r6 == 0) goto L58
            dc.c$a r4 = dc.c.f54134l
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = 1
            if (r5 == 0) goto L4c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4d
        L4c:
            r1 = r6
        L4d:
            r5 = r1 ^ 1
            dc.c r4 = r4.a(r5)
            java.util.List r4 = kotlin.collections.p.e(r4)
            goto L5c
        L58:
            java.util.List r4 = kotlin.collections.p.n()
        L5c:
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r4 = kotlin.collections.p.E0(r4, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler.b(java.util.List, java.util.List, boolean, zz.a):java.lang.Object");
    }

    public final boolean c() {
        return this.f29460a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0007, code lost:
        r2 = kotlin.collections.CollectionsKt___CollectionsKt.a1(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.List<java.lang.Integer> r2, int r3, g00.l<? super java.util.List<java.lang.Integer>, wz.p> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "updateFilterData"
            kotlin.jvm.internal.o.i(r4, r0)
            if (r2 == 0) goto Lf
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = kotlin.collections.p.a1(r2)
            if (r2 != 0) goto L14
        Lf:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L14:
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int[] r0 = kotlin.collections.p.W0(r0)
            boolean r0 = kotlin.collections.j.I(r0, r3)
            if (r0 != 0) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
        L28:
            r4.invoke(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler.d(java.util.List, int, g00.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0007, code lost:
        r4 = kotlin.collections.CollectionsKt___CollectionsKt.a1(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.List<java.lang.Integer> r4, int r5, g00.l<? super java.util.List<java.lang.Integer>, wz.p> r6) {
        /*
            r3 = this;
            java.lang.String r0 = "updateFilterData"
            kotlin.jvm.internal.o.i(r6, r0)
            if (r4 == 0) goto Lf
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r4 = kotlin.collections.p.a1(r4)
            if (r4 != 0) goto L14
        Lf:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L14:
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int[] r0 = kotlin.collections.p.W0(r0)
            boolean r0 = kotlin.collections.j.I(r0, r5)
            if (r0 != 0) goto L2b
            r4.clear()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
        L2b:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L36:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r4.next()
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = -1
            if (r1 != r2) goto L4c
            r1 = 1
            goto L4d
        L4c:
            r1 = 0
        L4d:
            if (r1 != 0) goto L36
            r5.add(r0)
            goto L36
        L53:
            r6.invoke(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler.e(java.util.List, int, g00.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0007, code lost:
        r2 = kotlin.collections.CollectionsKt___CollectionsKt.W0(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List<java.lang.Integer> r2, final int r3, g00.l<? super java.util.List<java.lang.Integer>, wz.p> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "updateFilterData"
            kotlin.jvm.internal.o.i(r4, r0)
            if (r2 == 0) goto L14
            java.util.Collection r2 = (java.util.Collection) r2
            int[] r2 = kotlin.collections.p.W0(r2)
            if (r2 == 0) goto L14
            java.util.List r2 = kotlin.collections.j.u0(r2)
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L24
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler$unSelectOption$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler$unSelectOption$1
            r0.<init>()
            hc.c r3 = new hc.c
            r3.<init>(r0)
            r2.removeIf(r3)
        L24:
            if (r2 == 0) goto L29
            r4.invoke(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler.f(java.util.List, int, g00.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0077, code lost:
        r1 = kotlin.collections.CollectionsKt___CollectionsKt.W0(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(fc.b r5, java.util.List<java.lang.Integer> r6, g00.l<? super zz.a<? super java.util.List<dc.c>>, ? extends java.lang.Object> r7, zz.a<? super fc.b> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler$updateFilterRange$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler$updateFilterRange$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler$updateFilterRange$1) r0
            int r1 = r0.f29464c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29464c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler$updateFilterRange$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler$updateFilterRange$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f29462a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29464c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.f.b(r8)
            goto L99
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.f.b(r8)
            boolean r8 = r5 instanceof fc.b.C0620b
            if (r8 == 0) goto L90
            r7 = r5
            fc.b$b r7 = (fc.b.C0620b) r7
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L46:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La0
            java.lang.Object r8 = r7.next()
            dc.c r8 = (dc.c) r8
            j0.k0 r0 = r8.l()
            boolean r1 = r4.f29460a
            r2 = 0
            if (r1 == 0) goto L75
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L69
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L67
            goto L69
        L67:
            r1 = r2
            goto L6a
        L69:
            r1 = r3
        L6a:
            if (r1 == 0) goto L75
            int r8 = r8.e()
            r1 = -1
            if (r8 != r1) goto L88
            r2 = r3
            goto L88
        L75:
            if (r6 == 0) goto L88
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            int[] r1 = kotlin.collections.p.W0(r1)
            if (r1 == 0) goto L88
            int r8 = r8.e()
            boolean r2 = kotlin.collections.j.I(r1, r8)
        L88:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r2)
            r0.setValue(r8)
            goto L46
        L90:
            r0.f29464c = r3
            java.lang.Object r8 = r7.invoke(r0)
            if (r8 != r1) goto L99
            return r1
        L99:
            java.util.List r8 = (java.util.List) r8
            fc.b$b r5 = new fc.b$b
            r5.<init>(r8)
        La0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler.h(fc.b, java.util.List, g00.l, zz.a):java.lang.Object");
    }

    public final void i(c filterResult, l<? super List<Integer>, p> updateFilterData) {
        o.i(filterResult, "filterResult");
        o.i(updateFilterData, "updateFilterData");
        if (filterResult instanceof c.a) {
            updateFilterData.invoke(((c.a) filterResult).b());
        }
    }
}
