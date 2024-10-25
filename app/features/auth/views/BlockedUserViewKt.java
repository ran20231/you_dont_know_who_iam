package com.forsale.app.features.auth.views;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.e;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import e2.h;
import g00.a;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import r0.b;
import t9.q0;
import v0.b;
import w.f;
import w.u;
import wz.p;
import yj.d;
/* compiled from: BlockedUserView.kt */
/* loaded from: classes2.dex */
public final class BlockedUserViewKt {
    public static final void a(c cVar, final String message, final a<p> onContactSupportClicked, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        Object obj;
        final int i13;
        int i14;
        int i15;
        int i16;
        c.a aVar2;
        o.i(message, "message");
        o.i(onContactSupportClicked, "onContactSupportClicked");
        androidx.compose.runtime.a h11 = aVar.h(-1918066301);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            obj = cVar;
        } else if ((i11 & 14) == 0) {
            obj = cVar;
            if (h11.T(obj)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            obj = cVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.T(message)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.F(onContactSupportClicked)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i13 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (i17 != 0) {
                aVar2 = c.f7566a;
            } else {
                aVar2 = obj;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1918066301, i13, -1, "com.forsale.app.features.auth.views.BlockedUserView (BlockedUserView.kt:33)");
            }
            c cVar2 = aVar2;
            e.a(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(74)), g.c(h.l(8)), dk.a.f54291a.a(h11, dk.a.f54292b).d().h(h11, d.f76453b), 0L, null, 0.0f, b.b(h11, 814309248, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.BlockedUserViewKt$BlockedUserView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r34v0, types: [androidx.compose.runtime.a, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v16 */
                public final void b(androidx.compose.runtime.a aVar3, int i18) {
                    if ((i18 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(814309248, i18, -1, "com.forsale.app.features.auth.views.BlockedUserView.<anonymous> (BlockedUserView.kt:39)");
                    }
                    c.a aVar4 = c.f7566a;
                    c h12 = SizeKt.h(aVar4, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.f3698a;
                    Arrangement.e g11 = arrangement.g();
                    String str = message;
                    int i19 = i13;
                    final a<p> aVar5 = onContactSupportClicked;
                    aVar3.C(693286680);
                    b.a aVar6 = v0.b.f74009a;
                    a0 a11 = androidx.compose.foundation.layout.o.a(g11, aVar6.l(), aVar3, 6);
                    aVar3.C(-1323940314);
                    int a12 = j0.e.a(aVar3, 0);
                    k s11 = aVar3.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    a<ComposeUiNode> a13 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
                    if (!(aVar3.k() instanceof j0.d)) {
                        j0.e.c();
                    }
                    aVar3.I();
                    if (aVar3.f()) {
                        aVar3.y(a13);
                    } else {
                        aVar3.t();
                    }
                    androidx.compose.runtime.a a14 = Updater.a(aVar3);
                    Updater.c(a14, a11, companion.e());
                    Updater.c(a14, s11, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                    if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                        a14.u(Integer.valueOf(a12));
                        a14.p(Integer.valueOf(a12), b11);
                    }
                    c11.invoke(e1.a(e1.b(aVar3)), aVar3, 0);
                    aVar3.C(2058660585);
                    u uVar = u.f74924a;
                    c u11 = SizeKt.u(SizeKt.d(aVar4, 0.0f, 1, null), h.l(4));
                    dk.a aVar7 = dk.a.f54291a;
                    int i21 = dk.a.f54292b;
                    d d11 = aVar7.a(aVar3, i21).d();
                    int i22 = d.f76453b;
                    SpacerKt.a(BackgroundKt.b(u11, d11.k(aVar3, i22), null, 2, null), aVar3, 0);
                    float f11 = 14;
                    IconKt.a(p1.e.d(q0.f69729b, aVar3, 0), null, PaddingKt.m(aVar4, h.l(18), h.l(f11), h.l(f11), 0.0f, 8, null), aVar7.a(aVar3, i21).d().k(aVar3, i22), aVar3, 56, 0);
                    Arrangement.f e11 = arrangement.e();
                    c k11 = PaddingKt.k(aVar4, 0.0f, h.l(12), 1, null);
                    aVar3.C(-483455358);
                    a0 a15 = androidx.compose.foundation.layout.e.a(e11, aVar6.k(), aVar3, 6);
                    aVar3.C(-1323940314);
                    int a16 = j0.e.a(aVar3, 0);
                    k s12 = aVar3.s();
                    a<ComposeUiNode> a17 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(k11);
                    if (!(aVar3.k() instanceof j0.d)) {
                        j0.e.c();
                    }
                    aVar3.I();
                    if (aVar3.f()) {
                        aVar3.y(a17);
                    } else {
                        aVar3.t();
                    }
                    androidx.compose.runtime.a a18 = Updater.a(aVar3);
                    Updater.c(a18, a15, companion.e());
                    Updater.c(a18, s12, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                    if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                        a18.u(Integer.valueOf(a16));
                        a18.p(Integer.valueOf(a16), b12);
                    }
                    c12.invoke(e1.a(e1.b(aVar3)), aVar3, 0);
                    aVar3.C(2058660585);
                    f fVar = f.f74891a;
                    TextKt.b(str, null, aVar7.a(aVar3, i21).e().m(aVar3, i22), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar7.c(aVar3, i21).d(), aVar3, (i19 >> 3) & 14, 0, 65530);
                    aVar3.C(1157296644);
                    boolean T = aVar3.T(aVar5);
                    Object D = aVar3.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0262: CONSTRUCTOR  (r3v15 'D' java.lang.Object) = (r10v0 'aVar5' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.auth.views.BlockedUserViewKt$BlockedUserView$1$1$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.auth.views.BlockedUserViewKt$BlockedUserView$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.auth.views.BlockedUserViewKt$BlockedUserView$1$1$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            Method dump skipped, instructions count: 731
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.views.BlockedUserViewKt$BlockedUserView$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), h11, 1572864, 56);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                obj = cVar2;
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                final c cVar3 = obj;
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.BlockedUserViewKt$BlockedUserView$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i18) {
                        BlockedUserViewKt.a(c.this, message, onContactSupportClicked, aVar3, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }
    }
