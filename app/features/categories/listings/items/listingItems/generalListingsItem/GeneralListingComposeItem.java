package com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.c;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.cards.CardsKt;
import com.google.android.gms.ads.AdRequest;
import e2.h;
import g00.p;
import hk.a;
import j0.n1;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kr.b;
import okhttp3.internal.http2.Http2;
import qc.a;
import t9.t0;
/* compiled from: GeneralListingComposeItem.kt */
/* loaded from: classes2.dex */
public final class GeneralListingComposeItem extends a<ViewHolder, ListingItemBrief, GeneralListingItemViewModel> {

    /* renamed from: h  reason: collision with root package name */
    private final GeneralListingItemViewModel f30833h;

    /* renamed from: i  reason: collision with root package name */
    private final s f30834i;

    /* renamed from: j  reason: collision with root package name */
    private final int f30835j;

    /* compiled from: GeneralListingComposeItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<GeneralListingComposeItem> {

        /* renamed from: b  reason: collision with root package name */
        public static final int f30836b = ComposeView.f8700x;

        /* renamed from: a  reason: collision with root package name */
        private final ComposeView f30837a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ComposeView composeView) {
            super(composeView);
            o.i(composeView, "composeView");
            this.f30837a = composeView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(Context context, ListingItemBrief listingItemBrief, String str, boolean z11, int i11, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, List<Integer> list2) {
            ListingDetailsActivity.R.a(context, (r33 & 1) != 0 ? null : listingItemBrief, (r33 & 2) != 0 ? null : 1000, (r33 & 4) != 0 ? -1 : 0, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : str, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : listingDetailsSearchAnalyticsData, (r33 & 1024) != 0 ? false : z11, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? i11 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : list, (r33 & 8192) == 0 ? listingsAnalytics$FiltersPlace : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : list2);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(final GeneralListingComposeItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f30837a.setContent(r0.b.c(-2125429336, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder$bindView$1$1
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
                        c.U(-2125429336, i11, -1, "com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem.ViewHolder.bindView.<anonymous>.<anonymous> (GeneralListingComposeItem.kt:45)");
                    }
                    final GeneralListingComposeItem generalListingComposeItem = GeneralListingComposeItem.this;
                    final GeneralListingComposeItem.ViewHolder viewHolder = this;
                    ThemeKt.a(null, null, r0.b.b(aVar, 82280433, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder$bindView$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            final GeneralListingItemViewModel generalListingItemViewModel;
                            n1 b11;
                            String str;
                            String str2;
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(82280433, i12, -1, "com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous> (GeneralListingComposeItem.kt:46)");
                            }
                            final Context context = (Context) aVar2.q(AndroidCompositionLocals_androidKt.g());
                            generalListingItemViewModel = GeneralListingComposeItem.this.f30833h;
                            final GeneralListingComposeItem.ViewHolder viewHolder2 = viewHolder;
                            androidx.compose.ui.c j11 = PaddingKt.j(androidx.compose.ui.c.f7566a, h.l(16), h.l(6));
                            String L = generalListingItemViewModel.L();
                            LiveData<? extends String> o11 = generalListingItemViewModel.o();
                            aVar2.C(1896347508);
                            String str3 = "";
                            if (o11 == null) {
                                b11 = null;
                            } else {
                                b11 = LiveDataAdapterKt.b(o11, "", aVar2, 56);
                            }
                            aVar2.S();
                            if (b11 == null || (str2 = (String) b11.getValue()) == null) {
                                str = "";
                            } else {
                                str = str2;
                            }
                            String G = generalListingItemViewModel.G();
                            String M = generalListingItemViewModel.M();
                            a.C0648a y11 = generalListingItemViewModel.y();
                            hk.a N = generalListingItemViewModel.N();
                            String T = generalListingItemViewModel.T();
                            a.b A = generalListingItemViewModel.A();
                            Integer V = generalListingItemViewModel.V();
                            String D = generalListingItemViewModel.D();
                            if (D != null) {
                                str3 = D;
                            }
                            CardsKt.a(j11, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c5: INVOKE  
                                  (r6v2 'j11' androidx.compose.ui.c)
                                  (wrap: g00.a<wz.p> : 0x009d: CONSTRUCTOR  (r9v1 g00.a<wz.p> A[REMOVE]) = 
                                  (r4v0 'viewHolder2' com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder A[DONT_INLINE])
                                  (r1v3 'context' android.content.Context A[DONT_INLINE])
                                  (r3v1 'generalListingItemViewModel' com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingItemViewModel A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder$bindView$1$1$1$1$1.<init>(com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder, android.content.Context, com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingItemViewModel):void type: CONSTRUCTOR)
                                  (r7v3 'L' java.lang.String)
                                  (null java.lang.String)
                                  (r10v1 'str' java.lang.String)
                                  (r13v0 'M' java.lang.String)
                                  (r21v0 'T' java.lang.String)
                                  (r8v2 'str3' java.lang.String)
                                  (null java.lang.String)
                                  (r11v0 'G' java.lang.String)
                                  (r16v0 'y11' hk.a$a)
                                  (null hk.a)
                                  (r17v0 'N' hk.a)
                                  (null hk.a)
                                  (r22v0 'A' hk.a$b)
                                  (r23v0 'V' java.lang.Integer)
                                  (r25v0 'aVar2' androidx.compose.runtime.a)
                                  (0 int)
                                  (wrap: int : 0x00b0: ARITH  (r19v0 int A[REMOVE]) = (wrap: int : 0x00ab: ARITH  (r1v5 int A[REMOVE]) = (wrap: int : 0x00a6: SGET  (r1v4 int A[REMOVE]) =  hk.a.a.c int) | (wrap: int : 0x00aa: ARITH  (r3v3 int A[REMOVE]) = (wrap: int : 0x00a8: SGET  (r3v2 int A[REMOVE]) =  hk.a.b int) << (6 int))) | (wrap: int : 0x00ae: ARITH  (r3v5 int A[REMOVE]) = (wrap: int : 0x00ac: SGET  (r3v4 int A[REMOVE]) =  hk.a.b.c int) << (12 int)))
                                  (10504 int)
                                 type: STATIC call: com.forsale.ui.components.cards.CardsKt.a(androidx.compose.ui.c, g00.a, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, hk.a, hk.a, hk.a, hk.a, hk.a, java.lang.Integer, androidx.compose.runtime.a, int, int, int):void in method: com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder$bindView$1$1.1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder$bindView$1$1$1$1$1, state: NOT_LOADED
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
                                this = this;
                                r0 = r24
                                r15 = r25
                                r1 = r26
                                r2 = r1 & 11
                                r3 = 2
                                if (r2 != r3) goto L17
                                boolean r2 = r25.i()
                                if (r2 != 0) goto L12
                                goto L17
                            L12:
                                r25.L()
                                goto Ld1
                            L17:
                                boolean r2 = androidx.compose.runtime.c.I()
                                if (r2 == 0) goto L26
                                r2 = -1
                                java.lang.String r3 = "com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous> (GeneralListingComposeItem.kt:46)"
                                r4 = 82280433(0x4e77ff1, float:5.4425335E-36)
                                androidx.compose.runtime.c.U(r4, r1, r2, r3)
                            L26:
                                j0.s0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                                java.lang.Object r1 = r15.q(r1)
                                android.content.Context r1 = (android.content.Context) r1
                                com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem r2 = com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem.this
                                com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingItemViewModel r3 = com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem.w(r2)
                                com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder r4 = r2
                                androidx.compose.ui.c$a r2 = androidx.compose.ui.c.f7566a
                                r5 = 6
                                float r6 = (float) r5
                                float r6 = e2.h.l(r6)
                                r7 = 16
                                float r7 = (float) r7
                                float r7 = e2.h.l(r7)
                                androidx.compose.ui.c r6 = androidx.compose.foundation.layout.PaddingKt.j(r2, r7, r6)
                                java.lang.String r7 = r3.L()
                                androidx.lifecycle.LiveData r2 = r3.o()
                                r8 = 1896347508(0x7107f774, float:6.7327406E29)
                                r15.C(r8)
                                java.lang.String r8 = ""
                                if (r2 != 0) goto L5f
                                r2 = 0
                                goto L65
                            L5f:
                                r9 = 56
                                j0.n1 r2 = androidx.compose.runtime.livedata.LiveDataAdapterKt.b(r2, r8, r15, r9)
                            L65:
                                r25.S()
                                if (r2 == 0) goto L75
                                java.lang.Object r2 = r2.getValue()
                                java.lang.String r2 = (java.lang.String) r2
                                if (r2 != 0) goto L73
                                goto L75
                            L73:
                                r10 = r2
                                goto L76
                            L75:
                                r10 = r8
                            L76:
                                java.lang.String r11 = r3.G()
                                java.lang.String r13 = r3.M()
                                hk.a$a r16 = r3.y()
                                hk.a r17 = r3.N()
                                java.lang.String r21 = r3.T()
                                hk.a$b r22 = r3.A()
                                java.lang.Integer r23 = r3.V()
                                java.lang.String r2 = r3.D()
                                if (r2 != 0) goto L99
                                goto L9a
                            L99:
                                r8 = r2
                            L9a:
                                com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder$bindView$1$1$1$1$1 r9 = new com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder$bindView$1$1$1$1$1
                                r2 = r9
                                r9.<init>(r4, r1, r3)
                                r4 = 0
                                r9 = 0
                                r12 = 0
                                r14 = 0
                                r18 = 0
                                int r1 = hk.a.C0648a.f57518c
                                int r3 = hk.a.f57516b
                                int r3 = r3 << r5
                                r1 = r1 | r3
                                int r3 = hk.a.b.f57519c
                                int r3 = r3 << 12
                                r19 = r1 | r3
                                r20 = 10504(0x2908, float:1.4719E-41)
                                r1 = r6
                                r3 = r7
                                r5 = r10
                                r6 = r13
                                r7 = r21
                                r10 = r11
                                r11 = r16
                                r13 = r17
                                r15 = r22
                                r16 = r23
                                r17 = r25
                                com.forsale.ui.components.cards.CardsKt.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                                boolean r1 = androidx.compose.runtime.c.I()
                                if (r1 == 0) goto Ld1
                                androidx.compose.runtime.c.T()
                            Ld1:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingComposeItem$ViewHolder$bindView$1$1.AnonymousClass1.b(androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    }), aVar, 384, 3);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                    b(aVar, num.intValue());
                    return wz.p.f75480a;
                }
            }));
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void e(GeneralListingComposeItem item) {
            o.i(item, "item");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingComposeItem(GeneralListingItemViewModel viewModel, s lo2) {
        super(viewModel, lo2);
        o.i(viewModel, "viewModel");
        o.i(lo2, "lo");
        this.f30833h = viewModel;
        this.f30834i = lo2;
        this.f30835j = t0.f70228i3;
    }

    @Override // pr.a
    public int t() {
        return this.f30835j;
    }

    @Override // pr.a
    /* renamed from: x */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        Context context = v11.getContext();
        o.h(context, "getContext(...)");
        return new ViewHolder(new ComposeView(context, null, 0, 6, null));
    }
}
