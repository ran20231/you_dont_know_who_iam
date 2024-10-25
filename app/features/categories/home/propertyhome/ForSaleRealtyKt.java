package com.forsale.app.features.categories.home.propertyhome;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import com.forsale.designSystem.tags.TagData;
import com.forsale.designSystem.tags.TagsKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.r;
import j0.u;
import j0.v0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import p1.g;
import t9.y0;
import w.t;
import wz.p;
/* compiled from: ForSaleRealty.kt */
/* loaded from: classes2.dex */
public final class ForSaleRealtyKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final boolean z11, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        final int i12;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar2.h(-807109032);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-807109032, i12, -1, "com.forsale.app.features.categories.home.propertyhome.DiscoverButton (ForSaleRealty.kt:118)");
            }
            ButtonData c11 = ButtonData.f40994a.c();
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$DiscoverButton$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        aVar.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            ButtonsKt.k((g00.a) D, null, c11, false, false, null, r0.b.b(h11, 1838696658, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$DiscoverButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(t TextButton, androidx.compose.runtime.a aVar3, int i15) {
                    o.i(TextButton, "$this$TextButton");
                    if ((i15 & 81) == 16 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1838696658, i15, -1, "com.forsale.app.features.categories.home.propertyhome.DiscoverButton.<anonymous> (ForSaleRealty.kt:123)");
                    }
                    String b11 = g.b(y0.f70618p4, aVar3, 0);
                    c.a aVar4 = androidx.compose.ui.c.f7566a;
                    float f11 = 8;
                    TextKt.a(b11, com.forsale.ui.components.skeleton.a.a(aVar4, z11, c0.g.c(h.l(f11)), 0L, 0L, aVar3, ((i12 << 3) & 112) | 6, 12), 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2044);
                    IconKt.a(p1.e.d(sj.d.f68676m, aVar3, 0), com.forsale.ui.components.skeleton.a.a(aVar4, z11, c0.g.c(h.l(f11)), 0L, 0L, aVar3, ((i12 << 3) & 112) | 6, 12), null, 0L, false, 0.0f, aVar3, 392, 56);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar3, Integer num) {
                    b(tVar, aVar3, num.intValue());
                    return p.f75480a;
                }
            }), h11, (ButtonData.f40995b << 6) | 1572864, 58);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$DiscoverButton$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i15) {
                    ForSaleRealtyKt.a(z11, aVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final boolean z11, final SectionState forSaleRealtyResponse, final g00.p<? super Integer, ? super Integer, p> pVar, final g00.a<p> discoverCallBack, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        final int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        o.i(forSaleRealtyResponse, "forSaleRealtyResponse");
        o.i(discoverCallBack, "discoverCallBack");
        androidx.compose.runtime.a h11 = aVar.h(446938976);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.T(forSaleRealtyResponse)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.F(pVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (h11.F(discoverCallBack)) {
                i17 = RecyclerView.l.FLAG_MOVED;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i13 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (i18 != 0) {
                pVar = new g00.p<Integer, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealty$1
                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(Integer num, Integer num2) {
                        b(num.intValue(), num2.intValue());
                        return p.f75480a;
                    }

                    public final void b(int i19, int i21) {
                    }
                };
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(446938976, i13, -1, "com.forsale.app.features.categories.home.propertyhome.ForSaleRealty (ForSaleRealty.kt:55)");
            }
            forSaleRealtyResponse.a(r0.b.b(h11, -272428694, true, new q<SectionState.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealty$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.a] */
                /* JADX WARN: Type inference failed for: r1v4 */
                public final void b(SectionState.e result, androidx.compose.runtime.a aVar2, int i19) {
                    o.i(result, "result");
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-272428694, i19, -1, "com.forsale.app.features.categories.home.propertyhome.ForSaleRealty.<anonymous> (ForSaleRealty.kt:57)");
                    }
                    List<?> d11 = result.d();
                    o.g(d11, "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel>");
                    boolean z12 = z11;
                    g00.p<Integer, Integer, p> pVar2 = pVar;
                    Boolean valueOf = Boolean.valueOf(z12);
                    final g00.a<p> aVar3 = discoverCallBack;
                    final boolean z13 = z11;
                    aVar2.C(511388516);
                    boolean T = aVar2.T(valueOf) | aVar2.T(aVar3);
                    Object D = aVar2.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: CONSTRUCTOR  (r1v3 'D' java.lang.Object) = (r0v2 'z13' boolean A[DONT_INLINE]), (r13v1 'aVar3' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealty$2$1$1.<init>(boolean, g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealty$2.b(com.forsale.app.features.categories.home.propertyhome.models.SectionState$e, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealty$2$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 21 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "result"
                            kotlin.jvm.internal.o.i(r11, r0)
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L14
                            r0 = -1
                            java.lang.String r1 = "com.forsale.app.features.categories.home.propertyhome.ForSaleRealty.<anonymous> (ForSaleRealty.kt:57)"
                            r2 = -272428694(0xffffffffefc3116a, float:-1.2074126E29)
                            androidx.compose.runtime.c.U(r2, r13, r0, r1)
                        L14:
                            java.util.List r3 = r11.d()
                            java.lang.String r11 = "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel>"
                            kotlin.jvm.internal.o.g(r3, r11)
                            boolean r4 = r1
                            g00.p<java.lang.Integer, java.lang.Integer, wz.p> r5 = r2
                            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
                            g00.a<wz.p> r13 = r3
                            boolean r0 = r1
                            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                            r12.C(r1)
                            boolean r11 = r12.T(r11)
                            boolean r1 = r12.T(r13)
                            r11 = r11 | r1
                            java.lang.Object r1 = r12.D()
                            if (r11 != 0) goto L46
                            androidx.compose.runtime.a$a r11 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r11 = r11.a()
                            if (r1 != r11) goto L4e
                        L46:
                            com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealty$2$1$1 r1 = new com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealty$2$1$1
                            r1.<init>(r0, r13)
                            r12.u(r1)
                        L4e:
                            r12.S()
                            r6 = r1
                            g00.a r6 = (g00.a) r6
                            int r11 = r4
                            int r13 = r11 << 3
                            r13 = r13 & 112(0x70, float:1.57E-43)
                            r13 = r13 | 8
                            r11 = r11 & 896(0x380, float:1.256E-42)
                            r8 = r13 | r11
                            r9 = 0
                            r7 = r12
                            com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt.k(r3, r4, r5, r6, r7, r8, r9)
                            boolean r11 = androidx.compose.runtime.c.I()
                            if (r11 == 0) goto L6e
                            androidx.compose.runtime.c.T()
                        L6e:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealty$2.b(com.forsale.app.features.categories.home.propertyhome.models.SectionState$e, androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(SectionState.e eVar, androidx.compose.runtime.a aVar2, Integer num) {
                        b(eVar, aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), h11, (i13 & 112) | 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            final g00.p<? super Integer, ? super Integer, p> pVar2 = pVar;
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealty$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i19) {
                        ForSaleRealtyKt.b(z11, forSaleRealtyResponse, pVar2, discoverCallBack, aVar2, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void c(final g00.a<p> discoverCallBack, final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
            final int i12;
            int i13;
            int i14;
            o.i(discoverCallBack, "discoverCallBack");
            androidx.compose.runtime.a h11 = aVar.h(1445655919);
            if ((i11 & 14) == 0) {
                if (h11.F(discoverCallBack)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i12 = i14 | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                if (h11.a(z11)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i12 |= i13;
            }
            if ((i12 & 91) == 18 && h11.i()) {
                h11.L();
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1445655919, i12, -1, "com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyHeader (ForSaleRealty.kt:89)");
                }
                float f11 = 16;
                SectionTitleKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null), null, r0.b.b(h11, -1793863251, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyHeader$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i15) {
                        if ((i15 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1793863251, i15, -1, "com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyHeader.<anonymous> (ForSaleRealty.kt:92)");
                        }
                        TextKt.a(g.b(y0.f70652r4, aVar2, 0), com.forsale.ui.components.skeleton.a.a(androidx.compose.ui.c.f7566a, z11, c0.g.c(h.l(8)), 0L, 0L, aVar2, (i12 & 112) | 6, 12), 0, 0, false, 0, 0, null, null, 0L, 0, aVar2, 0, 0, 2044);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), r0.b.b(h11, 745590052, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyHeader$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void b(t SectionTitle, androidx.compose.runtime.a aVar2, int i15) {
                        o.i(SectionTitle, "$this$SectionTitle");
                        if ((i15 & 81) == 16 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(745590052, i15, -1, "com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyHeader.<anonymous> (ForSaleRealty.kt:94)");
                        }
                        ForSaleRealtyKt.f(z11, aVar2, (i12 >> 3) & 14);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar2, Integer num) {
                        b(tVar, aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), r0.b.b(h11, 1177925099, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyHeader$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i15) {
                        if ((i15 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1177925099, i15, -1, "com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyHeader.<anonymous> (ForSaleRealty.kt:95)");
                        }
                        boolean z12 = z11;
                        g00.a<p> aVar3 = discoverCallBack;
                        int i16 = i12;
                        ForSaleRealtyKt.a(z12, aVar3, aVar2, ((i16 << 3) & 112) | ((i16 >> 3) & 14));
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), r0.b.b(h11, 516335626, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyHeader$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i15) {
                        if ((i15 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(516335626, i15, -1, "com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyHeader.<anonymous> (ForSaleRealty.kt:97)");
                        }
                        TextKt.a(g.b(y0.f70601o4, aVar2, 0), com.forsale.ui.components.skeleton.a.a(androidx.compose.ui.c.f7566a, z11, c0.g.c(h.l(8)), 0L, 0L, aVar2, (i12 & 112) | 6, 12), 0, 0, false, 0, 0, null, null, 0L, 0, aVar2, 0, 0, 2044);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), h11, 224646, 2);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyHeader$5
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i15) {
                        ForSaleRealtyKt.c(discoverCallBack, z11, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(final List<ForPropertyListingItemViewModel> list, final boolean z11, g00.p<? super Integer, ? super Integer, p> pVar, androidx.compose.runtime.a aVar, final int i11, final int i12) {
            final g00.p<? super Integer, ? super Integer, p> pVar2;
            Integer e11;
            androidx.compose.runtime.a h11 = aVar.h(1973909248);
            if ((i12 & 4) != 0) {
                pVar2 = new g00.p<Integer, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$1
                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(Integer num, Integer num2) {
                        b(num.intValue(), num2.intValue());
                        return p.f75480a;
                    }

                    public final void b(int i13, int i14) {
                    }
                };
            } else {
                pVar2 = pVar;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1973909248, i11, -1, "com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyList (ForSaleRealty.kt:140)");
            }
            boolean z12 = false;
            final LazyListState c11 = LazyListStateKt.c(0, 0, h11, 0, 3);
            h11.C(773894976);
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                androidx.compose.runtime.f fVar = new androidx.compose.runtime.f(u.j(EmptyCoroutineContext.f61739a, h11));
                h11.u(fVar);
                D = fVar;
            }
            h11.S();
            final CoroutineScope a11 = ((androidx.compose.runtime.f) D).a();
            h11.S();
            final int size = list.size();
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                D2 = z.d(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$maxItemReachedAds$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // g00.a
                    public final Integer invoke() {
                        Object v02;
                        List<Integer> a12 = aj.b.a(LazyListState.this.x());
                        if (a12.isEmpty() || list == null) {
                            return null;
                        }
                        v02 = CollectionsKt___CollectionsKt.v0(a12);
                        return Integer.valueOf(((Number) v02).intValue() + 1);
                    }
                });
                h11.u(D2);
            }
            h11.S();
            n1 n1Var = (n1) D2;
            if (c11.e() && (e11 = e(n1Var)) != null) {
                if (e11.intValue() > size) {
                    z12 = true;
                }
                if (z12) {
                    e11 = null;
                }
                if (e11 != null) {
                    pVar2.invoke(Integer.valueOf(e11.intValue()), Integer.valueOf(size));
                }
            }
            final s sVar = (s) h11.q(AndroidCompositionLocals_androidKt.i());
            u.a(sVar, new l<j0.s, r>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4

                /* compiled from: Effects.kt */
                /* loaded from: classes2.dex */
                public static final class a implements r {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ s f24579a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ androidx.lifecycle.p f24580b;

                    public a(s sVar, androidx.lifecycle.p pVar) {
                        this.f24579a = sVar;
                        this.f24580b = pVar;
                    }

                    @Override // j0.r
                    public void dispose() {
                        this.f24579a.getLifecycle().d(this.f24580b);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // g00.l
                /* renamed from: b */
                public final r invoke(j0.s DisposableEffect) {
                    o.i(DisposableEffect, "$this$DisposableEffect");
                    final CoroutineScope coroutineScope = a11;
                    final LazyListState lazyListState = c11;
                    androidx.lifecycle.p pVar3 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: CONSTRUCTOR  (r3v1 'pVar3' androidx.lifecycle.p) = 
                          (r0v1 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                          (r1v0 'lazyListState' androidx.compose.foundation.lazy.LazyListState A[DONT_INLINE])
                         call: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4$observer$1.<init>(kotlinx.coroutines.CoroutineScope, androidx.compose.foundation.lazy.LazyListState):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4.b(j0.s):j0.r, file: classes2.dex
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
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4$observer$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$DisposableEffect"
                        kotlin.jvm.internal.o.i(r3, r0)
                        com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4$observer$1 r3 = new com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4$observer$1
                        kotlinx.coroutines.CoroutineScope r0 = r2
                        androidx.compose.foundation.lazy.LazyListState r1 = r3
                        r3.<init>(r0, r1)
                        androidx.lifecycle.s r0 = androidx.lifecycle.s.this
                        androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
                        r0.a(r3)
                        androidx.lifecycle.s r0 = androidx.lifecycle.s.this
                        com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4$a r1 = new com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4$a
                        r1.<init>(r0, r3)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4.invoke(j0.s):j0.r");
                }
            }, h11, 8);
            float f11 = 16;
            LazyDslKt.b(null, c11, PaddingKt.e(h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null), false, Arrangement.f3698a.o(h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(LazyListScope LazyRow) {
                    final List<ForPropertyListingItemViewModel> list2;
                    o.i(LazyRow, "$this$LazyRow");
                    if (z11) {
                        list2 = ForPropertyListingItemViewModel.X.a(5);
                    } else {
                        list2 = list;
                    }
                    final boolean z13 = z11;
                    final int i13 = i11;
                    final int i14 = size;
                    LazyRow.f(list2.size(), null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: INVOKE  
                          (r8v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                          (wrap: int : 0x0019: INVOKE  (r4v0 int A[REMOVE]) = 
                          (r0v3 'list2' java.util.List<com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel>)
                         type: INTERFACE call: java.util.List.size():int)
                          (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                          (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x001f: CONSTRUCTOR  (r5v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                          (r0v3 'list2' java.util.List<com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel> A[DONT_INLINE])
                         call: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5$invoke$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                          (wrap: r0.a : 0x002b: INVOKE  (r0v5 r0.a A[REMOVE]) = 
                          (-1091073711 int)
                          true
                          (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0024: CONSTRUCTOR  (r6v0 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                          (r0v3 'list2' java.util.List<com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel> A[DONT_INLINE])
                          (r1v0 'z13' boolean A[DONT_INLINE])
                          (r2v0 'i13' int A[DONT_INLINE])
                          (r3v0 'i14' int A[DONT_INLINE])
                         call: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5$invoke$$inlined$itemsIndexed$default$3.<init>(java.util.List, boolean, int, int):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                         type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5$invoke$$inlined$itemsIndexed$default$2, state: NOT_LOADED
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
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$LazyRow"
                        kotlin.jvm.internal.o.i(r8, r0)
                        boolean r0 = r1
                        if (r0 == 0) goto L11
                        com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel$a r0 = com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel.X
                        r1 = 5
                        java.util.List r0 = r0.a(r1)
                        goto L13
                    L11:
                        java.util.List<com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel> r0 = r2
                    L13:
                        boolean r1 = r1
                        int r2 = r3
                        int r3 = r4
                        int r4 = r0.size()
                        com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5$invoke$$inlined$itemsIndexed$default$2 r5 = new com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5$invoke$$inlined$itemsIndexed$default$2
                        r5.<init>(r0)
                        com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5$invoke$$inlined$itemsIndexed$default$3 r6 = new com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5$invoke$$inlined$itemsIndexed$default$3
                        r6.<init>(r0, r1, r2, r3)
                        r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                        r1 = 1
                        r0.a r0 = r0.b.c(r0, r1, r6)
                        r1 = 0
                        r8.f(r4, r1, r5, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$5.b(androidx.compose.foundation.lazy.LazyListScope):void");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                    b(lazyListScope);
                    return p.f75480a;
                }
            }, h11, 24960, 233);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$6
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i13) {
                        ForSaleRealtyKt.d(list, z11, pVar2, aVar2, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        private static final Integer e(n1<Integer> n1Var) {
            return n1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
            int i12;
            int i13;
            androidx.compose.runtime.a h11 = aVar.h(-1528420924);
            if ((i11 & 14) == 0) {
                if (h11.a(z11)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i12 = i13 | i11;
            } else {
                i12 = i11;
            }
            if ((i12 & 11) == 2 && h11.i()) {
                h11.L();
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1528420924, i12, -1, "com.forsale.app.features.categories.home.propertyhome.RealtyTag (ForSaleRealty.kt:108)");
                }
                TagsKt.a(com.forsale.ui.components.skeleton.a.a(androidx.compose.ui.c.f7566a, z11, c0.g.c(h.l(8)), 0L, 0L, h11, ((i12 << 3) & 112) | 6, 12), TagData.f42177a.d(), dk.a.f54291a.a(h11, dk.a.f54292b).c().i(h11, yj.d.f76453b), 0L, ComposableSingletons$ForSaleRealtyKt.f24528a.a(), h11, (TagData.f42178b << 3) | 24576, 8);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$RealtyTag$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i14) {
                        ForSaleRealtyKt.f(z11, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(final List<ForPropertyListingItemViewModel> list, final boolean z11, g00.p<? super Integer, ? super Integer, p> pVar, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11, final int i12) {
            final ForSaleRealtyKt$ShowForSaleRealty$1 forSaleRealtyKt$ShowForSaleRealty$1;
            androidx.compose.runtime.a h11 = aVar2.h(-1456189127);
            if ((i12 & 4) != 0) {
                forSaleRealtyKt$ShowForSaleRealty$1 = new g00.p<Integer, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ShowForSaleRealty$1
                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(Integer num, Integer num2) {
                        b(num.intValue(), num2.intValue());
                        return p.f75480a;
                    }

                    public final void b(int i13, int i14) {
                    }
                };
            } else {
                forSaleRealtyKt$ShowForSaleRealty$1 = pVar;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1456189127, i11, -1, "com.forsale.app.features.categories.home.propertyhome.ShowForSaleRealty (ForSaleRealty.kt:68)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            float f11 = 16;
            float f12 = 8;
            int i13 = i11 & 112;
            int i14 = i13 | 6;
            SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z11, c0.g.c(h.l(f12)), 0L, 0L, h11, i14, 12), h11, 0);
            androidx.compose.ui.c b11 = BackgroundKt.b(aVar3, dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null);
            h11.C(-483455358);
            a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(b11);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a14 = Updater.a(h11);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.f fVar = w.f.f74891a;
            SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z11, c0.g.c(h.l(f12)), 0L, 0L, h11, i14, 12), h11, 0);
            c(aVar, z11, h11, ((i11 >> 9) & 14) | i13);
            SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f12)), z11, c0.g.c(h.l(f12)), 0L, 0L, h11, i14, 12), h11, 0);
            d(list, z11, forSaleRealtyKt$ShowForSaleRealty$1, h11, i13 | 8 | (i11 & 896), 0);
            SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z11, c0.g.c(h.l(f12)), 0L, 0L, h11, i14, 12), h11, 0);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ShowForSaleRealty$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar4, int i15) {
                        ForSaleRealtyKt.g(list, z11, forSaleRealtyKt$ShowForSaleRealty$1, aVar, aVar4, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }
    }
