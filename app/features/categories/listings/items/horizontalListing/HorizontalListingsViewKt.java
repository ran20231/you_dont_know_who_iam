package com.forsale.app.features.categories.listings.items.horizontalListing;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LiveData;
import c0.g;
import coil.compose.AsyncImagePainter;
import com.forsale.app.features.categories.listings.items.horizontalListing.a;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.core.util.ContextExtensionKt;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.layouts.PosterKt;
import e2.h;
import g00.l;
import g00.p;
import j0.d1;
import j0.k0;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import qc.b;
import sj.d;
import t9.y0;
import y.a;
/* compiled from: HorizontalListingsView.kt */
/* loaded from: classes2.dex */
public final class HorizontalListingsViewKt {

    /* renamed from: a  reason: collision with root package name */
    private static final float f30752a = h.l(159);

    public static final void a(final HorizontalListingsItemViewModel horizontalListingsItemViewModel, androidx.compose.runtime.a aVar, final int i11) {
        List n11;
        final a.C0336a c0336a;
        o.i(horizontalListingsItemViewModel, "horizontalListingsItemViewModel");
        androidx.compose.runtime.a h11 = aVar.h(136723907);
        if (c.I()) {
            c.U(136723907, i11, -1, "com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListSection (HorizontalListingsView.kt:40)");
        }
        final Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
        LiveData<List<b<?>>> i12 = horizontalListingsItemViewModel.i();
        n11 = r.n();
        final n1 b11 = LiveDataAdapterKt.b(i12, n11, h11, 56);
        a h12 = horizontalListingsItemViewModel.h();
        if (h12 instanceof a.C0336a) {
            c0336a = (a.C0336a) h12;
        } else {
            c0336a = null;
        }
        if (b(b11).isEmpty()) {
            if (c.I()) {
                c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i13) {
                        HorizontalListingsViewKt.a(HorizontalListingsItemViewModel.this, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
                return;
            }
            return;
        }
        h11.C(-492369756);
        Object D = h11.D();
        if (D == androidx.compose.runtime.a.f7182a.a()) {
            D = Integer.valueOf(horizontalListingsItemViewModel.k());
            h11.u(D);
        }
        h11.S();
        int intValue = ((Number) D).intValue();
        androidx.compose.ui.c k11 = PaddingKt.k(SizeKt.i(androidx.compose.ui.c.f7566a, k(horizontalListingsItemViewModel.k(), 0.0f, 2, null)), 0.0f, h.l(6), 1, null);
        w.o c11 = PaddingKt.c(h.l(16), 0.0f, 2, null);
        a.C0936a c0936a = new a.C0936a(intValue);
        Arrangement arrangement = Arrangement.f3698a;
        float f11 = 12;
        LazyGridDslKt.a(c0936a, k11, null, c11, false, arrangement.o(h.l(f11)), arrangement.o(h.l(f11)), null, false, new l<LazyGridScope, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(LazyGridScope LazyHorizontalGrid) {
                final List b12;
                o.i(LazyHorizontalGrid, "$this$LazyHorizontalGrid");
                b12 = HorizontalListingsViewKt.b(b11);
                final Context context2 = context;
                final a.C0336a c0336a2 = c0336a;
                final HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$1 horizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$1 = HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$1.f30753a;
                LazyHorizontalGrid.k(b12.size(), null, null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002a: INVOKE  
                      (r11v0 'LazyHorizontalGrid' androidx.compose.foundation.lazy.grid.LazyGridScope)
                      (wrap: int : 0x0011: INVOKE  (r5v0 int A[REMOVE]) = (r0v2 'b12' java.util.List) type: INTERFACE call: java.util.List.size():int)
                      (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                      (null g00.p<? super y.m, ? super java.lang.Integer, y.b>)
                      (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x0019: CONSTRUCTOR  (r8v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                      (r3v0 'horizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$1' com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$1 A[DONT_INLINE])
                      (r0v2 'b12' java.util.List A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$4.<init>(g00.l, java.util.List):void type: CONSTRUCTOR)
                      (wrap: r0.a : 0x0025: INVOKE  (r9v0 r0.a A[REMOVE]) = 
                      (699646206 int)
                      true
                      (wrap: g00.r<y.k, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x001e: CONSTRUCTOR  (r3v1 g00.r<y.k, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                      (r0v2 'b12' java.util.List A[DONT_INLINE])
                      (r1v0 'context2' android.content.Context A[DONT_INLINE])
                      (r2v0 'c0336a2' com.forsale.app.features.categories.listings.items.horizontalListing.a$a A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$5.<init>(java.util.List, android.content.Context, com.forsale.app.features.categories.listings.items.horizontalListing.a$a):void type: CONSTRUCTOR)
                     type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                     type: INTERFACE call: androidx.compose.foundation.lazy.grid.LazyGridScope.k(int, g00.l, g00.p, g00.l, g00.r):void in method: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2.b(androidx.compose.foundation.lazy.grid.LazyGridScope):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$4, state: NOT_LOADED
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
                    java.lang.String r0 = "$this$LazyHorizontalGrid"
                    kotlin.jvm.internal.o.i(r11, r0)
                    j0.n1<java.util.List<qc.b<?>>> r0 = r1
                    java.util.List r0 = com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt.f(r0)
                    android.content.Context r1 = r2
                    com.forsale.app.features.categories.listings.items.horizontalListing.a$a r2 = r3
                    com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$1 r3 = com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$1.f30753a
                    int r5 = r0.size()
                    r6 = 0
                    r7 = 0
                    com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$4 r8 = new com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$4
                    r8.<init>(r3, r0)
                    com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$5 r3 = new com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2$invoke$$inlined$items$default$5
                    r3.<init>(r0, r1, r2)
                    r0 = 699646206(0x29b3c0fe, float:7.982676E-14)
                    r1 = 1
                    r0.a r9 = r0.b.c(r0, r1, r3)
                    r4 = r11
                    r4.k(r5, r6, r7, r8, r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$2.b(androidx.compose.foundation.lazy.grid.LazyGridScope):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(LazyGridScope lazyGridScope) {
                b(lazyGridScope);
                return wz.p.f75480a;
            }
        }, h11, 1772544, 404);
        if (c.I()) {
            c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$HorizontalListSection$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    HorizontalListingsViewKt.a(HorizontalListingsItemViewModel.this, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<b<?>> b(n1<? extends List<? extends b<?>>> n1Var) {
        return (List) n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final String str, final g00.a<wz.p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        Object obj;
        androidx.compose.runtime.a aVar3;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar2.h(-2011299255);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
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
            aVar3 = h11;
        } else {
            if (c.I()) {
                c.U(-2011299255, i12, -1, "com.forsale.app.features.categories.listings.items.horizontalListing.ListingCommercialPosterOrFiller (HorizontalListingsView.kt:118)");
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
            if (str == null) {
                obj = Integer.valueOf(d.A);
            } else {
                obj = str;
            }
            h11.C(1157296644);
            boolean T = h11.T(k0Var);
            Object D2 = h11.D();
            if (T || D2 == c0064a.a()) {
                D2 = new l<AsyncImagePainter.b.c, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$ListingCommercialPosterOrFiller$painter$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(AsyncImagePainter.b.c it2) {
                        o.i(it2, "it");
                        HorizontalListingsViewKt.e(k0Var, true);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(AsyncImagePainter.b.c cVar) {
                        b(cVar);
                        return wz.p.f75480a;
                    }
                };
                h11.u(D2);
            }
            h11.S();
            l lVar = (l) D2;
            h11.C(1157296644);
            boolean T2 = h11.T(k0Var);
            Object D3 = h11.D();
            if (T2 || D3 == c0064a.a()) {
                D3 = new l<AsyncImagePainter.b.d, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$ListingCommercialPosterOrFiller$painter$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(AsyncImagePainter.b.d it2) {
                        o.i(it2, "it");
                        HorizontalListingsViewKt.e(k0Var, false);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(AsyncImagePainter.b.d dVar) {
                        b(dVar);
                        return wz.p.f75480a;
                    }
                };
                h11.u(D3);
            }
            h11.S();
            aVar3 = h11;
            AsyncImagePainter b11 = h5.d.b(obj, null, null, null, lVar, (l) D3, null, null, 0, h11, 8, 462);
            aVar3.C(902134632);
            if (d(k0Var)) {
                SurfaceKt.c(null, g.c(h.l(8)), 0L, 0L, null, 0.0f, ComposableSingletons$HorizontalListingsViewKt.f30727a.a(), aVar3, 1572864, 61);
            }
            aVar3.S();
            androidx.compose.ui.c u11 = SizeKt.u(androidx.compose.ui.c.f7566a, f30752a);
            aVar3.C(1157296644);
            boolean T3 = aVar3.T(aVar);
            Object D4 = aVar3.D();
            if (T3 || D4 == c0064a.a()) {
                D4 = new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$ListingCommercialPosterOrFiller$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        aVar.invoke();
                    }
                };
                aVar3.u(D4);
            }
            aVar3.S();
            PosterKt.b(b11, true, u11, false, 1.0f, (g00.a) D4, aVar3, 25008, 8);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$ListingCommercialPosterOrFiller$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i15) {
                    HorizontalListingsViewKt.c(str, aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    private static final boolean d(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    public static final float j(int i11, float f11) {
        return h.l(h.l(h.l(f30752a * i11) + h.l(f11 * (i11 - 1))) + h.l(12));
    }

    public static /* synthetic */ float k(int i11, float f11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = h.l(12);
        }
        return j(i11, f11);
    }

    public static final float l() {
        return f30752a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final Context context, String str) {
        ContextExtensionKt.a(context, str, new l<Exception, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt$openCallIntent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Exception it2) {
                o.i(it2, "it");
                Context context2 = context;
                String string = context2.getString(y0.Z9);
                o.h(string, "getString(...)");
                if (ContextExtensionsKt.f(context2)) {
                    c.a aVar = new c.a(context2);
                    aVar.o(y0.M4);
                    aVar.h(string);
                    aVar.m(context2.getString(y0.Z4), new a());
                    aVar.d(false);
                    aVar.q();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(Exception exc) {
                b(exc);
                return wz.p.f75480a;
            }

            /* compiled from: ViewsExtensions.kt */
            /* loaded from: classes2.dex */
            public static final class a implements DialogInterface.OnClickListener {
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                }
            }
        });
    }
}
