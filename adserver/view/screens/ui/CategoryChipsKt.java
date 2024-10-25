package com.forsale.adserver.view.screens.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.adserver.view.screens.offersScreen.OffersViewModel;
import com.forsale.designSystem.dividers.DividersKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.u;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import wz.p;
/* compiled from: CategoryChips.kt */
/* loaded from: classes2.dex */
public final class CategoryChipsKt {
    public static final void a(final OffersViewModel.c selectedCategoryType, final List<n9.a> offersCategoryChips, final l<? super Integer, p> onCategoryChanged, androidx.compose.runtime.a aVar, final int i11) {
        o.i(selectedCategoryType, "selectedCategoryType");
        o.i(offersCategoryChips, "offersCategoryChips");
        o.i(onCategoryChanged, "onCategoryChanged");
        androidx.compose.runtime.a h11 = aVar.h(-1402181359);
        if (c.I()) {
            c.U(-1402181359, i11, -1, "com.forsale.adserver.view.screens.ui.CategoryChips (CategoryChips.kt:26)");
        }
        LazyListState c11 = LazyListStateKt.c(0, 0, h11, 0, 3);
        Arrangement arrangement = Arrangement.f3698a;
        float f11 = 8;
        Arrangement.f o11 = arrangement.o(h.l(f11));
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 a11 = e.a(o11, b.f74009a.k(), h11, 6);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar2);
        if (!(h11.k() instanceof d)) {
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        LazyDslKt.b(null, c11, PaddingKt.c(h.l(16), 0.0f, 2, null), false, arrangement.o(h.l(f11)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(LazyListScope LazyRow) {
                o.i(LazyRow, "$this$LazyRow");
                final List<n9.a> list = offersCategoryChips;
                final OffersViewModel.c cVar = selectedCategoryType;
                final l<Integer, p> lVar = onCategoryChanged;
                final CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$1 categoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$1 = CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$1.f21491a;
                LazyRow.f(list.size(), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE  
                      (r7v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                      (wrap: int : 0x000d: INVOKE  (r4v0 int A[REMOVE]) = (r0v1 'list' java.util.List<n9.a>) type: INTERFACE call: java.util.List.size():int)
                      (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                      (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x0013: CONSTRUCTOR  (r5v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                      (r3v0 'categoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$1' com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$1 A[DONT_INLINE])
                      (r0v1 'list' java.util.List<n9.a> A[DONT_INLINE])
                     call: com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$3.<init>(g00.l, java.util.List):void type: CONSTRUCTOR)
                      (wrap: r0.a : 0x001f: INVOKE  (r0v3 r0.a A[REMOVE]) = 
                      (-632812321 int)
                      true
                      (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0018: CONSTRUCTOR  (r3v1 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                      (r0v1 'list' java.util.List<n9.a> A[DONT_INLINE])
                      (r1v0 'cVar' com.forsale.adserver.view.screens.offersScreen.OffersViewModel$c A[DONT_INLINE])
                      (r2v0 'lVar' g00.l<java.lang.Integer, wz.p> A[DONT_INLINE])
                     call: com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$4.<init>(java.util.List, com.forsale.adserver.view.screens.offersScreen.OffersViewModel$c, g00.l):void type: CONSTRUCTOR)
                     type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                     type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$3, state: NOT_LOADED
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
                    kotlin.jvm.internal.o.i(r7, r0)
                    java.util.List<n9.a> r0 = r1
                    com.forsale.adserver.view.screens.offersScreen.OffersViewModel$c r1 = r2
                    g00.l<java.lang.Integer, wz.p> r2 = r3
                    com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$1 r3 = com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$1.f21491a
                    int r4 = r0.size()
                    com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$3 r5 = new com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$3
                    r5.<init>(r3, r0)
                    com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$4 r3 = new com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1$invoke$$inlined$items$default$4
                    r3.<init>(r0, r1, r2)
                    r0 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                    r1 = 1
                    r0.a r0 = r0.b.c(r0, r1, r3)
                    r1 = 0
                    r7.f(r4, r1, r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$1$1.b(androidx.compose.foundation.lazy.LazyListScope):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                b(lazyListScope);
                return p.f75480a;
            }
        }, h11, 24960, 233);
        DividersKt.a(null, 0.0f, 0L, h11, 0, 7);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        u.e(selectedCategoryType, offersCategoryChips, new CategoryChipsKt$CategoryChips$2(selectedCategoryType, offersCategoryChips, c11, null), h11, (i11 & 14) | 576);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.screens.ui.CategoryChipsKt$CategoryChips$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    CategoryChipsKt.a(OffersViewModel.c.this, offersCategoryChips, onCategoryChanged, aVar3, v0.a(i11 | 1));
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
