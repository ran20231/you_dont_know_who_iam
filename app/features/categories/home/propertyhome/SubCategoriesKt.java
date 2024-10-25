package com.forsale.app.features.categories.home.propertyhome;

import androidx.compose.foundation.layout.PaddingKt;
import c0.g;
import coil.compose.AsyncImagePainter;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import com.forsale.app.utils.composeUtils.FixedGridViewKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.layouts.CardSubKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.v0;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: SubCategories.kt */
/* loaded from: classes2.dex */
public final class SubCategoriesKt {
    public static final void a(final boolean z11, final SectionState subCategoriesResponse, final l<? super CategoryEntity, p> subCategoryItemCallBack, androidx.compose.runtime.a aVar, final int i11) {
        final int i12;
        int i13;
        int i14;
        int i15;
        o.i(subCategoriesResponse, "subCategoriesResponse");
        o.i(subCategoryItemCallBack, "subCategoryItemCallBack");
        androidx.compose.runtime.a h11 = aVar.h(256026648);
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
            if (h11.T(subCategoriesResponse)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(subCategoryItemCallBack)) {
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
                androidx.compose.runtime.c.U(256026648, i12, -1, "com.forsale.app.features.categories.home.propertyhome.PropertySubCategories (SubCategories.kt:29)");
            }
            subCategoriesResponse.a(r0.b.b(h11, -482151262, true, new q<SectionState.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$PropertySubCategories$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(SectionState.e result, androidx.compose.runtime.a aVar2, int i16) {
                    List<?> d11;
                    o.i(result, "result");
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-482151262, i16, -1, "com.forsale.app.features.categories.home.propertyhome.PropertySubCategories.<anonymous> (SubCategories.kt:31)");
                    }
                    if (z11) {
                        d11 = r.n();
                    } else {
                        d11 = result.d();
                        o.g(d11, "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.datalayer.database.CategoryEntity>");
                    }
                    boolean z12 = z11;
                    Object valueOf = Boolean.valueOf(z12);
                    final l<CategoryEntity, p> lVar = subCategoryItemCallBack;
                    final boolean z13 = z11;
                    aVar2.C(511388516);
                    boolean T = aVar2.T(valueOf) | aVar2.T(lVar);
                    Object D = aVar2.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: CONSTRUCTOR  (r3v3 'D' java.lang.Object) = 
                              (r2v0 'z13' boolean A[DONT_INLINE])
                              (r1v0 'lVar' g00.l<com.forsale.app.datalayer.database.CategoryEntity, wz.p> A[DONT_INLINE])
                             call: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$PropertySubCategories$1$1$1.<init>(boolean, g00.l):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$PropertySubCategories$1.b(com.forsale.app.features.categories.home.propertyhome.models.SectionState$e, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$PropertySubCategories$1$1$1, state: NOT_LOADED
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
                            java.lang.String r1 = "com.forsale.app.features.categories.home.propertyhome.PropertySubCategories.<anonymous> (SubCategories.kt:31)"
                            r2 = -482151262(0xffffffffe342f4a2, float:-3.596296E21)
                            androidx.compose.runtime.c.U(r2, r7, r0, r1)
                        L14:
                            boolean r7 = r1
                            if (r7 == 0) goto L1d
                            java.util.List r5 = kotlin.collections.p.n()
                            goto L26
                        L1d:
                            java.util.List r5 = r5.d()
                            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.datalayer.database.CategoryEntity>"
                            kotlin.jvm.internal.o.g(r5, r7)
                        L26:
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
                            if (r0 != 0) goto L4d
                            androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r0 = r0.a()
                            if (r3 != r0) goto L55
                        L4d:
                            com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$PropertySubCategories$1$1$1 r3 = new com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$PropertySubCategories$1$1$1
                            r3.<init>(r2, r1)
                            r6.u(r3)
                        L55:
                            r6.S()
                            g00.l r3 = (g00.l) r3
                            int r0 = r3
                            int r0 = r0 << 3
                            r0 = r0 & 112(0x70, float:1.57E-43)
                            r0 = r0 | 8
                            com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt.d(r5, r7, r3, r6, r0)
                            boolean r5 = androidx.compose.runtime.c.I()
                            if (r5 == 0) goto L6e
                            androidx.compose.runtime.c.T()
                        L6e:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$PropertySubCategories$1.b(com.forsale.app.features.categories.home.propertyhome.models.SectionState$e, androidx.compose.runtime.a, int):void");
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
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$PropertySubCategories$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i16) {
                        SubCategoriesKt.a(z11, subCategoriesResponse, subCategoryItemCallBack, aVar2, v0.a(i11 | 1));
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
        public static final void b(final List<CategoryEntity> list, final boolean z11, final l<? super CategoryEntity, p> lVar, androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a h11 = aVar.h(1491040102);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1491040102, i11, -1, "com.forsale.app.features.categories.home.propertyhome.ShowSubcategories (SubCategories.kt:46)");
            }
            Boolean valueOf = Boolean.valueOf(z11);
            h11.C(511388516);
            boolean T = h11.T(valueOf) | h11.T(lVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<CategoryEntity, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$ShowSubcategories$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void b(CategoryEntity it2) {
                        o.i(it2, "it");
                        if (!z11) {
                            lVar.invoke(it2);
                        }
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(CategoryEntity categoryEntity) {
                        b(categoryEntity);
                        return p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            c(list, z11, (l) D, h11, (i11 & 112) | 8);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$ShowSubcategories$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        SubCategoriesKt.b(list, z11, lVar, aVar2, v0.a(i11 | 1));
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
            List<CategoryEntity> list2;
            androidx.compose.runtime.a h11 = aVar.h(-718008895);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-718008895, i11, -1, "com.forsale.app.features.categories.home.propertyhome.SubCategoriesList (SubCategories.kt:80)");
            }
            if (z11) {
                list2 = CategoryEntity.Companion.getMockedCategories(4);
            } else {
                list2 = list;
            }
            float f11 = 12;
            float l11 = h.l(f11);
            float l12 = h.l(f11);
            float f12 = 16;
            FixedGridViewKt.a(list2, 2, PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f12), 0.0f, h.l(f12), 0.0f, 10, null), l12, l11, r0.b.b(h11, 171477242, true, new g00.r<w.c, CategoryEntity, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$SubCategoriesList$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                public final void b(w.c FixedGridView, final CategoryEntity it2, androidx.compose.runtime.a aVar2, int i12) {
                    o.i(FixedGridView, "$this$FixedGridView");
                    o.i(it2, "it");
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(171477242, i12, -1, "com.forsale.app.features.categories.home.propertyhome.SubCategoriesList.<anonymous> (SubCategories.kt:88)");
                    }
                    AsyncImagePainter a11 = h5.d.a(it2.getImage(), null, null, null, 0, aVar2, 0, 30);
                    androidx.compose.ui.c a12 = com.forsale.ui.components.skeleton.a.a(androidx.compose.ui.c.f7566a, z11, g.c(h.l(8)), 0L, 0L, aVar2, (i11 & 112) | 6, 12);
                    final boolean z12 = z11;
                    final l<CategoryEntity, p> lVar2 = lVar;
                    CardSubKt.b(new g00.a<p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$SubCategoriesList$1.1
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
                            if (z12) {
                                return;
                            }
                            lVar2.invoke(it2);
                        }
                    }, r0.b.b(aVar2, -950895865, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$SubCategoriesList$1.2
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i13) {
                            if ((i13 & 11) == 2 && aVar3.i()) {
                                aVar3.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-950895865, i13, -1, "com.forsale.app.features.categories.home.propertyhome.SubCategoriesList.<anonymous>.<anonymous> (SubCategories.kt:89)");
                            }
                            TextKt.a(CategoryEntity.this.getName(), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2046);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return p.f75480a;
                        }
                    }), a11, a12, aVar2, 48, 0);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(w.c cVar, CategoryEntity categoryEntity, androidx.compose.runtime.a aVar2, Integer num) {
                    b(cVar, categoryEntity, aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, 224696, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l13 = h11.l();
            if (l13 != null) {
                l13.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesKt$SubCategoriesList$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        SubCategoriesKt.c(list, z11, lVar, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }
    }
