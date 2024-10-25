package com.forsale.app.features.categories.home.maincategories.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.c;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.c;
import c0.g;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.domainlayer.interactors.categoriesinteractors.a;
import com.forsale.app.utils.StringExtensionKt;
import com.forsale.designSystem.layouts.c;
import com.forsale.ui.components.cards.CardsKt;
import com.forsale.ui.components.cards.SeeAllCardKt;
import e2.d;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.k0;
import j0.n1;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r0.b;
import t9.y0;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeVerticalSections.kt */
/* loaded from: classes2.dex */
public final class HomeVerticalSectionsKt$TopUserAdsList$6 extends Lambda implements l<LazyListScope, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f24467a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<h> f24468b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f24469c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k0<h> f24470d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r<ListingItemBrief, Integer, Integer, List<Integer>, p> f24471e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f24472f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l<CategoryEntity, p> f24473g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeVerticalSectionsKt$TopUserAdsList$6(a aVar, k0<h> k0Var, d dVar, k0<h> k0Var2, r<? super ListingItemBrief, ? super Integer, ? super Integer, ? super List<Integer>, p> rVar, int i11, l<? super CategoryEntity, p> lVar) {
        super(1);
        this.f24467a = aVar;
        this.f24468b = k0Var;
        this.f24469c = dVar;
        this.f24470d = k0Var2;
        this.f24471e = rVar;
        this.f24472f = i11;
        this.f24473g = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(n1<String> n1Var) {
        return n1Var.getValue();
    }

    public final void c(LazyListScope LazyRow) {
        o.i(LazyRow, "$this$LazyRow");
        final a aVar = this.f24467a;
        if (aVar == null) {
            LazyListScope.e(LazyRow, 5, null, null, b.c(289383085, true, new r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6.1
                {
                    super(4);
                }

                public final void b(x.a items, int i11, androidx.compose.runtime.a aVar2, int i12) {
                    o.i(items, "$this$items");
                    if ((i12 & 641) == 128 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(289383085, i12, -1, "com.forsale.app.features.categories.home.maincategories.ui.TopUserAdsList.<anonymous>.<anonymous> (HomeVerticalSections.kt:222)");
                    }
                    boolean z11 = false;
                    c.b bVar = new c.b(false);
                    String b11 = StringExtensionKt.b(6);
                    String b12 = StringExtensionKt.b(10);
                    String b13 = StringExtensionKt.b(10);
                    String b14 = StringExtensionKt.b(10);
                    c.a aVar3 = androidx.compose.ui.c.f7566a;
                    if (a.this == null) {
                        z11 = true;
                    }
                    CardsKt.h(new g00.a<p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt.TopUserAdsList.6.1.1
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }
                    }, bVar, null, b11, b12, null, b13, com.forsale.ui.components.skeleton.a.a(aVar3, z11, g.c(h.l(4)), 0L, 0L, aVar2, 6, 12), null, null, null, null, null, b14, null, null, aVar2, (c.b.f41902f << 3) | 390, 0, 57120);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(x.a aVar2, Integer num, androidx.compose.runtime.a aVar3, Integer num2) {
                    b(aVar2, num.intValue(), aVar3, num2.intValue());
                    return p.f75480a;
                }
            }), 6, null);
            return;
        }
        final List<zc.b> h11 = aVar.h();
        final k0<h> k0Var = this.f24468b;
        final d dVar = this.f24469c;
        final k0<h> k0Var2 = this.f24470d;
        final r<ListingItemBrief, Integer, Integer, List<Integer>, p> rVar = this.f24471e;
        final int i11 = this.f24472f;
        LazyRow.f(h11.size(), null, new l<Integer, Object>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$invoke$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object b(int i12) {
                h11.get(i12);
                return null;
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return b(num.intValue());
            }
        }, b.c(-1091073711, true, new r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(x.a aVar2, final int i12, androidx.compose.runtime.a aVar3, int i13) {
                int i14;
                int i15;
                int i16;
                if ((i13 & 14) == 0) {
                    if (aVar3.T(aVar2)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i14 = i13 | i16;
                } else {
                    i14 = i13;
                }
                if ((i13 & 112) == 0) {
                    if (aVar3.d(i12)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i14 |= i15;
                }
                if ((i14 & 731) == 146 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1091073711, i14, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                }
                final zc.b bVar = (zc.b) h11.get(i12);
                final n1 b11 = LiveDataAdapterKt.b(bVar.r(), "", aVar3, 56);
                c.a aVar4 = androidx.compose.ui.c.f7566a;
                aVar3.C(1618982084);
                boolean T = aVar3.T(k0Var) | aVar3.T(dVar) | aVar3.T(k0Var2);
                Object D = aVar3.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    final k0 k0Var3 = k0Var;
                    final d dVar2 = dVar;
                    final k0 k0Var4 = k0Var2;
                    D = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008e: CONSTRUCTOR  (r5v6 'D' java.lang.Object) = (r3v7 'k0Var3' j0.k0 A[DONT_INLINE]), (r8v0 'dVar2' e2.d A[DONT_INLINE]), (r9v0 'k0Var4' j0.k0 A[DONT_INLINE]) call: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$2$1$1.<init>(j0.k0, e2.d, j0.k0):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$invoke$$inlined$itemsIndexed$default$3.b(x.a, int, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$2$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r0 = r12
                        r4 = r14
                        r7 = r15
                        r1 = r16 & 14
                        if (r1 != 0) goto L14
                        r1 = r13
                        boolean r1 = r15.T(r13)
                        if (r1 == 0) goto L10
                        r1 = 4
                        goto L11
                    L10:
                        r1 = 2
                    L11:
                        r1 = r16 | r1
                        goto L16
                    L14:
                        r1 = r16
                    L16:
                        r2 = r16 & 112(0x70, float:1.57E-43)
                        if (r2 != 0) goto L26
                        boolean r2 = r15.d(r14)
                        if (r2 == 0) goto L23
                        r2 = 32
                        goto L25
                    L23:
                        r2 = 16
                    L25:
                        r1 = r1 | r2
                    L26:
                        r2 = r1 & 731(0x2db, float:1.024E-42)
                        r3 = 146(0x92, float:2.05E-43)
                        if (r2 != r3) goto L38
                        boolean r2 = r15.i()
                        if (r2 != 0) goto L33
                        goto L38
                    L33:
                        r15.L()
                        goto Lc6
                    L38:
                        boolean r2 = androidx.compose.runtime.c.I()
                        if (r2 == 0) goto L47
                        r2 = -1
                        java.lang.String r3 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)"
                        r5 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                        androidx.compose.runtime.c.U(r5, r1, r2, r3)
                    L47:
                        java.util.List r1 = r1
                        java.lang.Object r1 = r1.get(r14)
                        r2 = r1
                        zc.b r2 = (zc.b) r2
                        androidx.lifecycle.LiveData r1 = r2.r()
                        java.lang.String r3 = ""
                        r5 = 56
                        j0.n1 r6 = androidx.compose.runtime.livedata.LiveDataAdapterKt.b(r1, r3, r15, r5)
                        androidx.compose.ui.c$a r1 = androidx.compose.ui.c.f7566a
                        r3 = 1618982084(0x607fb4c4, float:7.370227E19)
                        r15.C(r3)
                        j0.k0 r3 = r2
                        boolean r3 = r15.T(r3)
                        e2.d r5 = r3
                        boolean r5 = r15.T(r5)
                        r3 = r3 | r5
                        j0.k0 r5 = r4
                        boolean r5 = r15.T(r5)
                        r3 = r3 | r5
                        java.lang.Object r5 = r15.D()
                        if (r3 != 0) goto L86
                        androidx.compose.runtime.a$a r3 = androidx.compose.runtime.a.f7182a
                        java.lang.Object r3 = r3.a()
                        if (r5 != r3) goto L94
                    L86:
                        com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$2$1$1 r5 = new com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$2$1$1
                        j0.k0 r3 = r2
                        e2.d r8 = r3
                        j0.k0 r9 = r4
                        r5.<init>(r3, r8, r9)
                        r15.u(r5)
                    L94:
                        r15.S()
                        g00.l r5 = (g00.l) r5
                        androidx.compose.ui.c r8 = androidx.compose.ui.layout.g0.a(r1, r5)
                        r9 = 0
                        r10 = 0
                        com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$2$2 r11 = new com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$2$2
                        g00.r r3 = r5
                        int r5 = r6
                        r1 = r11
                        r4 = r14
                        r1.<init>(r2, r3, r4, r5, r6)
                        r1 = 1800354393(0x6b4f3a59, float:2.5052318E26)
                        r2 = 1
                        r0.a r4 = r0.b.b(r15, r1, r2, r11)
                        r6 = 3072(0xc00, float:4.305E-42)
                        r11 = 6
                        r1 = r8
                        r2 = r9
                        r3 = r10
                        r5 = r15
                        r7 = r11
                        androidx.compose.foundation.layout.BoxWithConstraintsKt.a(r1, r2, r3, r4, r5, r6, r7)
                        boolean r1 = androidx.compose.runtime.c.I()
                        if (r1 == 0) goto Lc6
                        androidx.compose.runtime.c.T()
                    Lc6:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6$invoke$$inlined$itemsIndexed$default$3.b(x.a, int, androidx.compose.runtime.a, int):void");
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(x.a aVar2, Integer num, androidx.compose.runtime.a aVar3, Integer num2) {
                    b(aVar2, num.intValue(), aVar3, num2.intValue());
                    return p.f75480a;
                }
            }));
            final a aVar2 = this.f24467a;
            final k0<h> k0Var3 = this.f24470d;
            final k0<h> k0Var4 = this.f24468b;
            final l<CategoryEntity, p> lVar = this.f24473g;
            LazyListScope.l(LazyRow, null, null, b.c(1957239113, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$6.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(x.a item, androidx.compose.runtime.a aVar3, int i12) {
                    o.i(item, "$this$item");
                    if ((i12 & 81) == 16 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1957239113, i12, -1, "com.forsale.app.features.categories.home.maincategories.ui.TopUserAdsList.<anonymous>.<anonymous> (HomeVerticalSections.kt:261)");
                    }
                    String c11 = p1.g.c(y0.f70636q5, new Object[]{a.this.c().getName()}, aVar3, 64);
                    androidx.compose.ui.c r11 = SizeKt.r(androidx.compose.ui.c.f7566a, k0Var3.getValue().q(), k0Var4.getValue().q());
                    final l<CategoryEntity, p> lVar2 = lVar;
                    final a aVar4 = a.this;
                    SeeAllCardKt.a(r11, c11, new g00.a<p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt.TopUserAdsList.6.3.1
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
                            lVar2.invoke(aVar4.c());
                        }
                    }, aVar3, 0, 0);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(x.a aVar3, androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar3, aVar4, num.intValue());
                    return p.f75480a;
                }
            }), 3, null);
        }

        @Override // g00.l
        public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
            c(lazyListScope);
            return p.f75480a;
        }
    }
