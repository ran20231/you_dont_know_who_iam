package com.forsale.app.features.categories.listings.filtration.allFilters;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.z;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import e2.h;
import g00.l;
import g00.r;
import j0.n1;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllFiltersDialogFragment.kt */
/* loaded from: classes2.dex */
public final class AllFiltersDialogFragment$AllFilters$6 extends Lambda implements l<LazyListScope, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n1<List<FilterViewModel<?, ?, ?>>> f28978a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z0.d f28979b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AllFiltersDialogFragment f28980c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AllFiltersDialogFragment$AllFilters$6(n1<? extends List<? extends FilterViewModel<?, ?, ?>>> n1Var, z0.d dVar, AllFiltersDialogFragment allFiltersDialogFragment) {
        super(1);
        this.f28978a = n1Var;
        this.f28979b = dVar;
        this.f28980c = allFiltersDialogFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public final void c(LazyListScope LazyColumn) {
        final List t11;
        o.i(LazyColumn, "$this$LazyColumn");
        t11 = AllFiltersDialogFragment.t(this.f28978a);
        final z0.d dVar = this.f28979b;
        final AllFiltersDialogFragment allFiltersDialogFragment = this.f28980c;
        LazyColumn.f(t11.size(), null, new l<Integer, Object>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$invoke$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object b(int i11) {
                t11.get(i11);
                return null;
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return b(num.intValue());
            }
        }, r0.b.c(-1091073711, true, new r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(x.a aVar, int i11, androidx.compose.runtime.a aVar2, int i12) {
                int i13;
                boolean e11;
                int i14;
                int i15;
                if ((i12 & 14) == 0) {
                    if (aVar2.T(aVar)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i15 | i12;
                } else {
                    i13 = i12;
                }
                if ((i12 & 112) == 0) {
                    if (aVar2.d(i11)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i13 |= i14;
                }
                if ((i13 & 731) == 146 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1091073711, i13, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                }
                FilterViewModel filterViewModel = (FilterViewModel) t11.get(i11);
                e11 = AllFiltersDialogFragment$AllFilters$6.e(z.b(filterViewModel.F(), null, aVar2, 8, 1));
                if (e11) {
                    aVar2.C(-1439001023);
                    if (i11 != 0) {
                        SpacerKt.a(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(12)), aVar2, 6);
                    }
                    aVar2.S();
                    z0.d dVar2 = dVar;
                    final AllFiltersDialogFragment allFiltersDialogFragment2 = allFiltersDialogFragment;
                    l<FilterViewModel<?, ?, ?>, p> lVar = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007d: CONSTRUCTOR  (r2v1 'lVar' g00.l<com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?>, wz.p>) = 
                          (r7v11 'allFiltersDialogFragment2' com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$1$1.<init>(com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$invoke$$inlined$itemsIndexed$default$3.b(x.a, int, androidx.compose.runtime.a, int):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r0 = r10 & 14
                        if (r0 != 0) goto Lf
                        boolean r7 = r9.T(r7)
                        if (r7 == 0) goto Lc
                        r7 = 4
                        goto Ld
                    Lc:
                        r7 = 2
                    Ld:
                        r7 = r7 | r10
                        goto L10
                    Lf:
                        r7 = r10
                    L10:
                        r10 = r10 & 112(0x70, float:1.57E-43)
                        if (r10 != 0) goto L20
                        boolean r10 = r9.d(r8)
                        if (r10 == 0) goto L1d
                        r10 = 32
                        goto L1f
                    L1d:
                        r10 = 16
                    L1f:
                        r7 = r7 | r10
                    L20:
                        r10 = r7 & 731(0x2db, float:1.024E-42)
                        r0 = 146(0x92, float:2.05E-43)
                        if (r10 != r0) goto L31
                        boolean r10 = r9.i()
                        if (r10 != 0) goto L2d
                        goto L31
                    L2d:
                        r9.L()
                        goto L96
                    L31:
                        boolean r10 = androidx.compose.runtime.c.I()
                        if (r10 == 0) goto L40
                        r10 = -1
                        java.lang.String r0 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)"
                        r1 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                        androidx.compose.runtime.c.U(r1, r7, r10, r0)
                    L40:
                        java.util.List r7 = r1
                        java.lang.Object r7 = r7.get(r8)
                        r1 = r7
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel r1 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel) r1
                        kotlinx.coroutines.flow.StateFlow r7 = r1.F()
                        r10 = 8
                        r0 = 1
                        r2 = 0
                        j0.n1 r7 = androidx.compose.runtime.z.b(r7, r2, r9, r10, r0)
                        boolean r7 = com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6.b(r7)
                        if (r7 == 0) goto L8d
                        r7 = -1439001023(0xffffffffaa3a9641, float:-1.6572248E-13)
                        r9.C(r7)
                        if (r8 == 0) goto L74
                        androidx.compose.ui.c$a r7 = androidx.compose.ui.c.f7566a
                        r8 = 12
                        float r8 = (float) r8
                        float r8 = e2.h.l(r8)
                        androidx.compose.ui.c r7 = androidx.compose.foundation.layout.SizeKt.i(r7, r8)
                        r8 = 6
                        androidx.compose.foundation.layout.SpacerKt.a(r7, r9, r8)
                    L74:
                        r9.S()
                        z0.d r0 = r2
                        com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$1$1 r2 = new com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$1$1
                        com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment r7 = r3
                        r2.<init>(r7)
                        com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$1$2 r3 = new com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$1$2
                        com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment r7 = r3
                        r3.<init>(r7)
                        r5 = 72
                        r4 = r9
                        com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt.g(r0, r1, r2, r3, r4, r5)
                    L8d:
                        boolean r7 = androidx.compose.runtime.c.I()
                        if (r7 == 0) goto L96
                        androidx.compose.runtime.c.T()
                    L96:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$6$invoke$$inlined$itemsIndexed$default$3.b(x.a, int, androidx.compose.runtime.a, int):void");
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(x.a aVar, Integer num, androidx.compose.runtime.a aVar2, Integer num2) {
                    b(aVar, num.intValue(), aVar2, num2.intValue());
                    return p.f75480a;
                }
            }));
        }

        @Override // g00.l
        public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
            c(lazyListScope);
            return p.f75480a;
        }
    }
