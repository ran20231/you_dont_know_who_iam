package com.forsale.app.features.categories.home.propertyhome;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.recyclerview.widget.RecyclerView;
import c0.g;
import coil.compose.AsyncImagePainter;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k0;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import t9.y0;
import v.j;
import v.k;
import w.t;
import wz.p;
/* compiled from: HotZone.kt */
/* loaded from: classes2.dex */
public final class HotZoneKt {
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r15, final com.forsale.app.features.categories.home.propertyhome.models.SectionState r16, final boolean r17, g00.p<? super java.lang.Integer, ? super java.lang.Integer, wz.p> r18, final g00.l<? super java.lang.String, wz.p> r19, androidx.compose.runtime.a r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.HotZoneKt.a(boolean, com.forsale.app.features.categories.home.propertyhome.models.SectionState, boolean, g00.p, g00.l, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final zc.d dVar, final float f11, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(-897841156);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-897841156, i11, -1, "com.forsale.app.features.categories.home.propertyhome.HotZoneFiller (HotZone.kt:165)");
        }
        SurfaceKt.c(null, g.c(h.l(8)), 0L, 0L, null, h.l(2), r0.b.b(h11, 1117016888, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneFiller$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar3, int i12) {
                String str;
                ListingsResponse.UISettings f12;
                ListingsResponse.UISettings.FillersSettings fillersSettings;
                ListingsResponse.UISettings.FillersSettings.Pinned pinned;
                if ((i12 & 11) == 2 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1117016888, i12, -1, "com.forsale.app.features.categories.home.propertyhome.HotZoneFiller.<anonymous> (HotZone.kt:170)");
                }
                zc.d dVar2 = zc.d.this;
                if (dVar2 != null && (f12 = dVar2.f()) != null && (fillersSettings = f12.getFillersSettings()) != null && (pinned = fillersSettings.getPinned()) != null) {
                    str = pinned.getImage();
                } else {
                    str = null;
                }
                AsyncImagePainter a11 = h5.d.a(str, null, null, null, 0, aVar3, 0, 30);
                v0.b e11 = v0.b.f74009a.e();
                androidx.compose.ui.c a12 = y0.e.a(androidx.compose.ui.c.f7566a, g.c(h.l(8)));
                aVar3.C(-492369756);
                Object D = aVar3.D();
                if (D == androidx.compose.runtime.a.f7182a.a()) {
                    D = j.a();
                    aVar3.u(D);
                }
                aVar3.S();
                ImageKt.a(a11, null, AspectRatioKt.a(SizeKt.i(ClickableKt.c(a12, (k) D, null, false, null, null, aVar, 28, null), f11), 1.06f, true), e11, null, 0.0f, null, aVar3, 3120, 112);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                b(aVar3, num.intValue());
                return p.f75480a;
            }
        }), h11, 1769472, 29);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneFiller$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    HotZoneKt.b(zc.d.this, f11, aVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final SectionState.e eVar, final boolean z11, g00.p<? super Integer, ? super Integer, p> pVar, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        HotZoneKt$HotZoneList$1 hotZoneKt$HotZoneList$1;
        Integer f11;
        androidx.compose.runtime.a h11 = aVar.h(656859738);
        if ((i12 & 4) != 0) {
            hotZoneKt$HotZoneList$1 = new g00.p<Integer, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$1
                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(Integer num, Integer num2) {
                    b(num.intValue(), num2.intValue());
                    return p.f75480a;
                }

                public final void b(int i13, int i14) {
                }
            };
        } else {
            hotZoneKt$HotZoneList$1 = pVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(656859738, i11, -1, "com.forsale.app.features.categories.home.propertyhome.HotZoneList (HotZone.kt:108)");
        }
        final e2.d dVar = (e2.d) h11.q(CompositionLocalsKt.e());
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        boolean z12 = false;
        if (D == c0064a.a()) {
            D = c0.e(h.f(h.l(0)), null, 2, null);
            h11.u(D);
        }
        h11.S();
        final k0 k0Var = (k0) D;
        final LazyListState c11 = LazyListStateKt.c(0, 0, h11, 0, 3);
        final int size = eVar.d().size();
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = z.d(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$maxItemReachedAds$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final Integer invoke() {
                    Object v02;
                    List<Integer> a11 = aj.b.a(LazyListState.this.x());
                    if (a11.isEmpty() || eVar.d() == null) {
                        return null;
                    }
                    v02 = CollectionsKt___CollectionsKt.v0(a11);
                    return Integer.valueOf(((Number) v02).intValue() + 1);
                }
            });
            h11.u(D2);
        }
        h11.S();
        n1 n1Var = (n1) D2;
        if (c11.e() && (f11 = f(n1Var)) != null) {
            if (f11.intValue() > size) {
                z12 = true;
            }
            if (z12) {
                f11 = null;
            }
            if (f11 != null) {
                hotZoneKt$HotZoneList$1.invoke(Integer.valueOf(f11.intValue()), Integer.valueOf(size));
            }
        }
        LazyDslKt.b(null, c11, PaddingKt.c(h.l(16), 0.0f, 2, null), false, Arrangement.f3698a.o(h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(LazyListScope LazyRow) {
                List<?> a11;
                o.i(LazyRow, "$this$LazyRow");
                if (!z11) {
                    a11 = eVar.d();
                    o.g(a11, "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel>");
                } else {
                    a11 = ForPropertyListingItemViewModel.X.a(5);
                }
                final List<?> list = a11;
                final boolean z13 = z11;
                final int i13 = i11;
                final k0<h> k0Var2 = k0Var;
                final e2.d dVar2 = dVar;
                final int i14 = size;
                LazyRow.f(list.size(), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                      (r12v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                      (wrap: int : 0x0027: INVOKE  (r1v5 int A[REMOVE]) = (r3v0 'list' java.util.List<?>) type: INTERFACE call: java.util.List.size():int)
                      (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                      (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x002d: CONSTRUCTOR  (r9v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = (r3v0 'list' java.util.List<?> A[DONT_INLINE]) call: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4$invoke$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                      (wrap: r0.a : 0x003a: INVOKE  (r2v3 r0.a A[REMOVE]) = 
                      (-1091073711 int)
                      true
                      (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0033: CONSTRUCTOR  (r10v0 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                      (r3v0 'list' java.util.List<?> A[DONT_INLINE])
                      (r4v0 'z13' boolean A[DONT_INLINE])
                      (r5v0 'i13' int A[DONT_INLINE])
                      (r6v0 'k0Var2' j0.k0<e2.h> A[DONT_INLINE])
                      (r7v0 'dVar2' e2.d A[DONT_INLINE])
                      (r8v0 'i14' int A[DONT_INLINE])
                     call: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4$invoke$$inlined$itemsIndexed$default$3.<init>(java.util.List, boolean, int, j0.k0, e2.d, int):void type: CONSTRUCTOR)
                     type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                     type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4$invoke$$inlined$itemsIndexed$default$2, state: NOT_LOADED
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
                    java.lang.String r1 = "$this$LazyRow"
                    kotlin.jvm.internal.o.i(r12, r1)
                    boolean r1 = r1
                    if (r1 != 0) goto L15
                    com.forsale.app.features.categories.home.propertyhome.models.SectionState$e r1 = r2
                    java.util.List r1 = r1.d()
                    java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel>"
                    kotlin.jvm.internal.o.g(r1, r2)
                    goto L1c
                L15:
                    com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel$a r1 = com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel.X
                    r2 = 5
                    java.util.List r1 = r1.a(r2)
                L1c:
                    r3 = r1
                    boolean r4 = r1
                    int r5 = r3
                    j0.k0<e2.h> r6 = r4
                    e2.d r7 = r5
                    int r8 = r6
                    int r1 = r3.size()
                    com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4$invoke$$inlined$itemsIndexed$default$2 r9 = new com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4$invoke$$inlined$itemsIndexed$default$2
                    r9.<init>(r3)
                    com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4$invoke$$inlined$itemsIndexed$default$3 r10 = new com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4$invoke$$inlined$itemsIndexed$default$3
                    r2 = r10
                    r2.<init>(r3, r4, r5, r6, r7, r8)
                    r2 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                    r3 = 1
                    r0.a r2 = r0.b.c(r2, r3, r10)
                    r4 = 0
                    r12.f(r1, r4, r9, r2)
                    r1 = 0
                    r2 = 0
                    com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4$2 r4 = new com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4$2
                    com.forsale.app.features.categories.home.propertyhome.models.SectionState$e r5 = r2
                    j0.k0<e2.h> r6 = r4
                    r4.<init>()
                    r5 = -366937092(0xffffffffea20fbfc, float:-4.8654523E25)
                    r0.a r3 = r0.b.c(r5, r3, r4)
                    r4 = 3
                    r5 = 0
                    r0 = r12
                    androidx.compose.foundation.lazy.LazyListScope.l(r0, r1, r2, r3, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$4.b(androidx.compose.foundation.lazy.LazyListScope):void");
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
            final g00.p<? super Integer, ? super Integer, p> pVar2 = hotZoneKt$HotZoneList$1;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneList$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    HotZoneKt.c(SectionState.e.this, z11, pVar2, aVar2, v0.a(i11 | 1), i12);
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
    public static final float d(k0<h> k0Var) {
        return k0Var.getValue().q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k0<h> k0Var, float f11) {
        k0Var.setValue(h.f(f11));
    }

    private static final Integer f(n1<Integer> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final SectionState.e eVar, final boolean z11, final boolean z12, g00.p<? super Integer, ? super Integer, p> pVar, final l<? super String, p> lVar, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        final HotZoneKt$HotZoneView$1 hotZoneKt$HotZoneView$1;
        androidx.compose.runtime.a h11 = aVar.h(1416753258);
        if ((i12 & 8) != 0) {
            hotZoneKt$HotZoneView$1 = new g00.p<Integer, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneView$1
                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(Integer num, Integer num2) {
                    b(num.intValue(), num2.intValue());
                    return p.f75480a;
                }

                public final void b(int i13, int i14) {
                }
            };
        } else {
            hotZoneKt$HotZoneView$1 = pVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1416753258, i11, -1, "com.forsale.app.features.categories.home.propertyhome.HotZoneView (HotZone.kt:81)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c b11 = BackgroundKt.b(aVar2, dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null);
        h11.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        j0.k s11 = h11.s();
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
        int i13 = i11 >> 3;
        int i14 = i13 & 112;
        int i15 = i14 | 6;
        SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar2, h.l(f11)), z12, g.c(h.l(f12)), 0L, 0L, h11, i15, 12), h11, 0);
        String localized = eVar.f().getLocalized();
        String localized2 = eVar.e().getLocalized();
        h11.C(1157296644);
        boolean T = h11.T(lVar);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new l<String, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneView$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(String it2) {
                    o.i(it2, "it");
                    lVar.invoke(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            };
            h11.u(D);
        }
        h11.S();
        int i16 = i11 << 3;
        h(localized, localized2, z11, z12, (l) D, h11, (i16 & 896) | (i16 & 7168));
        SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar2, h.l(f12)), z12, g.c(h.l(f12)), 0L, 0L, h11, i15, 12), h11, 0);
        c(eVar, z12, hotZoneKt$HotZoneView$1, h11, i14 | 8 | (i13 & 896), 0);
        SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar2, h.l(f11)), z12, g.c(h.l(f12)), 0L, 0L, h11, i15, 12), h11, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$HotZoneView$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i17) {
                    HotZoneKt.g(SectionState.e.this, z11, z12, hotZoneKt$HotZoneView$1, lVar, aVar3, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void h(final String title, final String subtitle, final boolean z11, final boolean z12, final l<? super String, p> onSeeAllButtonClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        o.i(title, "title");
        o.i(subtitle, "subtitle");
        o.i(onSeeAllButtonClicked, "onSeeAllButtonClicked");
        androidx.compose.runtime.a h11 = aVar.h(686646392);
        if ((i11 & 14) == 0) {
            if (h11.T(title)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(subtitle)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & 896) == 0) {
            if (h11.a(z11)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 7168) == 0) {
            if (h11.a(z12)) {
                i14 = RecyclerView.l.FLAG_MOVED;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((57344 & i11) == 0) {
            if (h11.F(onSeeAllButtonClicked)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        final int i18 = i12;
        if ((46811 & i18) == 9362 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(686646392, i18, -1, "com.forsale.app.features.categories.home.propertyhome.SectionTitleView (HotZone.kt:197)");
            }
            float f11 = 16;
            aVar2 = h11;
            SectionTitleKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null), null, r0.b.b(h11, -1342120710, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i19) {
                    if ((i19 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1342120710, i19, -1, "com.forsale.app.features.categories.home.propertyhome.SectionTitleView.<anonymous> (HotZone.kt:201)");
                    }
                    TextKt.a(title, com.forsale.ui.components.skeleton.a.a(androidx.compose.ui.c.f7566a, z12, g.c(h.l(8)), 0L, 0L, aVar3, ((i18 >> 6) & 112) | 6, 12), 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, i18 & 14, 0, 2044);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            }), null, r0.b.b(h11, -674738820, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i19) {
                    if ((i19 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-674738820, i19, -1, "com.forsale.app.features.categories.home.propertyhome.SectionTitleView.<anonymous> (HotZone.kt:206)");
                    }
                    if (z11) {
                        boolean z13 = z12;
                        final l<String, p> lVar = onSeeAllButtonClicked;
                        final String str = title;
                        aVar3.C(511388516);
                        boolean T = aVar3.T(lVar) | aVar3.T(str);
                        Object D = aVar3.D();
                        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                            D = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: CONSTRUCTOR  (r3v2 'D' java.lang.Object) = (r0v2 'lVar' g00.l<java.lang.String, wz.p> A[DONT_INLINE]), (r1v1 'str' java.lang.String A[DONT_INLINE]) call: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$2$1$1.<init>(g00.l, java.lang.String):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$2$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 31 more
                                */
                            /*
                                this = this;
                                r0 = r6 & 11
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r5.i()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r5.L()
                                goto L65
                            L10:
                                boolean r0 = androidx.compose.runtime.c.I()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.forsale.app.features.categories.home.propertyhome.SectionTitleView.<anonymous> (HotZone.kt:206)"
                                r2 = -674738820(0xffffffffd7c84d7c, float:-4.40470237E14)
                                androidx.compose.runtime.c.U(r2, r6, r0, r1)
                            L1f:
                                boolean r6 = r1
                                if (r6 == 0) goto L5c
                                boolean r6 = r2
                                g00.l<java.lang.String, wz.p> r0 = r3
                                java.lang.String r1 = r4
                                r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                                r5.C(r2)
                                boolean r2 = r5.T(r0)
                                boolean r3 = r5.T(r1)
                                r2 = r2 | r3
                                java.lang.Object r3 = r5.D()
                                if (r2 != 0) goto L46
                                androidx.compose.runtime.a$a r2 = androidx.compose.runtime.a.f7182a
                                java.lang.Object r2 = r2.a()
                                if (r3 != r2) goto L4e
                            L46:
                                com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$2$1$1 r3 = new com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$2$1$1
                                r3.<init>(r0, r1)
                                r5.u(r3)
                            L4e:
                                r5.S()
                                g00.a r3 = (g00.a) r3
                                int r0 = r5
                                int r0 = r0 >> 9
                                r0 = r0 & 14
                                com.forsale.app.features.categories.home.propertyhome.HotZoneKt.o(r6, r3, r5, r0)
                            L5c:
                                boolean r5 = androidx.compose.runtime.c.I()
                                if (r5 == 0) goto L65
                                androidx.compose.runtime.c.T()
                            L65:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$2.b(androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return p.f75480a;
                        }
                    }), r0.b.b(h11, 1806435773, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i19) {
                            boolean z13;
                            if ((i19 & 11) == 2 && aVar3.i()) {
                                aVar3.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(1806435773, i19, -1, "com.forsale.app.features.categories.home.propertyhome.SectionTitleView.<anonymous> (HotZone.kt:208)");
                            }
                            if (subtitle.length() > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                TextKt.a(subtitle, com.forsale.ui.components.skeleton.a.a(androidx.compose.ui.c.f7566a, z12, g.c(h.l(8)), 0L, 0L, aVar3, ((i18 >> 6) & 112) | 6, 12), 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, (i18 >> 3) & 14, 0, 2044);
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return p.f75480a;
                        }
                    }), aVar2, 221574, 10);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }
                d1 l11 = aVar2.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SectionTitleView$4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i19) {
                            HotZoneKt.h(title, subtitle, z11, z12, onSeeAllButtonClicked, aVar3, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void i(final boolean z11, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
                final int i12;
                int i13;
                int i14;
                androidx.compose.runtime.a h11 = aVar2.h(-1591427091);
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
                        androidx.compose.runtime.c.U(-1591427091, i12, -1, "com.forsale.app.features.categories.home.propertyhome.SeeAllButton (HotZone.kt:217)");
                    }
                    ButtonData c11 = ButtonData.f40994a.c();
                    h11.C(1157296644);
                    boolean T = h11.T(aVar);
                    Object D = h11.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = new g00.a<p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SeeAllButton$1$1
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
                    ButtonsKt.k((g00.a) D, null, c11, false, false, null, r0.b.b(h11, 2103420007, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SeeAllButton$2
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
                                androidx.compose.runtime.c.U(2103420007, i15, -1, "com.forsale.app.features.categories.home.propertyhome.SeeAllButton.<anonymous> (HotZone.kt:223)");
                            }
                            String b11 = p1.g.b(y0.Jd, aVar3, 0);
                            c.a aVar4 = androidx.compose.ui.c.f7566a;
                            float f11 = 8;
                            TextKt.a(b11, com.forsale.ui.components.skeleton.a.a(aVar4, z11, g.c(h.l(f11)), 0L, 0L, aVar3, ((i12 << 3) & 112) | 6, 12), 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2044);
                            IconKt.a(p1.e.d(sj.d.f68676m, aVar3, 0), com.forsale.ui.components.skeleton.a.a(aVar4, z11, g.c(h.l(f11)), 0L, 0L, aVar3, ((i12 << 3) & 112) | 6, 12), null, 0L, false, 0.0f, aVar3, 392, 56);
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
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.HotZoneKt$SeeAllButton$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i15) {
                            HotZoneKt.i(z11, aVar, aVar3, v0.a(i11 | 1));
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
