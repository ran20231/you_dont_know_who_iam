package com.forsale.app.features.categories.home.maincategories.ui;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.g;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.utils.composeUtils.FixedGridViewKt;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.tags.TagData;
import com.forsale.designSystem.tags.TagsKt;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import r0.b;
import r5.g;
import v0.b;
import w.f;
import w.t;
import wz.p;
/* compiled from: VerticalListView.kt */
/* loaded from: classes2.dex */
public final class VerticalListViewKt {
    public static final void a(final List<CategoryEntity> verticals, final boolean z11, final l<? super CategoryEntity, p> lVar, a aVar, final int i11, final int i12) {
        o.i(verticals, "verticals");
        a h11 = aVar.h(-1933611179);
        if ((i12 & 4) != 0) {
            lVar = new l<CategoryEntity, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalList$1
                public final void b(CategoryEntity it2) {
                    o.i(it2, "it");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(CategoryEntity categoryEntity) {
                    b(categoryEntity);
                    return p.f75480a;
                }
            };
        }
        if (c.I()) {
            c.U(-1933611179, i11, -1, "com.forsale.app.features.categories.home.maincategories.ui.VerticalList (VerticalListView.kt:38)");
        }
        Boolean valueOf = Boolean.valueOf(z11);
        h11.C(1157296644);
        boolean T = h11.T(valueOf);
        Object D = h11.D();
        if (T || D == a.f7182a.a()) {
            if (z11) {
                D = d(12);
            } else {
                D = verticals;
            }
            h11.u(D);
        }
        h11.S();
        float f11 = 16;
        androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f11), h.l(8), h.l(f11), 0.0f, 8, null);
        float f12 = 12;
        FixedGridViewKt.a((List) D, 3, m11, h.l(f12), h.l(f12), b.b(h11, 1094647164, true, new r<w.c, CategoryEntity, a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            public final void b(w.c FixedGridView, CategoryEntity categoryEntity, a aVar2, int i13) {
                o.i(FixedGridView, "$this$FixedGridView");
                if (c.I()) {
                    c.U(1094647164, i13, -1, "com.forsale.app.features.categories.home.maincategories.ui.VerticalList.<anonymous> (VerticalListView.kt:50)");
                }
                final l<CategoryEntity, p> lVar2 = lVar;
                aVar2.C(1157296644);
                boolean T2 = aVar2.T(lVar2);
                Object D2 = aVar2.D();
                if (T2 || D2 == a.f7182a.a()) {
                    D2 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: CONSTRUCTOR  (r0v2 'D2' java.lang.Object) = (r3v2 'lVar2' g00.l<com.forsale.app.datalayer.database.CategoryEntity, wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalList$2$1$1.<init>(g00.l):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalList$2.b(w.c, com.forsale.app.datalayer.database.CategoryEntity, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalList$2$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 21 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$FixedGridView"
                        kotlin.jvm.internal.o.i(r3, r0)
                        boolean r3 = androidx.compose.runtime.c.I()
                        if (r3 == 0) goto L14
                        r3 = -1
                        java.lang.String r0 = "com.forsale.app.features.categories.home.maincategories.ui.VerticalList.<anonymous> (VerticalListView.kt:50)"
                        r1 = 1094647164(0x413efd7c, float:11.936886)
                        androidx.compose.runtime.c.U(r1, r6, r3, r0)
                    L14:
                        g00.l<com.forsale.app.datalayer.database.CategoryEntity, wz.p> r3 = r1
                        r6 = 1157296644(0x44faf204, float:2007.563)
                        r5.C(r6)
                        boolean r6 = r5.T(r3)
                        java.lang.Object r0 = r5.D()
                        if (r6 != 0) goto L2e
                        androidx.compose.runtime.a$a r6 = androidx.compose.runtime.a.f7182a
                        java.lang.Object r6 = r6.a()
                        if (r0 != r6) goto L36
                    L2e:
                        com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalList$2$1$1 r0 = new com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalList$2$1$1
                        r0.<init>(r3)
                        r5.u(r0)
                    L36:
                        r5.S()
                        g00.l r0 = (g00.l) r0
                        r3 = 8
                        r6 = 0
                        com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt.b(r4, r0, r5, r3, r6)
                        boolean r3 = androidx.compose.runtime.c.I()
                        if (r3 == 0) goto L4a
                        androidx.compose.runtime.c.T()
                    L4a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalList$2.b(w.c, com.forsale.app.datalayer.database.CategoryEntity, androidx.compose.runtime.a, int):void");
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(w.c cVar, CategoryEntity categoryEntity, a aVar2, Integer num) {
                    b(cVar, categoryEntity, aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, 224312, 0);
            if (c.I()) {
                c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                final l<? super CategoryEntity, p> lVar2 = lVar;
                l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalList$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i13) {
                        VerticalListViewKt.a(verticals, z11, lVar2, aVar2, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void b(final CategoryEntity categoryEntity, l<? super CategoryEntity, p> lVar, a aVar, final int i11, final int i12) {
            final VerticalListViewKt$VerticalListItem$1 verticalListViewKt$VerticalListItem$1;
            boolean z11;
            CategoryRuleSet.RuleSet ruleSet;
            CategoryRuleSet.Tag tag;
            a h11 = aVar.h(2086074209);
            if ((i12 & 2) != 0) {
                verticalListViewKt$VerticalListItem$1 = new l<CategoryEntity, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalListItem$1
                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(CategoryEntity categoryEntity2) {
                        b(categoryEntity2);
                        return p.f75480a;
                    }

                    public final void b(CategoryEntity categoryEntity2) {
                    }
                };
            } else {
                verticalListViewKt$VerticalListItem$1 = lVar;
            }
            if (c.I()) {
                c.U(2086074209, i11, -1, "com.forsale.app.features.categories.home.maincategories.ui.VerticalListItem (VerticalListView.kt:62)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            if (categoryEntity == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            float f11 = 8;
            androidx.compose.ui.c a11 = com.forsale.ui.components.skeleton.a.a(aVar2, z11, g.c(h.l(f11)), 0L, 0L, h11, 6, 12);
            h11.C(733328855);
            b.a aVar3 = v0.b.f74009a;
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(a11);
            if (!(h11.k() instanceof d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            a a14 = Updater.a(h11);
            Updater.c(a14, g11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            dk.a aVar4 = dk.a.f54291a;
            int i13 = dk.a.f54292b;
            yj.d e11 = aVar4.a(h11, i13).e();
            int i14 = yj.d.f76453b;
            final l<? super CategoryEntity, p> lVar2 = verticalListViewKt$VerticalListItem$1;
            SurfaceKt.a(new g00.a<p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalListItem$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    CategoryEntity categoryEntity2 = CategoryEntity.this;
                    if (categoryEntity2 != null) {
                        verticalListViewKt$VerticalListItem$1.invoke(categoryEntity2);
                    }
                }
            }, null, g.c(h.l(f11)), e11.h(h11, i14), 0L, null, 0.0f, null, null, false, null, null, r0.b.b(h11, -1394576014, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalListItem$2$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(a aVar5, int i15) {
                    String str;
                    if ((i15 & 11) == 2 && aVar5.i()) {
                        aVar5.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1394576014, i15, -1, "com.forsale.app.features.categories.home.maincategories.ui.VerticalListItem.<anonymous>.<anonymous> (VerticalListView.kt:71)");
                    }
                    c.a aVar6 = androidx.compose.ui.c.f7566a;
                    androidx.compose.ui.c h12 = SizeKt.h(PaddingKt.i(aVar6, h.l(8)), 0.0f, 1, null);
                    Arrangement.f o11 = Arrangement.f3698a.o(h.l(4));
                    CategoryEntity categoryEntity2 = CategoryEntity.this;
                    aVar5.C(-483455358);
                    a0 a15 = androidx.compose.foundation.layout.e.a(o11, v0.b.f74009a.k(), aVar5, 6);
                    aVar5.C(-1323940314);
                    int a16 = e.a(aVar5, 0);
                    k s12 = aVar5.s();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a17 = companion2.a();
                    q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(h12);
                    if (!(aVar5.k() instanceof d)) {
                        e.c();
                    }
                    aVar5.I();
                    if (aVar5.f()) {
                        aVar5.y(a17);
                    } else {
                        aVar5.t();
                    }
                    a a18 = Updater.a(aVar5);
                    Updater.c(a18, a15, companion2.e());
                    Updater.c(a18, s12, companion2.g());
                    g00.p<ComposeUiNode, Integer, p> b12 = companion2.b();
                    if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                        a18.u(Integer.valueOf(a16));
                        a18.p(Integer.valueOf(a16), b12);
                    }
                    c12.invoke(e1.a(e1.b(aVar5)), aVar5, 0);
                    aVar5.C(2058660585);
                    f fVar = f.f74891a;
                    g.a aVar7 = new g.a((Context) aVar5.q(AndroidCompositionLocals_androidKt.g()));
                    if (categoryEntity2 != null) {
                        str = categoryEntity2.getFeaturedImage();
                    } else {
                        str = null;
                    }
                    ImageKt.a(h5.d.a(aVar7.b(str).p(s5.g.f68399d).d(l8.e.f62280a).e(l8.e.f62280a).a(), null, null, null, 0, aVar5, 8, 30), null, AspectRatioKt.b(SizeKt.h(aVar6, 0.0f, 1, null), 1.7777778f, false, 2, null), null, androidx.compose.ui.layout.c.f8188a.b(), 0.0f, null, aVar5, 25008, 104);
                    String str2 = (categoryEntity2 == null || (str2 = categoryEntity2.getName()) == null) ? "" : "";
                    androidx.compose.ui.c h13 = SizeKt.h(aVar6, 0.0f, 1, null);
                    dk.a aVar8 = dk.a.f54291a;
                    int i16 = dk.a.f54292b;
                    TextKt.a(str2, h13, b2.f.f16081b.a(), 0, false, 1, 0, null, aVar8.c(aVar5, i16).c(), aVar8.a(aVar5, i16).e().m(aVar5, yj.d.f76453b), 0, aVar5, 196656, 0, 1240);
                    aVar5.S();
                    aVar5.w();
                    aVar5.S();
                    aVar5.S();
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            }), h11, 0, 384, 4082);
            final CategoryRuleSet.Tag tag2 = null;
            if (categoryEntity != null && (ruleSet = categoryEntity.getRuleSet()) != null && (tag = ruleSet.getTag()) != null && tag.getEnabled()) {
                tag2 = tag;
            }
            h11.C(997100356);
            if (tag2 != null) {
                TagsKt.a(boxScopeInstance.e(aVar2, aVar3.o()), TagData.f42177a.c(), aVar4.a(h11, i13).c().i(h11, i14), aVar4.a(h11, i13).g().c(h11, i14), r0.b.b(h11, 462462435, true, new q<t, a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalListItem$2$4$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(3);
                    }

                    public final void b(t Tag, a aVar5, int i15) {
                        o.i(Tag, "$this$Tag");
                        if ((i15 & 81) == 16 && aVar5.i()) {
                            aVar5.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(462462435, i15, -1, "com.forsale.app.features.categories.home.maincategories.ui.VerticalListItem.<anonymous>.<anonymous>.<anonymous> (VerticalListView.kt:109)");
                        }
                        TextKt.a(CategoryRuleSet.Tag.this.getTagLabel().getLabel(), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar5, 0, 0, 2046);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(t tVar, a aVar5, Integer num) {
                        b(tVar, aVar5, num.intValue());
                        return p.f75480a;
                    }
                }), h11, (TagData.f42178b << 3) | 24576, 0);
            }
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt$VerticalListItem$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar5, int i15) {
                        VerticalListViewKt.b(CategoryEntity.this, lVar2, aVar5, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                        b(aVar5, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List<CategoryEntity> d(int i11) {
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(null);
            }
            return arrayList;
        }
    }
