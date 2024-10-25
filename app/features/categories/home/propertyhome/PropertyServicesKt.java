package com.forsale.app.features.categories.home.propertyhome;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import wz.p;
/* compiled from: PropertyServices.kt */
/* loaded from: classes2.dex */
public final class PropertyServicesKt {
    public static final void a(final boolean z11, final SectionState propertyServiceResponse, final l<? super CategoryEntity, p> onItemClickCallback, androidx.compose.runtime.a aVar, final int i11) {
        final int i12;
        int i13;
        int i14;
        int i15;
        o.i(propertyServiceResponse, "propertyServiceResponse");
        o.i(onItemClickCallback, "onItemClickCallback");
        androidx.compose.runtime.a h11 = aVar.h(-1617505244);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(propertyServiceResponse)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onItemClickCallback)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1617505244, i12, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyServicesComponent (PropertyServices.kt:33)");
            }
            propertyServiceResponse.a(r0.b.b(h11, 608909402, true, new q<SectionState.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesComponent$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(SectionState.e result, androidx.compose.runtime.a aVar2, int i16) {
                    o.i(result, "result");
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(608909402, i16, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyServicesComponent.<anonymous> (PropertyServices.kt:35)");
                    }
                    List<?> d11 = result.d();
                    o.g(d11, "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.datalayer.database.CategoryEntity>");
                    boolean z12 = z11;
                    Object valueOf = Boolean.valueOf(z12);
                    final l<CategoryEntity, p> lVar = onItemClickCallback;
                    final boolean z13 = z11;
                    aVar2.C(511388516);
                    boolean T = aVar2.T(valueOf) | aVar2.T(lVar);
                    Object D = aVar2.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: CONSTRUCTOR  (r3v3 'D' java.lang.Object) = 
                              (r2v0 'z13' boolean A[DONT_INLINE])
                              (r1v0 'lVar' g00.l<com.forsale.app.datalayer.database.CategoryEntity, wz.p> A[DONT_INLINE])
                             call: com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesComponent$1$1$1.<init>(boolean, g00.l):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesComponent$1.b(com.forsale.app.features.categories.home.propertyhome.models.SectionState$e, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesComponent$1$1$1, state: NOT_LOADED
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
                            kotlin.jvm.internal.o.i(r5, r0)
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L14
                            r0 = -1
                            java.lang.String r1 = "com.forsale.app.features.categories.home.propertyhome.PropertyServicesComponent.<anonymous> (PropertyServices.kt:35)"
                            r2 = 608909402(0x244b385a, float:4.406634E-17)
                            androidx.compose.runtime.c.U(r2, r7, r0, r1)
                        L14:
                            java.util.List r5 = r5.d()
                            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.datalayer.database.CategoryEntity>"
                            kotlin.jvm.internal.o.g(r5, r7)
                            boolean r7 = r1
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
                            g00.l<com.forsale.app.datalayer.database.CategoryEntity, wz.p> r1 = r2
                            boolean r2 = r1
                            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                            r6.C(r3)
                            boolean r0 = r6.T(r0)
                            boolean r3 = r6.T(r1)
                            r0 = r0 | r3
                            java.lang.Object r3 = r6.D()
                            if (r0 != 0) goto L44
                            androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r0 = r0.a()
                            if (r3 != r0) goto L4c
                        L44:
                            com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesComponent$1$1$1 r3 = new com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesComponent$1$1$1
                            r3.<init>(r2, r1)
                            r6.u(r3)
                        L4c:
                            r6.S()
                            g00.l r3 = (g00.l) r3
                            int r0 = r3
                            int r0 = r0 << 3
                            r0 = r0 & 112(0x70, float:1.57E-43)
                            r0 = r0 | 8
                            com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt.e(r5, r7, r3, r6, r0)
                            boolean r5 = androidx.compose.runtime.c.I()
                            if (r5 == 0) goto L65
                            androidx.compose.runtime.c.T()
                        L65:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesComponent$1.b(com.forsale.app.features.categories.home.propertyhome.models.SectionState$e, androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(SectionState.e eVar, androidx.compose.runtime.a aVar2, Integer num) {
                        b(eVar, aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), h11, (i12 & 112) | 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesComponent$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i16) {
                        PropertyServicesKt.a(z11, propertyServiceResponse, onItemClickCallback, aVar2, v0.a(i11 | 1));
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
        public static final void b(final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
            final int i12;
            int i13;
            androidx.compose.runtime.a h11 = aVar.h(971412402);
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
                    androidx.compose.runtime.c.U(971412402, i12, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyServicesTitle (PropertyServices.kt:61)");
                }
                SectionTitleKt.a(PaddingKt.k(androidx.compose.ui.c.f7566a, h.l(16), 0.0f, 2, null), null, r0.b.b(h11, 1884850356, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesTitle$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i14) {
                        if ((i14 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1884850356, i14, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyServicesTitle.<anonymous> (PropertyServices.kt:64)");
                        }
                        TextKt.a(g.b(y0.f70593nd, aVar2, 0), com.forsale.ui.components.skeleton.a.a(androidx.compose.ui.c.f7566a, z11, c0.g.c(h.l(8)), 0L, 0L, aVar2, ((i12 << 3) & 112) | 6, 12), 0, 0, false, 0, 0, null, null, 0L, 0, aVar2, 0, 0, 2044);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), null, null, null, h11, 390, 58);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$PropertyServicesTitle$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i14) {
                        PropertyServicesKt.b(z11, aVar2, v0.a(i11 | 1));
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
        public static final void c(final List<CategoryEntity> list, final boolean z11, final l<? super CategoryEntity, p> lVar, androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a h11 = aVar.h(1463590508);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1463590508, i11, -1, "com.forsale.app.features.categories.home.propertyhome.ShowPropertyServices (PropertyServices.kt:45)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c b11 = BackgroundKt.b(aVar2, dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, yj.d.f76453b), null, 2, null);
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
            float f11 = 16;
            float f12 = 8;
            int i12 = i11 & 112;
            int i13 = i12 | 6;
            SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar2, h.l(f11)), z11, c0.g.c(h.l(f12)), 0L, 0L, h11, i13, 12), h11, 0);
            b(z11, h11, (i11 >> 3) & 14);
            SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar2, h.l(f12)), z11, c0.g.c(h.l(f12)), 0L, 0L, h11, i13, 12), h11, 0);
            SubCategoriesContainerKt.b(list, z11, lVar, h11, i12 | 8 | (i11 & 896));
            SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar2, h.l(f11)), z11, c0.g.c(h.l(f12)), 0L, 0L, h11, i13, 12), h11, 0);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyServicesKt$ShowPropertyServices$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i14) {
                        PropertyServicesKt.c(list, z11, lVar, aVar3, v0.a(i11 | 1));
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
