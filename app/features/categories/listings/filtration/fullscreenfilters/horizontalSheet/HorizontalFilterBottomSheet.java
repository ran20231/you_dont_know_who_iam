package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.analytics.listingfiltration.FilterPlaces;
import com.forsale.designSystem.chips.ChipsData;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.flows.FlowKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fc.c;
import g00.l;
import g00.q;
import j0.d1;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import sj.d;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: HorizontalFilterBottomSheet.kt */
/* loaded from: classes2.dex */
public final class HorizontalFilterBottomSheet extends com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f29635x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f29636y = 8;

    /* renamed from: g  reason: collision with root package name */
    private l<? super c, p> f29637g;

    /* renamed from: h  reason: collision with root package name */
    private a.AbstractC0319a.C0320a f29638h;

    /* renamed from: i  reason: collision with root package name */
    public HorizontalFilterViewModel.b f29639i;

    /* renamed from: j  reason: collision with root package name */
    private final h f29640j;

    /* compiled from: HorizontalFilterBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager, a.AbstractC0319a.C0320a filterCapsule, l<? super c, p> onActionDone) {
            o.i(fragmentManager, "fragmentManager");
            o.i(filterCapsule, "filterCapsule");
            o.i(onActionDone, "onActionDone");
            HorizontalFilterBottomSheet horizontalFilterBottomSheet = new HorizontalFilterBottomSheet(null);
            horizontalFilterBottomSheet.f29638h = filterCapsule;
            horizontalFilterBottomSheet.f29637g = onActionDone;
            horizontalFilterBottomSheet.show(fragmentManager, "HorizontalFilterDialogFragment");
        }
    }

    public /* synthetic */ HorizontalFilterBottomSheet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HorizontalFilterViewModel G() {
        return (HorizontalFilterViewModel) this.f29640j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(final androidx.compose.ui.c cVar, final List<dc.c> list, final l<? super dc.c, p> lVar, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1864526559);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1864526559, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.HorizontalOptions (HorizontalFilterBottomSheet.kt:119)");
        }
        float f11 = 8;
        FlowKt.b(cVar, null, null, e2.h.l(f11), null, e2.h.l(f11), null, r0.b.b(h11, 1700069863, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                r0.a aVar3;
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1700069863, i12, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.HorizontalOptions.<anonymous> (HorizontalFilterBottomSheet.kt:123)");
                }
                HorizontalFilterBottomSheet horizontalFilterBottomSheet = this;
                final l<dc.c, p> lVar2 = lVar;
                for (final dc.c cVar2 : list) {
                    ChipsData a11 = ChipsData.f41251a.a();
                    if (!horizontalFilterBottomSheet.G().L0()) {
                        aVar3 = r0.b.b(aVar2, 1031379943, true, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0057: INVOKE  (r3v11 'aVar3' r0.a) = 
                              (r20v0 'aVar2' androidx.compose.runtime.a)
                              (1031379943 int)
                              true
                              (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0051: CONSTRUCTOR  (r3v10 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r1v6 'cVar2' dc.c A[DONT_INLINE]), (r13v1 'lVar2' g00.l<dc.c, wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1$1$1.<init>(dc.c, g00.l):void type: CONSTRUCTOR)
                             type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a in method: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 31 more
                            */
                        /*
                            this = this;
                            r0 = r19
                            r14 = r20
                            r1 = r21
                            r2 = r1 & 11
                            r3 = 2
                            if (r2 != r3) goto L17
                            boolean r2 = r20.i()
                            if (r2 != 0) goto L12
                            goto L17
                        L12:
                            r20.L()
                            goto La5
                        L17:
                            boolean r2 = androidx.compose.runtime.c.I()
                            if (r2 == 0) goto L26
                            r2 = -1
                            java.lang.String r3 = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.HorizontalOptions.<anonymous> (HorizontalFilterBottomSheet.kt:123)"
                            r4 = 1700069863(0x655501e7, float:6.2868697E22)
                            androidx.compose.runtime.c.U(r4, r1, r2, r3)
                        L26:
                            java.util.List<dc.c> r1 = r1
                            java.lang.Iterable r1 = (java.lang.Iterable) r1
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet r15 = r2
                            g00.l<dc.c, wz.p> r13 = r3
                            java.util.Iterator r16 = r1.iterator()
                        L32:
                            boolean r1 = r16.hasNext()
                            if (r1 == 0) goto L9c
                            java.lang.Object r1 = r16.next()
                            dc.c r1 = (dc.c) r1
                            com.forsale.designSystem.chips.ChipsData$a r2 = com.forsale.designSystem.chips.ChipsData.f41251a
                            com.forsale.designSystem.chips.ChipsData r2 = r2.a()
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel r3 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.B(r15)
                            boolean r3 = r3.L0()
                            r4 = 1
                            if (r3 != 0) goto L5c
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1$1$1 r3 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1$1$1
                            r3.<init>(r1, r13)
                            r5 = 1031379943(0x3d799be7, float:0.060939696)
                            r0.a r3 = r0.b.b(r14, r5, r4, r3)
                            goto L5d
                        L5c:
                            r3 = 0
                        L5d:
                            r8 = r3
                            j0.k0 r3 = r1.l()
                            java.lang.Object r3 = r3.getValue()
                            java.lang.Boolean r3 = (java.lang.Boolean) r3
                            boolean r5 = r3.booleanValue()
                            r3 = 0
                            r6 = 0
                            r7 = 0
                            r9 = 0
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1$1$2 r10 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1$1$2
                            r10.<init>(r1)
                            r11 = 483742369(0x1cd552a1, float:1.4116517E-21)
                            r0.a r10 = r0.b.b(r14, r11, r4, r10)
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1$1$3 r11 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1$1$3
                            r11.<init>(r13, r1)
                            r12 = 0
                            r17 = 1572864(0x180000, float:2.204052E-39)
                            r18 = 565(0x235, float:7.92E-43)
                            r1 = r3
                            r3 = r6
                            r4 = r5
                            r5 = r7
                            r6 = r9
                            r7 = r10
                            r9 = r11
                            r10 = r12
                            r11 = r20
                            r12 = r17
                            r17 = r13
                            r13 = r18
                            com.forsale.designSystem.chips.ChipsKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                            r13 = r17
                            goto L32
                        L9c:
                            boolean r1 = androidx.compose.runtime.c.I()
                            if (r1 == 0) goto La5
                            androidx.compose.runtime.c.T()
                        La5:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), h11, (i11 & 14) | 12782592, 86);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalOptions$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            HorizontalFilterBottomSheet.this.w(cVar, list, lVar, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public final HorizontalFilterViewModel.b E() {
                HorizontalFilterViewModel.b bVar = this.f29639i;
                if (bVar != null) {
                    return bVar;
                }
                o.w("factory");
                return null;
            }

            @Override // androidx.fragment.app.j
            public int getTheme() {
                return z0.f70803m;
            }

            @Override // androidx.fragment.app.Fragment
            public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
                o.i(inflater, "inflater");
                Context requireContext = requireContext();
                o.h(requireContext, "requireContext(...)");
                ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
                composeView.setContent(r0.b.c(1377000523, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$onCreateView$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1377000523, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.onCreateView.<anonymous>.<anonymous> (HorizontalFilterBottomSheet.kt:56)");
                        }
                        final HorizontalFilterBottomSheet horizontalFilterBottomSheet = HorizontalFilterBottomSheet.this;
                        ThemeKt.a(null, null, r0.b.b(aVar, 646337748, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$onCreateView$1$1.1
                            {
                                super(2);
                            }

                            private static final boolean c(n1<Boolean> n1Var) {
                                return n1Var.getValue().booleanValue();
                            }

                            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                                int i13;
                                if ((i12 & 11) == 2 && aVar2.i()) {
                                    aVar2.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(646337748, i12, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.onCreateView.<anonymous>.<anonymous>.<anonymous> (HorizontalFilterBottomSheet.kt:57)");
                                }
                                n1 a11 = z.a(HorizontalFilterBottomSheet.this.G().E0(), Boolean.FALSE, null, aVar2, 56, 2);
                                if (HorizontalFilterBottomSheet.this.G().C0().a().d().c() == FilterPlaces.ALL_FILTERS) {
                                    i13 = d.f68672i;
                                } else {
                                    i13 = d.f68681r;
                                }
                                int i14 = i13;
                                String a12 = HorizontalFilterBottomSheet.this.G().C0().a().a();
                                boolean c11 = c(a11);
                                final HorizontalFilterBottomSheet horizontalFilterBottomSheet2 = HorizontalFilterBottomSheet.this;
                                g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.onCreateView.1.1.1.1
                                    {
                                        super(0);
                                    }

                                    @Override // g00.a
                                    public /* bridge */ /* synthetic */ p invoke() {
                                        invoke2();
                                        return p.f75480a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        HorizontalFilterBottomSheet.this.G().P0();
                                    }
                                };
                                final HorizontalFilterBottomSheet horizontalFilterBottomSheet3 = HorizontalFilterBottomSheet.this;
                                g00.a<p> aVar4 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.onCreateView.1.1.1.2
                                    {
                                        super(0);
                                    }

                                    @Override // g00.a
                                    public /* bridge */ /* synthetic */ p invoke() {
                                        invoke2();
                                        return p.f75480a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        HorizontalFilterBottomSheet.this.dismiss();
                                    }
                                };
                                final HorizontalFilterBottomSheet horizontalFilterBottomSheet4 = HorizontalFilterBottomSheet.this;
                                g00.a<p> aVar5 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.onCreateView.1.1.1.3
                                    {
                                        super(0);
                                    }

                                    @Override // g00.a
                                    public /* bridge */ /* synthetic */ p invoke() {
                                        invoke2();
                                        return p.f75480a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        HorizontalFilterBottomSheet.this.G().z0();
                                    }
                                };
                                final HorizontalFilterBottomSheet horizontalFilterBottomSheet5 = HorizontalFilterBottomSheet.this;
                                SheetsViewKt.b(a12, c11, i14, aVar3, aVar4, aVar5, null, r0.b.b(aVar2, 1327820225, true, new q<androidx.compose.ui.c, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.onCreateView.1.1.1.4
                                    {
                                        super(3);
                                    }

                                    public final void b(androidx.compose.ui.c it2, androidx.compose.runtime.a aVar6, int i15) {
                                        int i16;
                                        o.i(it2, "it");
                                        if ((i15 & 14) == 0) {
                                            if (aVar6.T(it2)) {
                                                i16 = 4;
                                            } else {
                                                i16 = 2;
                                            }
                                            i15 |= i16;
                                        }
                                        if ((i15 & 91) == 18 && aVar6.i()) {
                                            aVar6.L();
                                            return;
                                        }
                                        if (androidx.compose.runtime.c.I()) {
                                            androidx.compose.runtime.c.U(1327820225, i15, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HorizontalFilterBottomSheet.kt:71)");
                                        }
                                        HorizontalFilterBottomSheet.this.x(it2, aVar6, (i15 & 14) | 64);
                                        if (androidx.compose.runtime.c.I()) {
                                            androidx.compose.runtime.c.T();
                                        }
                                    }

                                    @Override // g00.q
                                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar6, Integer num) {
                                        b(cVar, aVar6, num.intValue());
                                        return p.f75480a;
                                    }
                                }), aVar2, 12582912, 64);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                b(aVar2, num.intValue());
                                return p.f75480a;
                            }
                        }), aVar, 384, 3);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                        b(aVar, num.intValue());
                        return p.f75480a;
                    }
                }));
                return composeView;
            }

            @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
            public void onStart() {
                com.google.android.material.bottomsheet.c cVar;
                super.onStart();
                Dialog dialog = getDialog();
                BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
                if (dialog instanceof com.google.android.material.bottomsheet.c) {
                    cVar = (com.google.android.material.bottomsheet.c) dialog;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    bottomSheetBehavior = cVar.getBehavior();
                }
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.t0(3);
                }
            }

            @Override // androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                o.i(view, "view");
                super.onViewCreated(view, bundle);
                if (this.f29638h == null) {
                    dismiss();
                } else {
                    LifeCycleUtilsKt.b(this, new HorizontalFilterBottomSheet$onViewCreated$1(this, null));
                }
            }

            public final void x(final androidx.compose.ui.c modifier, androidx.compose.runtime.a aVar, final int i11) {
                o.i(modifier, "modifier");
                androidx.compose.runtime.a h11 = aVar.h(74627741);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(74627741, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet.HorizontalView (HorizontalFilterBottomSheet.kt:105)");
                }
                h11.C(-492369756);
                Object D = h11.D();
                if (D == androidx.compose.runtime.a.f7182a.a()) {
                    D = G().D0();
                    h11.u(D);
                }
                h11.S();
                w(modifier, (SnapshotStateList) D, new l<dc.c, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalView$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    public final void b(dc.c it2) {
                        o.i(it2, "it");
                        HorizontalFilterBottomSheet.this.G().M0(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(dc.c cVar) {
                        b(cVar);
                        return p.f75480a;
                    }
                }, h11, (i11 & 14) | 4144);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$HorizontalView$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            HorizontalFilterBottomSheet.this.x(modifier, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            private HorizontalFilterBottomSheet() {
                h b11;
                g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet$special$$inlined$assistedViewModel$1

                    /* compiled from: ViewModelHiltExtension.kt */
                    /* loaded from: classes2.dex */
                    public static final class a extends androidx.lifecycle.a {

                        /* renamed from: f  reason: collision with root package name */
                        final /* synthetic */ HorizontalFilterBottomSheet f29643f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(Fragment fragment, Bundle bundle, HorizontalFilterBottomSheet horizontalFilterBottomSheet) {
                            super(fragment, bundle);
                            this.f29643f = horizontalFilterBottomSheet;
                        }

                        @Override // androidx.lifecycle.a
                        protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                            a.AbstractC0319a.C0320a c0320a;
                            o.i(key, "key");
                            o.i(modelClass, "modelClass");
                            o.i(handle, "handle");
                            HorizontalFilterViewModel.b E = this.f29643f.E();
                            c0320a = this.f29643f.f29638h;
                            o.f(c0320a);
                            HorizontalFilterViewModel a11 = E.a(c0320a);
                            o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                            return a11;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    /* renamed from: b */
                    public final t0.b invoke() {
                        return new a(Fragment.this, Fragment.this.getArguments(), this);
                    }
                };
                b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
                this.f29640j = FragmentViewModelLazyKt.b(this, s.b(HorizontalFilterViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
            }
        }
