package com.forsale.app.features.categories.listingdetails.buyerscreen.report;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a0;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.chips.ChipsData;
import com.forsale.designSystem.chips.ChipsKt;
import com.forsale.designSystem.layouts.ListItemsKt;
import com.forsale.ui.components.BottomSheetsKt;
import com.forsale.ui.components.flows.FlowKt;
import e2.h;
import fb.a;
import fb.b;
import g00.l;
import g00.q;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.o;
import p1.g;
import t9.m0;
import t9.y0;
import v0.b;
import w.t;
import w.u;
import wz.p;
import yj.d;
/* compiled from: ShowReportAbuseBottomSheet.kt */
/* loaded from: classes2.dex */
public final class ShowReportAbuseBottomSheetKt {
    public static final void a(final ModalBottomSheetState modalBottomSheetState, final l<? super a, p> onSubmitClickedBottomSheet, final g00.a<p> onCloseBottomSheet, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        int i15;
        o.i(modalBottomSheetState, "modalBottomSheetState");
        o.i(onSubmitClickedBottomSheet, "onSubmitClickedBottomSheet");
        o.i(onCloseBottomSheet, "onCloseBottomSheet");
        androidx.compose.runtime.a h11 = aVar.h(-1694083481);
        if ((i11 & 14) == 0) {
            if (h11.T(modalBottomSheetState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onSubmitClickedBottomSheet)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onCloseBottomSheet)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        int i16 = i12;
        if ((i16 & 731) == 146 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (c.I()) {
                c.U(-1694083481, i16, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet (ShowReportAbuseBottomSheet.kt:40)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                D = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D);
            }
            h11.S();
            final k0 k0Var = (k0) D;
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                D2 = c0.e(new b(null, null, 3, null), null, 2, null);
                h11.u(D2);
            }
            h11.S();
            final k0 k0Var2 = (k0) D2;
            h11.C(-492369756);
            Object D3 = h11.D();
            if (D3 == c0064a.a()) {
                D3 = c0.e("", null, 2, null);
                h11.u(D3);
            }
            h11.S();
            final k0 k0Var3 = (k0) D3;
            h11.C(-492369756);
            Object D4 = h11.D();
            if (D4 == c0064a.a()) {
                D4 = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D4);
            }
            h11.S();
            final k0 k0Var4 = (k0) D4;
            aVar2 = h11;
            BottomSheetsKt.b(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), null, onCloseBottomSheet, g.b(y0.f70713v1, h11, 0), null, null, r0.b.b(h11, -213377213, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i17) {
                    List t02;
                    if ((i17 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-213377213, i17, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet.<anonymous> (ShowReportAbuseBottomSheet.kt:52)");
                    }
                    t02 = ArraysKt___ArraysKt.t0(g.a(m0.f69321a, aVar3, 0));
                    final List<b> a11 = fb.c.a(t02);
                    androidx.compose.ui.c i18 = PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(16));
                    Arrangement.f o11 = Arrangement.f3698a.o(h.l(8));
                    final k0<Boolean> k0Var5 = k0Var4;
                    final k0<b> k0Var6 = k0Var2;
                    final k0<String> k0Var7 = k0Var3;
                    final k0<Boolean> k0Var8 = k0Var;
                    LazyDslKt.a(i18, null, null, false, o11, null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(LazyListScope LazyColumn) {
                            o.i(LazyColumn, "$this$LazyColumn");
                            final k0<Boolean> k0Var9 = k0Var5;
                            LazyListScope.l(LazyColumn, null, null, r0.b.c(-1995905745, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public final void b(x.a item, androidx.compose.runtime.a aVar4, int i19) {
                                    long i21;
                                    o.i(item, "$this$item");
                                    if ((i19 & 81) == 16 && aVar4.i()) {
                                        aVar4.L();
                                        return;
                                    }
                                    if (c.I()) {
                                        c.U(-1995905745, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet.<anonymous>.<anonymous>.<anonymous> (ShowReportAbuseBottomSheet.kt:59)");
                                    }
                                    String b11 = g.b(y0.f70729w1, aVar4, 0);
                                    dk.a aVar5 = dk.a.f54291a;
                                    int i22 = dk.a.f54292b;
                                    a0 c11 = aVar5.c(aVar4, i22).c();
                                    if (!k0Var9.getValue().booleanValue()) {
                                        aVar4.C(-1323612844);
                                        i21 = aVar5.a(aVar4, i22).e().j(aVar4, d.f76453b);
                                        aVar4.S();
                                    } else {
                                        aVar4.C(-1323612746);
                                        i21 = aVar5.a(aVar4, i22).d().i(aVar4, d.f76453b);
                                        aVar4.S();
                                    }
                                    TextKt.a(b11, null, 0, 0, false, 0, 0, null, c11, i21, 0, aVar4, 0, 0, 1278);
                                    if (c.I()) {
                                        c.T();
                                    }
                                }

                                @Override // g00.q
                                public /* bridge */ /* synthetic */ p invoke(x.a aVar4, androidx.compose.runtime.a aVar5, Integer num) {
                                    b(aVar4, aVar5, num.intValue());
                                    return p.f75480a;
                                }
                            }), 3, null);
                            final List<b> list = a11;
                            final k0<b> k0Var10 = k0Var6;
                            LazyListScope.l(LazyColumn, null, null, r0.b.c(-1916766376, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public final void b(x.a item, androidx.compose.runtime.a aVar4, int i19) {
                                    o.i(item, "$this$item");
                                    if ((i19 & 81) == 16 && aVar4.i()) {
                                        aVar4.L();
                                        return;
                                    }
                                    if (c.I()) {
                                        c.U(-1916766376, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet.<anonymous>.<anonymous>.<anonymous> (ShowReportAbuseBottomSheet.kt:69)");
                                    }
                                    float f11 = 8;
                                    float l11 = h.l(f11);
                                    float l12 = h.l(f11);
                                    final List<b> list2 = list;
                                    final k0<b> k0Var11 = k0Var10;
                                    FlowKt.b(null, null, null, l11, null, l12, null, r0.b.b(aVar4, 1397394206, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        public final void b(androidx.compose.runtime.a aVar5, int i21) {
                                            if ((i21 & 11) == 2 && aVar5.i()) {
                                                aVar5.L();
                                                return;
                                            }
                                            if (c.I()) {
                                                c.U(1397394206, i21, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowReportAbuseBottomSheet.kt:70)");
                                            }
                                            final k0<b> k0Var12 = k0Var11;
                                            for (final b bVar : list2) {
                                                ChipsKt.b(null, ChipsData.f41251a.a(), null, o.d(k0Var12.getValue(), bVar), false, null, r0.b.b(aVar5, 1354728874, true, 
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0065: INVOKE  
                                                      (null androidx.compose.ui.c)
                                                      (wrap: com.forsale.designSystem.chips.ChipsData : 0x003b: INVOKE  (r6v0 com.forsale.designSystem.chips.ChipsData A[REMOVE]) = 
                                                      (wrap: com.forsale.designSystem.chips.ChipsData$a : 0x0039: SGET  (r4v0 com.forsale.designSystem.chips.ChipsData$a A[REMOVE]) =  com.forsale.designSystem.chips.ChipsData.a com.forsale.designSystem.chips.ChipsData$a)
                                                     type: VIRTUAL call: com.forsale.designSystem.chips.ChipsData.a.a():com.forsale.designSystem.chips.ChipsData)
                                                      (null xj.a)
                                                      (wrap: boolean : 0x0043: INVOKE  (r8v0 boolean A[REMOVE]) = 
                                                      (wrap: fb.b : 0x003f: INVOKE  (r4v1 fb.b A[REMOVE]) = (r2v2 'k0Var12' j0.k0<fb.b>) type: INTERFACE call: j0.k0.getValue():java.lang.Object)
                                                      (r3v3 'bVar' fb.b)
                                                     type: STATIC call: kotlin.jvm.internal.o.d(java.lang.Object, java.lang.Object):boolean)
                                                      false
                                                      (null g00.p)
                                                      (wrap: r0.a : 0x0056: INVOKE  (r11v1 r0.a A[REMOVE]) = 
                                                      (r19v0 'aVar5' androidx.compose.runtime.a)
                                                      (1354728874 int)
                                                      true
                                                      (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x004d: CONSTRUCTOR  (r4v2 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r3v3 'bVar' fb.b A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$2$1$1$1.<init>(fb.b):void type: CONSTRUCTOR)
                                                     type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                                                      (null g00.p)
                                                      (wrap: g00.l<java.lang.Boolean, wz.p> : 0x005d: CONSTRUCTOR  (r13v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = (r3v3 'bVar' fb.b A[DONT_INLINE]), (r2v2 'k0Var12' j0.k0<fb.b> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$2$1$1$2.<init>(fb.b, j0.k0):void type: CONSTRUCTOR)
                                                      (null v.k)
                                                      (r19v0 'aVar5' androidx.compose.runtime.a)
                                                      (1572864 int)
                                                      (693 int)
                                                     type: STATIC call: com.forsale.designSystem.chips.ChipsKt.b(androidx.compose.ui.c, com.forsale.designSystem.chips.ChipsData, xj.a, boolean, boolean, g00.p, g00.p, g00.p, g00.l, v.k, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.2.1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$2$1$1$1, state: NOT_LOADED
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
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                                    	... 25 more
                                                    */
                                                /*
                                                    this = this;
                                                    r0 = r18
                                                    r1 = r20
                                                    r2 = r1 & 11
                                                    r3 = 2
                                                    if (r2 != r3) goto L14
                                                    boolean r2 = r19.i()
                                                    if (r2 != 0) goto L10
                                                    goto L14
                                                L10:
                                                    r19.L()
                                                    goto L72
                                                L14:
                                                    boolean r2 = androidx.compose.runtime.c.I()
                                                    if (r2 == 0) goto L23
                                                    r2 = -1
                                                    java.lang.String r3 = "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowReportAbuseBottomSheet.kt:70)"
                                                    r4 = 1397394206(0x534a8b1e, float:8.6991739E11)
                                                    androidx.compose.runtime.c.U(r4, r1, r2, r3)
                                                L23:
                                                    java.util.List<fb.b> r1 = r1
                                                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                                                    j0.k0<fb.b> r2 = r2
                                                    java.util.Iterator r1 = r1.iterator()
                                                L2d:
                                                    boolean r3 = r1.hasNext()
                                                    if (r3 == 0) goto L69
                                                    java.lang.Object r3 = r1.next()
                                                    fb.b r3 = (fb.b) r3
                                                    com.forsale.designSystem.chips.ChipsData$a r4 = com.forsale.designSystem.chips.ChipsData.f41251a
                                                    com.forsale.designSystem.chips.ChipsData r6 = r4.a()
                                                    java.lang.Object r4 = r2.getValue()
                                                    boolean r8 = kotlin.jvm.internal.o.d(r4, r3)
                                                    r5 = 0
                                                    r7 = 0
                                                    r9 = 0
                                                    r10 = 0
                                                    com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$2$1$1$1 r4 = new com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$2$1$1$1
                                                    r4.<init>(r3)
                                                    r11 = 1354728874(0x50bf85aa, float:2.57056645E10)
                                                    r12 = 1
                                                    r15 = r19
                                                    r0.a r11 = r0.b.b(r15, r11, r12, r4)
                                                    r12 = 0
                                                    com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$2$1$1$2 r13 = new com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$2$1$1$2
                                                    r13.<init>(r3, r2)
                                                    r14 = 0
                                                    r16 = 1572864(0x180000, float:2.204052E-39)
                                                    r17 = 693(0x2b5, float:9.71E-43)
                                                    com.forsale.designSystem.chips.ChipsKt.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                                                    goto L2d
                                                L69:
                                                    boolean r1 = androidx.compose.runtime.c.I()
                                                    if (r1 == 0) goto L72
                                                    androidx.compose.runtime.c.T()
                                                L72:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.AnonymousClass1.AnonymousClass2.C02841.b(androidx.compose.runtime.a, int):void");
                                            }

                                            @Override // g00.p
                                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                                                b(aVar5, num.intValue());
                                                return p.f75480a;
                                            }
                                        }), aVar4, 12782592, 87);
                                        SpacerKt.a(PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(4)), aVar4, 6);
                                        if (c.I()) {
                                            c.T();
                                        }
                                    }

                                    @Override // g00.q
                                    public /* bridge */ /* synthetic */ p invoke(x.a aVar4, androidx.compose.runtime.a aVar5, Integer num) {
                                        b(aVar4, aVar5, num.intValue());
                                        return p.f75480a;
                                    }
                                }), 3, null);
                                final k0<String> k0Var11 = k0Var7;
                                LazyListScope.l(LazyColumn, null, null, r0.b.c(566633719, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.a] */
                                    /* JADX WARN: Type inference failed for: r5v3 */
                                    public final void b(x.a item, androidx.compose.runtime.a aVar4, int i19) {
                                        o.i(item, "$this$item");
                                        if ((i19 & 81) == 16 && aVar4.i()) {
                                            aVar4.L();
                                            return;
                                        }
                                        if (c.I()) {
                                            c.U(566633719, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet.<anonymous>.<anonymous>.<anonymous> (ShowReportAbuseBottomSheet.kt:93)");
                                        }
                                        String value = k0Var11.getValue();
                                        androidx.compose.ui.c i21 = SizeKt.i(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), h.l(113));
                                        final k0<String> k0Var12 = k0Var11;
                                        aVar4.C(1157296644);
                                        boolean T = aVar4.T(k0Var12);
                                        Object D5 = aVar4.D();
                                        if (T || D5 == androidx.compose.runtime.a.f7182a.a()) {
                                            D5 = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0068: CONSTRUCTOR  (r5v2 'D5' java.lang.Object) = (r3v7 'k0Var12' j0.k0<java.lang.String> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$3$1$1.<init>(j0.k0):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.3.b(x.a, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$3$1$1, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                                	... 25 more
                                                */
                                            /*
                                                this = this;
                                                r0 = r25
                                                r2 = r27
                                                r1 = r28
                                                java.lang.String r3 = "$this$item"
                                                r4 = r26
                                                kotlin.jvm.internal.o.i(r4, r3)
                                                r3 = r1 & 81
                                                r4 = 16
                                                if (r3 != r4) goto L1f
                                                boolean r3 = r27.i()
                                                if (r3 != 0) goto L1a
                                                goto L1f
                                            L1a:
                                                r27.L()
                                                goto Lac
                                            L1f:
                                                boolean r3 = androidx.compose.runtime.c.I()
                                                if (r3 == 0) goto L2e
                                                r3 = -1
                                                java.lang.String r4 = "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet.<anonymous>.<anonymous>.<anonymous> (ShowReportAbuseBottomSheet.kt:93)"
                                                r5 = 566633719(0x21c624f7, float:1.3426786E-18)
                                                androidx.compose.runtime.c.U(r5, r1, r3, r4)
                                            L2e:
                                                j0.k0<java.lang.String> r1 = r1
                                                java.lang.Object r1 = r1.getValue()
                                                r21 = r1
                                                java.lang.String r21 = (java.lang.String) r21
                                                androidx.compose.ui.c$a r1 = androidx.compose.ui.c.f7566a
                                                r3 = 1
                                                r4 = 0
                                                r5 = 0
                                                androidx.compose.ui.c r1 = androidx.compose.foundation.layout.SizeKt.h(r1, r5, r3, r4)
                                                r3 = 113(0x71, float:1.58E-43)
                                                float r3 = (float) r3
                                                float r3 = e2.h.l(r3)
                                                androidx.compose.ui.c r1 = androidx.compose.foundation.layout.SizeKt.i(r1, r3)
                                                j0.k0<java.lang.String> r3 = r1
                                                r4 = 1157296644(0x44faf204, float:2007.563)
                                                r2.C(r4)
                                                boolean r4 = r2.T(r3)
                                                java.lang.Object r5 = r27.D()
                                                if (r4 != 0) goto L66
                                                androidx.compose.runtime.a$a r4 = androidx.compose.runtime.a.f7182a
                                                java.lang.Object r4 = r4.a()
                                                if (r5 != r4) goto L6e
                                            L66:
                                                com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$3$1$1 r5 = new com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$3$1$1
                                                r5.<init>(r3)
                                                r2.u(r5)
                                            L6e:
                                                r27.S()
                                                r3 = r5
                                                g00.l r3 = (g00.l) r3
                                                r4 = 0
                                                r5 = 0
                                                r6 = 0
                                                r7 = 0
                                                r8 = 0
                                                r9 = 0
                                                r10 = 0
                                                com.forsale.app.features.categories.listingdetails.buyerscreen.report.ComposableSingletons$ShowReportAbuseBottomSheetKt r11 = com.forsale.app.features.categories.listingdetails.buyerscreen.report.ComposableSingletons$ShowReportAbuseBottomSheetKt.f26470a
                                                g00.p r11 = r11.a()
                                                r12 = 70
                                                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                                                r13 = 0
                                                r14 = 0
                                                r15 = 0
                                                r16 = 0
                                                r17 = 0
                                                r18 = 0
                                                r19 = 0
                                                com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$3$2 r20 = new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.3.2
                                                    static {
                                                        /*
                                                            com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$3$2 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$3$2
                                                            r0.<init>()
                                                            
                                                            // error: 0x0005: SPUT  
  (r0 I:com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$3$2)
 com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.3.2.a com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$3$2
                                                            return
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.AnonymousClass1.AnonymousClass3.AnonymousClass2.<clinit>():void");
                                                    }

                                                    {
                                                        /*
                                                            r1 = this;
                                                            r0 = 0
                                                            r1.<init>(r0)
                                                            return
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.AnonymousClass1.AnonymousClass3.AnonymousClass2.<init>():void");
                                                    }

                                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        /*
                                                            r0 = this;
                                                            return
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke2():void");
                                                    }

                                                    @Override // g00.a
                                                    public /* bridge */ /* synthetic */ wz.p invoke() {
                                                        /*
                                                            r1 = this;
                                                            r1.invoke2()
                                                            wz.p r0 = wz.p.f75480a
                                                            return r0
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke():java.lang.Object");
                                                    }
                                                }
                                                r22 = 6
                                                r23 = 805306422(0x30000036, float:4.656643E-10)
                                                r24 = 521208(0x7f3f8, float:7.30368E-40)
                                                r2 = r21
                                                r21 = r27
                                                com.forsale.designSystem.inputs.InputsKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                                                boolean r1 = androidx.compose.runtime.c.I()
                                                if (r1 == 0) goto Lac
                                                androidx.compose.runtime.c.T()
                                            Lac:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.AnonymousClass1.AnonymousClass3.b(x.a, androidx.compose.runtime.a, int):void");
                                        }

                                        @Override // g00.q
                                        public /* bridge */ /* synthetic */ p invoke(x.a aVar4, androidx.compose.runtime.a aVar5, Integer num) {
                                            b(aVar4, aVar5, num.intValue());
                                            return p.f75480a;
                                        }
                                    }), 3, null);
                                    final k0<Boolean> k0Var12 = k0Var8;
                                    LazyListScope.l(LazyColumn, null, null, r0.b.c(-1244933482, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        public final void b(x.a item, androidx.compose.runtime.a aVar4, int i19) {
                                            o.i(item, "$this$item");
                                            if ((i19 & 81) == 16 && aVar4.i()) {
                                                aVar4.L();
                                                return;
                                            }
                                            if (c.I()) {
                                                c.U(-1244933482, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet.<anonymous>.<anonymous>.<anonymous> (ShowReportAbuseBottomSheet.kt:110)");
                                            }
                                            final k0<Boolean> k0Var13 = k0Var12;
                                            ListItemsKt.b(null, null, r0.b.b(aVar4, 317845650, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.4.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r21v0, types: [androidx.compose.runtime.a, java.lang.Object] */
                                                /* JADX WARN: Type inference failed for: r8v2 */
                                                public final void b(t SingleLineListItem, androidx.compose.runtime.a aVar5, int i21) {
                                                    o.i(SingleLineListItem, "$this$SingleLineListItem");
                                                    if ((i21 & 81) == 16 && aVar5.i()) {
                                                        aVar5.L();
                                                        return;
                                                    }
                                                    if (c.I()) {
                                                        c.U(317845650, i21, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowReportAbuseBottomSheet.kt:111)");
                                                    }
                                                    Arrangement.f o12 = Arrangement.f3698a.o(h.l(12));
                                                    b.c i22 = v0.b.f74009a.i();
                                                    final k0<Boolean> k0Var14 = k0Var13;
                                                    aVar5.C(693286680);
                                                    c.a aVar6 = androidx.compose.ui.c.f7566a;
                                                    androidx.compose.ui.layout.a0 a12 = androidx.compose.foundation.layout.o.a(o12, i22, aVar5, 54);
                                                    aVar5.C(-1323940314);
                                                    int a13 = e.a(aVar5, 0);
                                                    k s11 = aVar5.s();
                                                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                                                    g00.a<ComposeUiNode> a14 = companion.a();
                                                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar6);
                                                    if (!(aVar5.k() instanceof j0.d)) {
                                                        e.c();
                                                    }
                                                    aVar5.I();
                                                    if (aVar5.f()) {
                                                        aVar5.y(a14);
                                                    } else {
                                                        aVar5.t();
                                                    }
                                                    androidx.compose.runtime.a a15 = Updater.a(aVar5);
                                                    Updater.c(a15, a12, companion.e());
                                                    Updater.c(a15, s11, companion.g());
                                                    g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                                                    if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                                                        a15.u(Integer.valueOf(a13));
                                                        a15.p(Integer.valueOf(a13), b11);
                                                    }
                                                    c11.invoke(e1.a(e1.b(aVar5)), aVar5, 0);
                                                    aVar5.C(2058660585);
                                                    u uVar = u.f74924a;
                                                    boolean booleanValue = k0Var14.getValue().booleanValue();
                                                    float l11 = h.l(24);
                                                    aVar5.C(1157296644);
                                                    boolean T = aVar5.T(k0Var14);
                                                    Object D5 = aVar5.D();
                                                    if (T || D5 == androidx.compose.runtime.a.f7182a.a()) {
                                                        D5 = 
                                                        /*  JADX ERROR: Method code generation error
                                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0154: INVOKE  
                                                              (wrap: androidx.compose.ui.c : 0x00f7: INVOKE  (r0v9 androidx.compose.ui.c A[REMOVE]) = 
                                                              (wrap: androidx.compose.ui.c$a : 0x00f3: SGET  (r0v8 androidx.compose.ui.c$a A[REMOVE]) =  androidx.compose.ui.c.a androidx.compose.ui.c$a)
                                                              (0.0f float)
                                                              (1 int)
                                                              (null java.lang.Object)
                                                             type: STATIC call: androidx.compose.foundation.layout.SizeKt.h(androidx.compose.ui.c, float, int, java.lang.Object):androidx.compose.ui.c)
                                                              (null java.lang.Integer)
                                                              (r22v0 'onCloseBottomSheet' g00.a<wz.p>)
                                                              (wrap: java.lang.String : 0x00ef: INVOKE  (r3v1 java.lang.String A[REMOVE]) = (wrap: int : 0x00ec: SGET  (r0v7 int A[REMOVE]) =  t9.y0.v1 int), (r12v0 'h11' androidx.compose.runtime.a), (0 int) type: STATIC call: p1.g.b(int, androidx.compose.runtime.a, int):java.lang.String)
                                                              (null g00.q)
                                                              (null g00.p)
                                                              (wrap: r0.a : 0x0109: INVOKE  (r6v3 r0.a A[REMOVE]) = 
                                                              (r12v0 'h11' androidx.compose.runtime.a)
                                                              (-213377213 int)
                                                              true
                                                              (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0103: CONSTRUCTOR  (r6v2 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                                                              (r5v4 'k0Var4' j0.k0 A[DONT_INLINE])
                                                              (r8v1 'k0Var2' j0.k0 A[DONT_INLINE])
                                                              (r7v1 'k0Var3' j0.k0 A[DONT_INLINE])
                                                              (r10v1 'k0Var' j0.k0 A[DONT_INLINE])
                                                             call: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.<init>(j0.k0, j0.k0, j0.k0, j0.k0):void type: CONSTRUCTOR)
                                                             type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                                                              (wrap: r0.a : 0x0128: INVOKE  (r7v4 r0.a A[REMOVE]) = 
                                                              (r12v0 'h11' androidx.compose.runtime.a)
                                                              (1905673762 int)
                                                              true
                                                              (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0122: CONSTRUCTOR  (r9v2 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                                                              (r8v1 'k0Var2' j0.k0 A[DONT_INLINE])
                                                              (r7v1 'k0Var3' j0.k0 A[DONT_INLINE])
                                                              (r5v4 'k0Var4' j0.k0 A[DONT_INLINE])
                                                              (r21v0 'onSubmitClickedBottomSheet' g00.l<? super fb.a, wz.p> A[DONT_INLINE])
                                                              (r10v1 'k0Var' j0.k0 A[DONT_INLINE])
                                                             call: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$2.<init>(j0.k0, j0.k0, j0.k0, g00.l, j0.k0):void type: CONSTRUCTOR)
                                                             type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                                                              (0 long)
                                                              (r20v0 'modalBottomSheetState' com.forsale.designSystem.bottomsheets.ModalBottomSheetState)
                                                              (null kotlinx.coroutines.CoroutineScope)
                                                              (r22v0 'onCloseBottomSheet' g00.a<wz.p>)
                                                              (r12v0 'h11' androidx.compose.runtime.a)
                                                              (wrap: int : 0x013a: ARITH  (r1v21 int A[REMOVE]) = (wrap: int : 0x0134: ARITH  (r1v20 int A[REMOVE]) = (14180358 int) | (wrap: int : 0x0132: ARITH  (r5v7 int A[REMOVE]) = (r11v0 'i16' int) & (896 int))) | (wrap: int : 0x0139: ARITH  (r5v9 int A[REMOVE]) = (wrap: int : 0x0135: ARITH  (r5v8 int A[REMOVE]) = (r11v0 'i16' int) << (27 int)) & (1879048192 int)))
                                                              (wrap: int : 0x013f: ARITH  (r1v23 int A[REMOVE]) = (wrap: int : 0x013d: ARITH  (r1v22 int A[REMOVE]) = (r11v0 'i16' int) >> (3 int)) & (112 int))
                                                              (1314 int)
                                                             type: STATIC call: com.forsale.ui.components.BottomSheetsKt.b(androidx.compose.ui.c, java.lang.Integer, g00.a, java.lang.String, g00.q, g00.p, g00.p, g00.p, long, com.forsale.designSystem.bottomsheets.ModalBottomSheetState, kotlinx.coroutines.CoroutineScope, g00.a, androidx.compose.runtime.a, int, int, int):void in method: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.a(com.forsale.designSystem.bottomsheets.ModalBottomSheetState, g00.l<? super fb.a, wz.p>, g00.a<wz.p>, androidx.compose.runtime.a, int):void, file: classes2.dex
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:309)
                                                            	... 5 more
                                                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0075: INVOKE  
                                                              (r1v5 'i18' androidx.compose.ui.c)
                                                              (null androidx.compose.foundation.lazy.LazyListState)
                                                              (null w.o)
                                                              false
                                                              (r11v0 'o11' androidx.compose.foundation.layout.Arrangement$f)
                                                              (null v0.b$b)
                                                              (null t.g)
                                                              false
                                                              (wrap: g00.l<androidx.compose.foundation.lazy.LazyListScope, wz.p> : 0x0061: CONSTRUCTOR  (r16v0 g00.l<androidx.compose.foundation.lazy.LazyListScope, wz.p> A[REMOVE]) = 
                                                              (r3v4 'k0Var5' j0.k0<java.lang.Boolean> A[DONT_INLINE])
                                                              (r4v0 'a11' java.util.List<fb.b> A[DONT_INLINE])
                                                              (r5v0 'k0Var6' j0.k0<fb.b> A[DONT_INLINE])
                                                              (r6v0 'k0Var7' j0.k0<java.lang.String> A[DONT_INLINE])
                                                              (r7v0 'k0Var8' j0.k0<java.lang.Boolean> A[DONT_INLINE])
                                                             call: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.1.<init>(j0.k0, java.util.List, j0.k0, j0.k0, j0.k0):void type: CONSTRUCTOR)
                                                              (r19v0 'aVar3' androidx.compose.runtime.a)
                                                              (24582 int)
                                                              (238 int)
                                                             type: STATIC call: androidx.compose.foundation.lazy.LazyDslKt.a(androidx.compose.ui.c, androidx.compose.foundation.lazy.LazyListState, w.o, boolean, androidx.compose.foundation.layout.Arrangement$m, v0.b$b, t.g, boolean, g00.l, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                                                            	... 5 more
                                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:309)
                                                            	... 5 more
                                                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0058: INVOKE  
                                                              (r15v0 'LazyColumn' androidx.compose.foundation.lazy.LazyListScope)
                                                              (null java.lang.Object)
                                                              (null java.lang.Object)
                                                              (wrap: r0.a : 0x0054: INVOKE  (r11v1 r0.a A[REMOVE]) = 
                                                              (-1244933482 int)
                                                              true
                                                              (wrap: g00.q<x.a, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x004e: CONSTRUCTOR  (r0v5 g00.q<x.a, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r1v6 'k0Var12' j0.k0<java.lang.Boolean> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.4.<init>(j0.k0):void type: CONSTRUCTOR)
                                                             type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                                                              (3 int)
                                                              (null java.lang.Object)
                                                             type: STATIC call: androidx.compose.foundation.lazy.LazyListScope.l(androidx.compose.foundation.lazy.LazyListScope, java.lang.Object, java.lang.Object, g00.q, int, java.lang.Object):void in method: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1.1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                                            	... 5 more
                                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:309)
                                                            	... 5 more
                                                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003c: INVOKE  
                                                              (null androidx.compose.ui.c)
                                                              (null g00.p)
                                                              (wrap: r0.a : 0x0032: INVOKE  (r4v0 r0.a A[REMOVE]) = 
                                                              (r11v0 'aVar4' androidx.compose.runtime.a)
                                                              (317845650 int)
                                                              true
                                                              (wrap: g00.q<w.t, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x002b: CONSTRUCTOR  (r10v3 g00.q<w.t, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r12v1 'k0Var13' j0.k0<java.lang.Boolean> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.4.1.<init>(j0.k0):void type: CONSTRUCTOR)
                                                             type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                                                              (null g00.q)
                                                              (r11v0 'aVar4' androidx.compose.runtime.a)
                                                              (384 int)
                                                              (11 int)
                                                             type: STATIC call: com.forsale.designSystem.layouts.ListItemsKt.b(androidx.compose.ui.c, g00.p, g00.q, g00.q, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.4.b(x.a, androidx.compose.runtime.a, int):void, file: classes2.dex
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                                                            	... 5 more
                                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:309)
                                                            	... 5 more
                                                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0103: CONSTRUCTOR  (r8v1 'D5' java.lang.Object) = (r2v2 'k0Var14' j0.k0<java.lang.Boolean> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$4$1$1$1$1.<init>(j0.k0):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.ShowReportAbuseBottomSheet.1.1.4.1.b(w.t, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                                            	... 5 more
                                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt$ShowReportAbuseBottomSheet$1$1$4$1$1$1$1, state: NOT_LOADED
                                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                                            	... 25 more
                                                            */
                                                        /*
                                                            Method dump skipped, instructions count: 376
                                                            To view this dump add '--comments-level debug' option
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt.a(com.forsale.designSystem.bottomsheets.ModalBottomSheetState, g00.l, g00.a, androidx.compose.runtime.a, int):void");
                                                    }
                                                }
