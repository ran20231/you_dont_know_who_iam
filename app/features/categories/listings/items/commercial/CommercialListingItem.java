package com.forsale.app.features.categories.listings.items.commercial;

import aa.qd;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.DetailsIntention;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.LifecycleAware$ViewHolder;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import qc.a;
import t9.t0;
import wz.p;
/* compiled from: CommercialListingItem.kt */
/* loaded from: classes2.dex */
public final class CommercialListingItem extends a<ViewHolder, ListingItemBrief, rc.a> {

    /* renamed from: h  reason: collision with root package name */
    private final rc.a f30595h;

    /* compiled from: CommercialListingItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends LifecycleAware$ViewHolder<CommercialListingItem, qd> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(qd binding) {
            super(binding);
            o.i(binding, "binding");
        }

        @Override // com.forsale.app.utils.LifecycleAware$ViewHolder, kr.b.c
        /* renamed from: j */
        public void b(final CommercialListingItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            super.b(item, payloads);
            qd f11 = f();
            f11.h0(item.f30595h);
            f11.u();
            item.f30595h.f().h(g(), new FlowCollector<AdsModel>() { // from class: com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder$bindView$2
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(AdsModel adsModel, zz.a<? super p> aVar) {
                    qd f12;
                    qd f13;
                    Integer num;
                    if (adsModel != null) {
                        f12 = CommercialListingItem.ViewHolder.this.f();
                        final d l11 = ContextExtensionsKt.l(f12.getRoot().getContext());
                        if (l11 != null) {
                            final CommercialListingItem.ViewHolder viewHolder = CommercialListingItem.ViewHolder.this;
                            CommercialListingItem commercialListingItem = item;
                            f13 = viewHolder.f();
                            Context context = f13.getRoot().getContext();
                            FragmentManager supportFragmentManager = l11.getSupportFragmentManager();
                            CommercialItemDetailsSource commercialItemDetailsSource = CommercialItemDetailsSource.LISTINGS;
                            DetailsIntention detailsIntention = DetailsIntention.DETAILS_ONLY;
                            CategoryEntity g11 = commercialListingItem.f30595h.g();
                            Integer num2 = null;
                            if (g11 != null) {
                                num = kotlin.coroutines.jvm.internal.a.d(g11.getId());
                            } else {
                                num = null;
                            }
                            Integer a11 = commercialListingItem.f30595h.a();
                            if (a11 != null) {
                                num2 = kotlin.coroutines.jvm.internal.a.d(a11.intValue() + 1);
                            }
                            com.forsale.adserver.view.screens.detailsScreen.a aVar2 = new com.forsale.adserver.view.screens.detailsScreen.a(null, null, null, num2, null, num, null, null, null, 471, null);
                            o.f(context);
                            l<CommercialPageSource, p> lVar = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: CONSTRUCTOR  (r3v3 'lVar' g00.l<com.forsale.analytics.commercial.CommercialPageSource, wz.p>) = 
                                  (r1v5 'l11' androidx.appcompat.app.d A[DONT_INLINE])
                                  (r2v0 'viewHolder' com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder$bindView$2$emit$2$1.<init>(androidx.appcompat.app.d, com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder$bindView$2.a(com.forsale.adserver.view.models.AdsModel, zz.a<? super wz.p>):java.lang.Object, file: classes2.dex
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
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder$bindView$2$emit$2$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 27 more
                                */
                            /*
                                this = this;
                                r0 = r22
                                if (r23 == 0) goto L8a
                                com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder r1 = com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem.ViewHolder.this
                                aa.qd r1 = com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem.ViewHolder.i(r1)
                                android.view.View r1 = r1.getRoot()
                                android.content.Context r1 = r1.getContext()
                                androidx.appcompat.app.d r1 = com.forsale.app.utils.ContextExtensionsKt.l(r1)
                                if (r1 == 0) goto L8a
                                com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder r2 = com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem.ViewHolder.this
                                com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem r3 = r2
                                aa.qd r4 = com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem.ViewHolder.i(r2)
                                android.view.View r4 = r4.getRoot()
                                android.content.Context r4 = r4.getContext()
                                androidx.fragment.app.FragmentManager r5 = r1.getSupportFragmentManager()
                                com.forsale.analytics.commercial.CommercialItemDetailsSource r7 = com.forsale.analytics.commercial.CommercialItemDetailsSource.LISTINGS
                                com.forsale.adserver.view.models.DetailsIntention r6 = com.forsale.adserver.view.models.DetailsIntention.DETAILS_ONLY
                                rc.a r8 = com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem.w(r3)
                                com.forsale.app.datalayer.database.CategoryEntity r8 = r8.g()
                                r9 = 0
                                if (r8 == 0) goto L46
                                int r8 = r8.getId()
                                java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.d(r8)
                                r16 = r8
                                goto L48
                            L46:
                                r16 = r9
                            L48:
                                rc.a r3 = com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem.w(r3)
                                java.lang.Integer r3 = r3.a()
                                if (r3 == 0) goto L5c
                                int r3 = r3.intValue()
                                int r3 = r3 + 1
                                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.a.d(r3)
                            L5c:
                                r14 = r9
                                com.forsale.adserver.view.screens.detailsScreen.a r8 = new com.forsale.adserver.view.screens.detailsScreen.a
                                r11 = 0
                                r12 = 0
                                r13 = 0
                                r15 = 0
                                r17 = 0
                                r18 = 0
                                r19 = 0
                                r20 = 471(0x1d7, float:6.6E-43)
                                r21 = 0
                                r10 = r8
                                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                                kotlin.jvm.internal.o.f(r4)
                                com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder$bindView$2$emit$2$1 r3 = new com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder$bindView$2$emit$2$1
                                r3.<init>(r1, r2)
                                r9 = 0
                                kotlin.jvm.internal.o.f(r5)
                                r10 = 0
                                r11 = 132(0x84, float:1.85E-43)
                                r1 = r4
                                r2 = r23
                                r4 = r9
                                r9 = r10
                                r10 = r11
                                r11 = r12
                                com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                            L8a:
                                wz.p r1 = wz.p.f75480a
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.commercial.CommercialListingItem$ViewHolder$bindView$2.emit(com.forsale.adserver.view.models.AdsModel, zz.a):java.lang.Object");
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CommercialListingItem(rc.a viewModel, s lo2) {
                super(viewModel, lo2);
                o.i(viewModel, "viewModel");
                o.i(lo2, "lo");
                this.f30595h = viewModel;
            }

            @Override // pr.a
            public int t() {
                return t0.Z2;
            }

            @Override // pr.a
            /* renamed from: x */
            public ViewHolder u(View v11) {
                o.i(v11, "v");
                qd f02 = qd.f0(v11);
                o.h(f02, "bind(...)");
                return new ViewHolder(f02);
            }
        }
