package com.forsale.app.features.search;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.c;
import b1.t1;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.search.SearchFocusViewModel;
import com.forsale.app.features.search.SearchItemModel;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.IconButtonKt;
import com.forsale.designSystem.buttons.IconButtonShape;
import com.forsale.designSystem.buttons.IconButtonSize;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.layouts.ListItemsKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import com.forsale.ui.components.SpanTextKt;
import j0.d1;
import j0.e1;
import j0.v0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import t9.y0;
/* compiled from: ItemListContainer.kt */
/* loaded from: classes2.dex */
public final class ItemListContainerKt {

    /* compiled from: ItemListContainer.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36549a;

        static {
            int[] iArr = new int[SearchItemModel.ItemType.values().length];
            try {
                iArr[SearchItemModel.ItemType.HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchItemModel.ItemType.AUTOCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36549a = iArr;
        }
    }

    public static final void a(LazyListScope lazyListScope, final SearchFocusViewModel viewModel) {
        kotlin.jvm.internal.o.i(lazyListScope, "<this>");
        kotlin.jvm.internal.o.i(viewModel, "viewModel");
        LazyListScope.l(lazyListScope, null, null, r0.b.c(-233586873, true, new g00.q<x.a, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$ApiSuggestionContainer$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            public final void b(x.a item, androidx.compose.runtime.a aVar, int i11) {
                kotlin.jvm.internal.o.i(item, "$this$item");
                if ((i11 & 81) == 16 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-233586873, i11, -1, "com.forsale.app.features.search.ApiSuggestionContainer.<anonymous> (ItemListContainer.kt:79)");
                }
                SearchItemModel.ItemType itemType = SearchItemModel.ItemType.AUTOCOMPLETE;
                SearchFocusViewModel.SearchState U0 = SearchFocusViewModel.this.U0();
                List<SearchItemModel> a11 = SearchFocusViewModel.this.U0().e().a();
                final SearchFocusViewModel searchFocusViewModel = SearchFocusViewModel.this;
                ItemListContainerKt.e(itemType, U0, a11, null, null, new g00.l<SearchItemModel, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$ApiSuggestionContainer$1.1
                    {
                        super(1);
                    }

                    public final void b(SearchItemModel it2) {
                        kotlin.jvm.internal.o.i(it2, "it");
                        SearchFocusViewModel.this.n1(new h(it2));
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(SearchItemModel searchItemModel) {
                        b(searchItemModel);
                        return wz.p.f75480a;
                    }
                }, null, null, null, aVar, 582, 472);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ wz.p invoke(x.a aVar, androidx.compose.runtime.a aVar2, Integer num) {
                b(aVar, aVar2, num.intValue());
                return wz.p.f75480a;
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final String str, final SearchItemModel searchItemModel, final g00.l<? super SearchItemModel, wz.p> lVar, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1832218928);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1832218928, i11, -1, "com.forsale.app.features.search.AutoCompleteSearchItem (ItemListContainer.kt:244)");
        }
        k(str, searchItemModel, lVar, null, h11, (i11 & 14) | 64 | (i11 & 896), 8);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$AutoCompleteSearchItem$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    ItemListContainerKt.b(str, searchItemModel, lVar, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void c(LazyListScope lazyListScope) {
        kotlin.jvm.internal.o.i(lazyListScope, "<this>");
        LazyListScope.l(lazyListScope, null, null, ComposableSingletons$ItemListContainerKt.f36460a.e(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final String str, final g00.p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        final int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar.h(-2049127683);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.T(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.F(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (i16 != 0) {
                pVar = null;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-2049127683, i13, -1, "com.forsale.app.features.search.Header (ItemListContainer.kt:171)");
            }
            float f11 = 16;
            SectionTitleKt.a(PaddingKt.l(androidx.compose.ui.c.f7566a, e2.h.l(f11), e2.h.l(f11), e2.h.l(f11), e2.h.l(11)), null, r0.b.b(h11, -1529471173, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$Header$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i17) {
                    if ((i17 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1529471173, i17, -1, "com.forsale.app.features.search.Header.<anonymous> (ItemListContainer.kt:175)");
                    }
                    c.a aVar3 = androidx.compose.ui.c.f7566a;
                    dk.a aVar4 = dk.a.f54291a;
                    int i18 = dk.a.f54292b;
                    TextKt.a(str, aVar3, 0, 0, false, 0, 0, null, aVar4.c(aVar2, i18).r(), aVar4.a(aVar2, i18).e().j(aVar2, yj.d.f76453b), 0, aVar2, (i13 & 14) | 48, 0, 1276);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            }), null, pVar, null, h11, ((i13 << 9) & 57344) | 384, 42);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$Header$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i17) {
                    ItemListContainerKt.d(str, pVar, aVar2, v0.a(i11 | 1), i12);
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
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
        if (r4 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
        if (r7 != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final com.forsale.app.features.search.SearchItemModel.ItemType r20, final com.forsale.app.features.search.SearchFocusViewModel.SearchState r21, final java.util.List<com.forsale.app.features.search.SearchItemModel> r22, java.util.List<com.forsale.app.datalayer.database.CategoryEntity> r23, g00.a<wz.p> r24, final g00.l<? super com.forsale.app.features.search.SearchItemModel, wz.p> r25, g00.a<wz.p> r26, g00.l<? super com.forsale.app.features.search.SearchItemModel, wz.p> r27, g00.l<? super com.forsale.app.datalayer.database.CategoryEntity, wz.p> r28, androidx.compose.runtime.a r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.ItemListContainerKt.e(com.forsale.app.features.search.SearchItemModel$ItemType, com.forsale.app.features.search.SearchFocusViewModel$SearchState, java.util.List, java.util.List, g00.a, g00.l, g00.a, g00.l, g00.l, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final g00.a<wz.p> aVar, androidx.compose.runtime.a aVar2, final int i11, final int i12) {
        final int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar2.h(-350836551);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.F(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (i15 != 0) {
                aVar = null;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-350836551, i13, -1, "com.forsale.app.features.search.RecentSearchHeader (ItemListContainer.kt:152)");
            }
            d(p1.g.b(y0.f70661rd, h11, 0), r0.b.b(h11, -2029487404, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchHeader$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r17v0, types: [androidx.compose.runtime.a] */
                /* JADX WARN: Type inference failed for: r3v2 */
                public final void b(androidx.compose.runtime.a aVar3, int i16) {
                    if ((i16 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-2029487404, i16, -1, "com.forsale.app.features.search.RecentSearchHeader.<anonymous> (ItemListContainer.kt:156)");
                    }
                    ButtonData c11 = ButtonData.f40994a.c();
                    yj.d f11 = dk.a.f54291a.a(aVar3, dk.a.f54292b).f();
                    w.o a11 = PaddingKt.a(e2.h.l(0));
                    final g00.a<wz.p> aVar4 = aVar;
                    aVar3.C(1157296644);
                    boolean T = aVar3.T(aVar4);
                    Object D = aVar3.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0060: CONSTRUCTOR  (r3v1 'D' java.lang.Object) = (r0v7 'aVar4' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.search.ItemListContainerKt$RecentSearchHeader$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.search.ItemListContainerKt$RecentSearchHeader$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchHeader$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r11 = r17
                            r0 = r18
                            r1 = r0 & 11
                            r2 = 2
                            if (r1 != r2) goto L17
                            boolean r1 = r17.i()
                            if (r1 != 0) goto L10
                            goto L17
                        L10:
                            r17.L()
                            r15 = r16
                            goto L94
                        L17:
                            boolean r1 = androidx.compose.runtime.c.I()
                            if (r1 == 0) goto L26
                            r1 = -1
                            java.lang.String r2 = "com.forsale.app.features.search.RecentSearchHeader.<anonymous> (ItemListContainer.kt:156)"
                            r3 = -2029487404(0xffffffff87087ad4, float:-1.0267599E-34)
                            androidx.compose.runtime.c.U(r3, r0, r1, r2)
                        L26:
                            com.forsale.designSystem.buttons.ButtonData$a r0 = com.forsale.designSystem.buttons.ButtonData.f40994a
                            com.forsale.designSystem.buttons.ButtonData r2 = r0.c()
                            dk.a r0 = dk.a.f54291a
                            int r1 = dk.a.f54292b
                            yj.b r0 = r0.a(r11, r1)
                            yj.d r5 = r0.f()
                            r0 = 0
                            float r0 = (float) r0
                            float r0 = e2.h.l(r0)
                            w.o r4 = androidx.compose.foundation.layout.PaddingKt.a(r0)
                            r15 = r16
                            g00.a<wz.p> r0 = r1
                            r1 = 1157296644(0x44faf204, float:2007.563)
                            r11.C(r1)
                            boolean r1 = r11.T(r0)
                            java.lang.Object r3 = r17.D()
                            if (r1 != 0) goto L5e
                            androidx.compose.runtime.a$a r1 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r1 = r1.a()
                            if (r3 != r1) goto L66
                        L5e:
                            com.forsale.app.features.search.ItemListContainerKt$RecentSearchHeader$1$1$1 r3 = new com.forsale.app.features.search.ItemListContainerKt$RecentSearchHeader$1$1$1
                            r3.<init>(r0)
                            r11.u(r3)
                        L66:
                            r17.S()
                            r0 = r3
                            g00.a r0 = (g00.a) r0
                            r1 = 0
                            r3 = 0
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            r9 = 0
                            com.forsale.app.features.search.ComposableSingletons$ItemListContainerKt r10 = com.forsale.app.features.search.ComposableSingletons$ItemListContainerKt.f36460a
                            g00.q r10 = r10.a()
                            int r12 = com.forsale.designSystem.buttons.ButtonData.f40995b
                            int r12 = r12 << 6
                            r12 = r12 | 24576(0x6000, float:3.4438E-41)
                            int r13 = yj.d.f76453b
                            int r13 = r13 << 15
                            r12 = r12 | r13
                            r13 = 6
                            r14 = 970(0x3ca, float:1.359E-42)
                            r11 = r17
                            com.forsale.designSystem.buttons.ButtonsKt.l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L94
                            androidx.compose.runtime.c.T()
                        L94:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.ItemListContainerKt$RecentSearchHeader$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return wz.p.f75480a;
                    }
                }), h11, 48, 0);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchHeader$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i16) {
                        ItemListContainerKt.f(aVar, aVar3, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(final String str, final SearchItemModel searchItemModel, final g00.l<? super SearchItemModel, wz.p> lVar, final g00.l<? super SearchItemModel, wz.p> lVar2, androidx.compose.runtime.a aVar, final int i11, final int i12) {
            androidx.compose.runtime.a h11 = aVar.h(-279359562);
            if ((i12 & 8) != 0) {
                lVar2 = null;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-279359562, i11, -1, "com.forsale.app.features.search.RecentSearchItem (ItemListContainer.kt:223)");
            }
            k(str, searchItemModel, lVar, r0.b.b(h11, -1340660300, true, new g00.q<w.c, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchItem$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(w.c SearchItem, androidx.compose.runtime.a aVar2, int i13) {
                    kotlin.jvm.internal.o.i(SearchItem, "$this$SearchItem");
                    if ((i13 & 81) == 16 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1340660300, i13, -1, "com.forsale.app.features.search.RecentSearchItem.<anonymous> (ItemListContainer.kt:228)");
                    }
                    androidx.compose.ui.c d11 = SizeKt.d(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
                    IconButtonShape iconButtonShape = IconButtonShape.Square;
                    IconButtonSize iconButtonSize = IconButtonSize.Medium;
                    Painter d12 = p1.e.d(sj.d.f68681r, aVar2, 0);
                    long j11 = dk.a.f54291a.a(aVar2, dk.a.f54292b).e().j(aVar2, yj.d.f76453b);
                    final g00.l<SearchItemModel, wz.p> lVar3 = lVar2;
                    final SearchItemModel searchItemModel2 = searchItemModel;
                    IconButtonKt.c(new g00.a<wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchItem$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            g00.l<SearchItemModel, wz.p> lVar4 = lVar3;
                            if (lVar4 != null) {
                                lVar4.invoke(searchItemModel2);
                            }
                        }
                    }, d12, iconButtonShape, iconButtonSize, d11, false, null, t1.g(j11), aVar2, 28096, 96);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(w.c cVar, androidx.compose.runtime.a aVar2, Integer num) {
                    b(cVar, aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            }), h11, (i11 & 14) | 3136 | (i11 & 896), 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                final g00.l<? super SearchItemModel, wz.p> lVar3 = lVar2;
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchItem$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i13) {
                        ItemListContainerKt.g(str, searchItemModel, lVar, lVar3, aVar2, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        public static final void h(LazyListScope lazyListScope, final SearchFocusViewModel viewModel) {
            kotlin.jvm.internal.o.i(lazyListScope, "<this>");
            kotlin.jvm.internal.o.i(viewModel, "viewModel");
            LazyListScope.l(lazyListScope, null, null, r0.b.c(1881714114, true, new g00.q<x.a, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchesContainer$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(x.a item, androidx.compose.runtime.a aVar, int i11) {
                    kotlin.jvm.internal.o.i(item, "$this$item");
                    if ((i11 & 81) == 16 && aVar.i()) {
                        aVar.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1881714114, i11, -1, "com.forsale.app.features.search.RecentSearchesContainer.<anonymous> (ItemListContainer.kt:43)");
                    }
                    SearchItemModel.ItemType itemType = SearchItemModel.ItemType.HISTORY;
                    SearchFocusViewModel.SearchState U0 = SearchFocusViewModel.this.U0();
                    List<SearchItemModel> f11 = SearchFocusViewModel.this.U0().f();
                    List<CategoryEntity> g11 = SearchFocusViewModel.this.U0().g();
                    final SearchFocusViewModel searchFocusViewModel = SearchFocusViewModel.this;
                    g00.a<wz.p> aVar2 = new g00.a<wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchesContainer$1.1
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
                            SearchFocusViewModel.this.n1(m.f37012a);
                        }
                    };
                    final SearchFocusViewModel searchFocusViewModel2 = SearchFocusViewModel.this;
                    g00.l<SearchItemModel, wz.p> lVar = new g00.l<SearchItemModel, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchesContainer$1.2
                        {
                            super(1);
                        }

                        public final void b(SearchItemModel item2) {
                            kotlin.jvm.internal.o.i(item2, "item");
                            SearchFocusViewModel.this.n1(new l(item2));
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(SearchItemModel searchItemModel) {
                            b(searchItemModel);
                            return wz.p.f75480a;
                        }
                    };
                    final SearchFocusViewModel searchFocusViewModel3 = SearchFocusViewModel.this;
                    g00.a<wz.p> aVar3 = new g00.a<wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchesContainer$1.3
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
                            SearchFocusViewModel.this.n1(k.f37010a);
                        }
                    };
                    final SearchFocusViewModel searchFocusViewModel4 = SearchFocusViewModel.this;
                    g00.l<SearchItemModel, wz.p> lVar2 = new g00.l<SearchItemModel, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchesContainer$1.4
                        {
                            super(1);
                        }

                        public final void b(SearchItemModel item2) {
                            kotlin.jvm.internal.o.i(item2, "item");
                            SearchFocusViewModel.this.n1(new j(item2));
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(SearchItemModel searchItemModel) {
                            b(searchItemModel);
                            return wz.p.f75480a;
                        }
                    };
                    final SearchFocusViewModel searchFocusViewModel5 = SearchFocusViewModel.this;
                    ItemListContainerKt.e(itemType, U0, f11, g11, aVar2, lVar, aVar3, lVar2, new g00.l<CategoryEntity, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RecentSearchesContainer$1.5
                        {
                            super(1);
                        }

                        public final void b(CategoryEntity it2) {
                            kotlin.jvm.internal.o.i(it2, "it");
                            SearchFocusViewModel.this.n1(new o(SearchFocusViewModel.this.U0().h(), it2, SearchFocusViewModel.this.U0().c()));
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(CategoryEntity categoryEntity) {
                            b(categoryEntity);
                            return wz.p.f75480a;
                        }
                    }, aVar, 4678, 0);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(x.a aVar, androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar, aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            }), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(final SearchItemModel.ItemType itemType, final g00.a<wz.p> aVar, androidx.compose.runtime.a aVar2, final int i11, final int i12) {
            int i13;
            int i14;
            int i15;
            androidx.compose.runtime.a h11 = aVar2.h(-265293545);
            if ((i12 & 1) != 0) {
                i13 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (h11.T(itemType)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i14 | i11;
            } else {
                i13 = i11;
            }
            int i16 = i12 & 2;
            if (i16 != 0) {
                i13 |= 48;
            } else if ((i11 & 112) == 0) {
                if (h11.F(aVar)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i13 |= i15;
            }
            if ((i13 & 91) == 18 && h11.i()) {
                h11.L();
            } else {
                if (i16 != 0) {
                    aVar = null;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-265293545, i13, -1, "com.forsale.app.features.search.RenderHeader (ItemListContainer.kt:144)");
                }
                int i17 = a.f36549a[itemType.ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        h11.C(-1798432417);
                        h11.S();
                    } else {
                        h11.C(-1798432492);
                        d(p1.g.b(y0.f70510ie, h11, 0), null, h11, 0, 2);
                        h11.S();
                    }
                } else {
                    h11.C(-1798432594);
                    f(aVar, h11, (i13 >> 3) & 14, 0);
                    h11.S();
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RenderHeader$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i18) {
                        ItemListContainerKt.i(SearchItemModel.ItemType.this, aVar, aVar3, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(final SearchFocusViewModel.SearchState searchState, final List<SearchItemModel> list, final g00.l<? super SearchItemModel, wz.p> lVar, g00.l<? super SearchItemModel, wz.p> lVar2, androidx.compose.runtime.a aVar, final int i11, final int i12) {
            Object v02;
            androidx.compose.runtime.a h11 = aVar.h(906619808);
            if ((i12 & 8) != 0) {
                lVar2 = null;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(906619808, i11, -1, "com.forsale.app.features.search.RenderItems (ItemListContainer.kt:193)");
            }
            for (SearchItemModel searchItemModel : list) {
                int i13 = a.f36549a[searchItemModel.g().ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        h11.C(-1239299807);
                        h11.S();
                    } else {
                        h11.C(-1239299997);
                        b(searchState.h(), searchItemModel, lVar, h11, (i11 & 896) | 64);
                        h11.S();
                    }
                } else {
                    h11.C(-1239300305);
                    g(searchState.h(), searchItemModel, lVar, lVar2, h11, (i11 & 896) | 64 | (i11 & 7168), 0);
                    h11.S();
                }
                v02 = CollectionsKt___CollectionsKt.v0(list);
                if (!kotlin.jvm.internal.o.d(searchItemModel, v02)) {
                    h11.C(-1239299760);
                    DividersKt.a(PaddingKt.j(androidx.compose.ui.c.f7566a, e2.h.l(16), e2.h.l((float) 4.5d)), 0.0f, 0L, h11, 0, 6);
                    h11.S();
                } else if (searchItemModel.g() == SearchItemModel.ItemType.HISTORY) {
                    h11.C(-1239299612);
                    SpacerKt.a(SizeKt.i(androidx.compose.ui.c.f7566a, e2.h.l(16)), h11, 6);
                    h11.S();
                } else {
                    h11.C(-1239299547);
                    h11.S();
                }
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                final g00.l<? super SearchItemModel, wz.p> lVar3 = lVar2;
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$RenderItems$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i14) {
                        ItemListContainerKt.j(SearchFocusViewModel.SearchState.this, list, lVar, lVar3, aVar2, v0.a(i11 | 1), i12);
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
        public static final void k(final String str, final SearchItemModel searchItemModel, final g00.l<? super SearchItemModel, wz.p> lVar, g00.q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, androidx.compose.runtime.a aVar, final int i11, final int i12) {
            g00.q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar2;
            androidx.compose.runtime.a h11 = aVar.h(1749304507);
            if ((i12 & 8) != 0) {
                qVar2 = null;
            } else {
                qVar2 = qVar;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1749304507, i11, -1, "com.forsale.app.features.search.SearchItem (ItemListContainer.kt:258)");
            }
            androidx.compose.ui.c k11 = PaddingKt.k(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), e2.h.l(16), 0.0f, 2, null);
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = v.j.a();
                h11.u(D);
            }
            h11.S();
            ListItemsKt.a(ClickableKt.c(k11, (v.k) D, null, false, null, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$SearchItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    lVar.invoke(searchItemModel);
                }
            }, 28, null), null, r0.b.b(h11, -1065489613, true, new g00.q<w.t, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$SearchItem$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(w.t ListItem, androidx.compose.runtime.a aVar2, int i13) {
                    kotlin.jvm.internal.o.i(ListItem, "$this$ListItem");
                    if ((i13 & 81) == 16 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1065489613, i13, -1, "com.forsale.app.features.search.SearchItem.<anonymous> (ItemListContainer.kt:270)");
                    }
                    ItemListContainerKt.l(SearchItemModel.this, str, aVar2, ((i11 << 3) & 112) | 8);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(w.t tVar, androidx.compose.runtime.a aVar2, Integer num) {
                    b(tVar, aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            }), r0.b.b(h11, -1489586886, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$SearchItem$4
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    if ((i13 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1489586886, i13, -1, "com.forsale.app.features.search.SearchItem.<anonymous> (ItemListContainer.kt:272)");
                    }
                    String d11 = SearchItemModel.this.d();
                    if (d11 != null) {
                        aVar2.C(693286680);
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        androidx.compose.ui.layout.a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        j0.k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar3);
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
                        g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b11);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        w.u uVar = w.u.f74924a;
                        String b12 = p1.g.b(y0.f70568m5, aVar2, 0);
                        dk.a aVar4 = dk.a.f54291a;
                        int i14 = dk.a.f54292b;
                        yj.d e11 = aVar4.a(aVar2, i14).e();
                        int i15 = yj.d.f76453b;
                        TextKt.a(b12, null, 0, 0, false, 0, 0, null, aVar4.c(aVar2, i14).h(), e11.j(aVar2, i15), 0, aVar2, 0, 0, 1278);
                        TextKt.a(d11, null, 0, 0, false, 0, 0, null, aVar4.c(aVar2, i14).h(), aVar4.a(aVar2, i14).f().i(aVar2, i15), 0, aVar2, 0, 0, 1278);
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            }), null, qVar2, h11, ((i11 << 6) & 458752) | 3456, 18);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                final g00.q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar3 = qVar2;
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$SearchItem$5
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i13) {
                        ItemListContainerKt.k(str, searchItemModel, lVar, qVar3, aVar2, v0.a(i11 | 1), i12);
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
        public static final void l(final SearchItemModel searchItemModel, final String str, androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a h11 = aVar.h(-1329913761);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1329913761, i11, -1, "com.forsale.app.features.search.SearchItemTitle (ItemListContainer.kt:295)");
            }
            int i12 = a.f36549a[searchItemModel.g().ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    h11.C(678396449);
                    h11.S();
                    aVar2 = h11;
                } else {
                    h11.C(678396027);
                    dk.a aVar3 = dk.a.f54291a;
                    int i13 = dk.a.f54292b;
                    androidx.compose.ui.text.a0 c11 = aVar3.c(h11, i13).c();
                    h11.C(678396114);
                    c.a aVar4 = new c.a(0, 1, null);
                    String i14 = searchItemModel.i();
                    yj.d e11 = aVar3.a(h11, i13).e();
                    int i15 = yj.d.f76453b;
                    SpanTextKt.a(aVar4, i14, str, e11.i(h11, i15), aVar3.a(h11, i13).e().m(h11, i15), h11, c.a.f9235f | ((i11 << 3) & 896));
                    androidx.compose.ui.text.c m11 = aVar4.m();
                    h11.S();
                    TextKt.b(m11, null, 0L, 0, 0, false, 0, 0, null, null, c11, h11, 0, 0, 1022);
                    h11.S();
                    aVar2 = h11;
                }
            } else {
                h11.C(678395870);
                aVar2 = h11;
                TextKt.a(searchItemModel.i(), null, 0, 0, false, 0, 0, null, dk.a.f54291a.c(h11, dk.a.f54292b).c(), 0L, 0, h11, 0, 0, 1790);
                aVar2.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = aVar2.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ItemListContainerKt$SearchItemTitle$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i16) {
                        ItemListContainerKt.l(SearchItemModel.this, str, aVar5, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                        b(aVar5, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }
    }
