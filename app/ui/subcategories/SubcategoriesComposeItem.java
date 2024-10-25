package com.forsale.app.ui.subcategories;

import aa.se;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.s;
import bi.a;
import com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainerKt;
import com.forsale.app.utils.LifecycleAware$ViewHolder;
import com.forsale.designSystem.theme.ThemeKt;
import e2.h;
import g00.q;
import j0.e1;
import j0.k;
import java.util.List;
import kotlin.jvm.internal.o;
import mi.b;
import t9.t0;
import w.f;
import wz.p;
import yj.d;
/* compiled from: SubcategoriesComposeItem.kt */
/* loaded from: classes3.dex */
public final class SubcategoriesComposeItem extends a<ViewHolder, p, b> {

    /* renamed from: g  reason: collision with root package name */
    private final b f39507g;

    /* renamed from: h  reason: collision with root package name */
    private final s f39508h;

    /* renamed from: i  reason: collision with root package name */
    private final int f39509i;

    /* compiled from: SubcategoriesComposeItem.kt */
    /* loaded from: classes3.dex */
    public static final class ViewHolder extends LifecycleAware$ViewHolder<SubcategoriesComposeItem, se> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(se binding) {
            super(binding);
            o.i(binding, "binding");
        }

        @Override // com.forsale.app.utils.LifecycleAware$ViewHolder, kr.b.c
        /* renamed from: i */
        public void b(final SubcategoriesComposeItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            super.b(item, payloads);
            final se f11 = f();
            f11.U(item.f39508h);
            f11.h0(item.f39507g);
            f().O.setContent(r0.b.c(737251261, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.subcategories.SubcategoriesComposeItem$ViewHolder$bindView$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar, int i11) {
                    if ((i11 & 11) == 2 && aVar.i()) {
                        aVar.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(737251261, i11, -1, "com.forsale.app.ui.subcategories.SubcategoriesComposeItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous> (SubcategoriesComposeItem.kt:43)");
                    }
                    final SubcategoriesComposeItem subcategoriesComposeItem = item;
                    ThemeKt.a(null, null, r0.b.b(aVar, 193417364, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.subcategories.SubcategoriesComposeItem$ViewHolder$bindView$1$1$1.1
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(193417364, i12, -1, "com.forsale.app.ui.subcategories.SubcategoriesComposeItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubcategoriesComposeItem.kt:44)");
                            }
                            c.a aVar3 = androidx.compose.ui.c.f7566a;
                            androidx.compose.ui.c b11 = BackgroundKt.b(aVar3, dk.a.f54291a.a(aVar2, dk.a.f54292b).g().c(aVar2, d.f76453b), null, 2, null);
                            final SubcategoriesComposeItem subcategoriesComposeItem2 = SubcategoriesComposeItem.this;
                            aVar2.C(-483455358);
                            a0 a11 = e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar2, 0);
                            aVar2.C(-1323940314);
                            int a12 = j0.e.a(aVar2, 0);
                            k s11 = aVar2.s();
                            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                            g00.a<ComposeUiNode> a13 = companion.a();
                            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(b11);
                            if (!(aVar2.k() instanceof j0.d)) {
                                j0.e.c();
                            }
                            aVar2.I();
                            if (aVar2.f()) {
                                aVar2.y(a13);
                            } else {
                                aVar2.t();
                            }
                            androidx.compose.runtime.a a14 = Updater.a(aVar2);
                            Updater.c(a14, a11, companion.e());
                            Updater.c(a14, s11, companion.g());
                            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                                a14.u(Integer.valueOf(a12));
                                a14.p(Integer.valueOf(a12), b12);
                            }
                            c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                            aVar2.C(2058660585);
                            f fVar = f.f74891a;
                            float f12 = 16;
                            SpacerKt.a(SizeKt.i(aVar3, h.l(f12)), aVar2, 6);
                            SubCategoriesContainerKt.b((List) z.b(subcategoriesComposeItem2.f39507g.a().a(), null, aVar2, 8, 1).getValue(), ((Boolean) z.b(subcategoriesComposeItem2.f39507g.a().b(), null, aVar2, 8, 1).getValue()).booleanValue(), 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011f: INVOKE  
                                  (wrap: java.util.List : 0x00fe: CHECK_CAST (r2v15 java.util.List A[REMOVE]) = (java.util.List) (wrap: java.lang.Object : 0x00fa: INVOKE  (r2v14 java.lang.Object A[REMOVE]) = 
                                  (wrap: j0.n1 : 0x00f6: INVOKE  (r2v13 j0.n1 A[REMOVE]) = 
                                  (wrap: kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.forsale.app.datalayer.database.CategoryEntity>> : 0x00ee: INVOKE  (r2v12 kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.forsale.app.datalayer.database.CategoryEntity>> A[REMOVE]) = 
                                  (wrap: mi.a : 0x00ea: INVOKE  (r2v11 mi.a A[REMOVE]) = 
                                  (wrap: mi.b : 0x00e6: IGET  (r2v10 mi.b A[REMOVE]) = (r1v3 'subcategoriesComposeItem2' com.forsale.app.ui.subcategories.SubcategoriesComposeItem) com.forsale.app.ui.subcategories.SubcategoriesComposeItem.g mi.b)
                                 type: VIRTUAL call: mi.b.a():mi.a)
                                 type: VIRTUAL call: mi.a.a():kotlinx.coroutines.flow.MutableStateFlow)
                                  (null kotlin.coroutines.CoroutineContext)
                                  (r10v0 'aVar2' androidx.compose.runtime.a)
                                  (8 int)
                                  (1 int)
                                 type: STATIC call: androidx.compose.runtime.z.b(kotlinx.coroutines.flow.StateFlow, kotlin.coroutines.CoroutineContext, androidx.compose.runtime.a, int, int):j0.n1)
                                 type: INTERFACE call: j0.n1.getValue():java.lang.Object))
                                  (wrap: boolean : 0x0116: INVOKE  (r4v6 boolean A[REMOVE]) = 
                                  (wrap: java.lang.Boolean : 0x0114: CHECK_CAST (r4v5 java.lang.Boolean A[REMOVE]) = (java.lang.Boolean) (wrap: java.lang.Object : 0x0110: INVOKE  (r4v4 java.lang.Object A[REMOVE]) = 
                                  (wrap: j0.n1 : 0x010c: INVOKE  (r4v3 j0.n1 A[REMOVE]) = 
                                  (wrap: kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> : 0x0108: INVOKE  (r7v5 kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> A[REMOVE]) = 
                                  (wrap: mi.a : 0x0104: INVOKE  (r7v4 mi.a A[REMOVE]) = 
                                  (wrap: mi.b : 0x0100: IGET  (r7v3 mi.b A[REMOVE]) = (r1v3 'subcategoriesComposeItem2' com.forsale.app.ui.subcategories.SubcategoriesComposeItem) com.forsale.app.ui.subcategories.SubcategoriesComposeItem.g mi.b)
                                 type: VIRTUAL call: mi.b.a():mi.a)
                                 type: VIRTUAL call: mi.a.b():kotlinx.coroutines.flow.MutableStateFlow)
                                  (null kotlin.coroutines.CoroutineContext)
                                  (r10v0 'aVar2' androidx.compose.runtime.a)
                                  (8 int)
                                  (1 int)
                                 type: STATIC call: androidx.compose.runtime.z.b(kotlinx.coroutines.flow.StateFlow, kotlin.coroutines.CoroutineContext, androidx.compose.runtime.a, int, int):j0.n1)
                                 type: INTERFACE call: j0.n1.getValue():java.lang.Object))
                                 type: VIRTUAL call: java.lang.Boolean.booleanValue():boolean)
                                  (wrap: g00.l<com.forsale.app.datalayer.database.CategoryEntity, wz.p> : 0x011c: CONSTRUCTOR  (r6v3 g00.l<com.forsale.app.datalayer.database.CategoryEntity, wz.p> A[REMOVE]) = (r1v3 'subcategoriesComposeItem2' com.forsale.app.ui.subcategories.SubcategoriesComposeItem A[DONT_INLINE]) call: com.forsale.app.ui.subcategories.SubcategoriesComposeItem$ViewHolder$bindView$1$1$1$1$1$1.<init>(com.forsale.app.ui.subcategories.SubcategoriesComposeItem):void type: CONSTRUCTOR)
                                  (r10v0 'aVar2' androidx.compose.runtime.a)
                                  (8 int)
                                 type: STATIC call: com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainerKt.b(java.util.List, boolean, g00.l, androidx.compose.runtime.a, int):void in method: com.forsale.app.ui.subcategories.SubcategoriesComposeItem$ViewHolder$bindView$1$1$1.1.b(androidx.compose.runtime.a, int):void, file: classes3.dex
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
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.subcategories.SubcategoriesComposeItem$ViewHolder$bindView$1$1$1$1$1$1, state: NOT_LOADED
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
                                	... 19 more
                                */
                            /*
                                Method dump skipped, instructions count: 323
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.subcategories.SubcategoriesComposeItem$ViewHolder$bindView$1$1$1.AnonymousClass1.b(androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    }), aVar, 384, 3);
                    se.this.u();
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcategoriesComposeItem(b viewModel, s lo2) {
        super(viewModel, lo2);
        o.i(viewModel, "viewModel");
        o.i(lo2, "lo");
        this.f39507g = viewModel;
        this.f39508h = lo2;
        this.f39509i = t0.f70291r3;
    }

    @Override // pr.a
    public int t() {
        return this.f39509i;
    }

    @Override // pr.a
    /* renamed from: x */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        se f02 = se.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }
}
