package com.forsale.app.features.categories.listings.category.view;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import com.forsale.app.features.search.MatchedCategoriesKt;
import com.google.logging.type.LogSeverity;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import e2.h;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import r.g;
import r.h0;
import r0.b;
import w.f;
import wz.p;
/* compiled from: SearchBreadcrumbs.kt */
/* loaded from: classes2.dex */
public final class SearchBreadcrumbsKt {
    public static final void a(final boolean z11, final CategoryListingsViewModel categoryListingsViewModel, a aVar, final int i11) {
        o.i(categoryListingsViewModel, "categoryListingsViewModel");
        a h11 = aVar.h(-991454680);
        if (c.I()) {
            c.U(-991454680, i11, -1, "com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbs (SearchBreadcrumbs.kt:24)");
        }
        final n1 b11 = z.b(categoryListingsViewModel.G2(), null, h11, 8, 1);
        if (!b(b11).d().isEmpty()) {
            AnimatedVisibilityKt.d(z11, null, EnterExitTransitionKt.o(g.k(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, 0, null, 6, null), 0.0f, 2, null).c(EnterExitTransitionKt.m(g.k(LogSeverity.ERROR_VALUE, 0, h0.e(), 2, null), null, false, null, 14, null)), EnterExitTransitionKt.q(g.k(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, 0, null, 6, null), 0.0f, 2, null).c(EnterExitTransitionKt.y(g.k(LogSeverity.ERROR_VALUE, 0, h0.e(), 2, null), null, false, null, 14, null)), null, b.b(h11, -178050725, true, new q<q.c, a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt$SearchBreadcrumbs$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(q.c AnimatedVisibility, a aVar2, int i12) {
                    Pair b12;
                    o.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (c.I()) {
                        c.U(-178050725, i12, -1, "com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbs.<anonymous> (SearchBreadcrumbs.kt:42)");
                    }
                    androidx.compose.ui.c h12 = SizeKt.h(PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, 0.0f, 0.0f, h.l(16), 7, null), 0.0f, 1, null);
                    n1<Pair<String, List<CategoryEntity>>> n1Var = b11;
                    final CategoryListingsViewModel categoryListingsViewModel2 = categoryListingsViewModel;
                    aVar2.C(-483455358);
                    a0 a11 = e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar2, 0);
                    aVar2.C(-1323940314);
                    int a12 = j0.e.a(aVar2, 0);
                    k s11 = aVar2.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a13 = companion.a();
                    q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(h12);
                    if (!(aVar2.k() instanceof d)) {
                        j0.e.c();
                    }
                    aVar2.I();
                    if (aVar2.f()) {
                        aVar2.y(a13);
                    } else {
                        aVar2.t();
                    }
                    a a14 = Updater.a(aVar2);
                    Updater.c(a14, a11, companion.e());
                    Updater.c(a14, s11, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
                    if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                        a14.u(Integer.valueOf(a12));
                        a14.p(Integer.valueOf(a12), b13);
                    }
                    c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                    aVar2.C(2058660585);
                    f fVar = f.f74891a;
                    b12 = SearchBreadcrumbsKt.b(n1Var);
                    MatchedCategoriesKt.a((List) b12.d(), "", false, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e1: INVOKE  
                          (wrap: java.util.List : 0x00d3: CHECK_CAST (r1v10 java.util.List A[REMOVE]) = (java.util.List) (wrap: java.lang.Object : 0x00ce: INVOKE  (r10v10 java.lang.Object A[REMOVE]) = (r10v9 'b12' kotlin.Pair) type: VIRTUAL call: kotlin.Pair.d():java.lang.Object))
                          ("")
                          false
                          (wrap: g00.l<com.forsale.app.datalayer.database.CategoryEntity, wz.p> : 0x00da: CONSTRUCTOR  (r4v4 g00.l<com.forsale.app.datalayer.database.CategoryEntity, wz.p> A[REMOVE]) = 
                          (r0v2 'categoryListingsViewModel2' com.forsale.app.features.categories.listings.category.CategoryListingsViewModel A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt$SearchBreadcrumbs$1$1$1.<init>(com.forsale.app.features.categories.listings.category.CategoryListingsViewModel):void type: CONSTRUCTOR)
                          (r11v0 'aVar2' androidx.compose.runtime.a)
                          (440 int)
                          (0 int)
                         type: STATIC call: com.forsale.app.features.search.MatchedCategoriesKt.a(java.util.List, java.lang.String, boolean, g00.l, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt$SearchBreadcrumbs$1.b(q.c, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt$SearchBreadcrumbs$1$1$1, state: NOT_LOADED
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
                        java.lang.String r0 = "$this$AnimatedVisibility"
                        kotlin.jvm.internal.o.i(r10, r0)
                        boolean r10 = androidx.compose.runtime.c.I()
                        if (r10 == 0) goto L14
                        r10 = -1
                        java.lang.String r0 = "com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbs.<anonymous> (SearchBreadcrumbs.kt:42)"
                        r1 = -178050725(0xfffffffff563295b, float:-2.8796147E32)
                        androidx.compose.runtime.c.U(r1, r12, r10, r0)
                    L14:
                        androidx.compose.ui.c$a r2 = androidx.compose.ui.c.f7566a
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        r10 = 16
                        float r10 = (float) r10
                        float r6 = e2.h.l(r10)
                        r7 = 7
                        r8 = 0
                        androidx.compose.ui.c r10 = androidx.compose.foundation.layout.PaddingKt.m(r2, r3, r4, r5, r6, r7, r8)
                        r12 = 1
                        r0 = 0
                        r1 = 0
                        androidx.compose.ui.c r10 = androidx.compose.foundation.layout.SizeKt.h(r10, r1, r12, r0)
                        j0.n1<kotlin.Pair<java.lang.String, java.util.List<com.forsale.app.datalayer.database.CategoryEntity>>> r12 = r1
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r0 = r2
                        r1 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
                        r11.C(r1)
                        androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f3698a
                        androidx.compose.foundation.layout.Arrangement$m r1 = r1.h()
                        v0.b$a r2 = v0.b.f74009a
                        v0.b$b r2 = r2.k()
                        r3 = 0
                        androidx.compose.ui.layout.a0 r1 = androidx.compose.foundation.layout.e.a(r1, r2, r11, r3)
                        r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                        r11.C(r2)
                        int r2 = j0.e.a(r11, r3)
                        j0.k r4 = r11.s()
                        androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f8256m
                        g00.a r6 = r5.a()
                        g00.q r10 = androidx.compose.ui.layout.LayoutKt.c(r10)
                        j0.d r7 = r11.k()
                        boolean r7 = r7 instanceof j0.d
                        if (r7 != 0) goto L6b
                        j0.e.c()
                    L6b:
                        r11.I()
                        boolean r7 = r11.f()
                        if (r7 == 0) goto L78
                        r11.y(r6)
                        goto L7b
                    L78:
                        r11.t()
                    L7b:
                        androidx.compose.runtime.a r6 = androidx.compose.runtime.Updater.a(r11)
                        g00.p r7 = r5.e()
                        androidx.compose.runtime.Updater.c(r6, r1, r7)
                        g00.p r1 = r5.g()
                        androidx.compose.runtime.Updater.c(r6, r4, r1)
                        g00.p r1 = r5.b()
                        boolean r4 = r6.f()
                        if (r4 != 0) goto La5
                        java.lang.Object r4 = r6.D()
                        java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                        boolean r4 = kotlin.jvm.internal.o.d(r4, r5)
                        if (r4 != 0) goto Lb3
                    La5:
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                        r6.u(r4)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        r6.p(r2, r1)
                    Lb3:
                        androidx.compose.runtime.a r1 = j0.e1.b(r11)
                        j0.e1 r1 = j0.e1.a(r1)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                        r10.invoke(r1, r11, r2)
                        r10 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                        r11.C(r10)
                        w.f r10 = w.f.f74891a
                        kotlin.Pair r10 = com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt.c(r12)
                        java.lang.Object r10 = r10.d()
                        r1 = r10
                        java.util.List r1 = (java.util.List) r1
                        java.lang.String r2 = ""
                        r3 = 0
                        com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt$SearchBreadcrumbs$1$1$1 r4 = new com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt$SearchBreadcrumbs$1$1$1
                        r4.<init>(r0)
                        r6 = 440(0x1b8, float:6.17E-43)
                        r7 = 0
                        r5 = r11
                        com.forsale.app.features.search.MatchedCategoriesKt.a(r1, r2, r3, r4, r5, r6, r7)
                        r11.S()
                        r11.w()
                        r11.S()
                        r11.S()
                        boolean r10 = androidx.compose.runtime.c.I()
                        if (r10 == 0) goto Lf9
                        androidx.compose.runtime.c.T()
                    Lf9:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt$SearchBreadcrumbs$1.b(q.c, androidx.compose.runtime.a, int):void");
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(q.c cVar, a aVar2, Integer num) {
                    b(cVar, aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, (i11 & 14) | 196608, 18);
        }
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt$SearchBreadcrumbs$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    SearchBreadcrumbsKt.a(z11, categoryListingsViewModel, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<String, List<CategoryEntity>> b(n1<? extends Pair<String, ? extends List<CategoryEntity>>> n1Var) {
        return (Pair) n1Var.getValue();
    }
}
