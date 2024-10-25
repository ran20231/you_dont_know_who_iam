package com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription;

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
import com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem;
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
/* compiled from: DescriptionListingComposeItem.kt */
/* loaded from: classes2.dex */
public final class DescriptionListingComposeItem extends a<ViewHolder, ListingItemBrief, DescriptionListingItemViewModel> {

    /* renamed from: h  reason: collision with root package name */
    private final DescriptionListingItemViewModel f30818h;

    /* renamed from: i  reason: collision with root package name */
    private final s f30819i;

    /* renamed from: j  reason: collision with root package name */
    private final int f30820j;

    /* compiled from: DescriptionListingComposeItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<DescriptionListingComposeItem> {

        /* renamed from: b  reason: collision with root package name */
        public static final int f30821b = ComposeView.f8700x;

        /* renamed from: a  reason: collision with root package name */
        private final ComposeView f30822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ComposeView composeView) {
            super(composeView);
            o.i(composeView, "composeView");
            this.f30822a = composeView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(Context context, ListingItemBrief listingItemBrief, String str, boolean z11, int i11, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, List<Integer> list2) {
            ListingDetailsActivity.R.a(context, (r33 & 1) != 0 ? null : listingItemBrief, (r33 & 2) != 0 ? null : 1000, (r33 & 4) != 0 ? -1 : 0, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : str, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : listingDetailsSearchAnalyticsData, (r33 & 1024) != 0 ? false : z11, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? i11 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : list, (r33 & 8192) == 0 ? listingsAnalytics$FiltersPlace : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : list2);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(final DescriptionListingComposeItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f30822a.setContent(r0.b.c(-119519157, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder$bindView$1$1
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
                        c.U(-119519157, i11, -1, "com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem.ViewHolder.bindView.<anonymous>.<anonymous> (DescriptionListingComposeItem.kt:45)");
                    }
                    final DescriptionListingComposeItem descriptionListingComposeItem = DescriptionListingComposeItem.this;
                    final DescriptionListingComposeItem.ViewHolder viewHolder = this;
                    ThemeKt.a(null, null, r0.b.b(aVar, 1665863380, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder$bindView$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            final DescriptionListingItemViewModel descriptionListingItemViewModel;
                            n1 b11;
                            String str;
                            String str2;
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(1665863380, i12, -1, "com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous> (DescriptionListingComposeItem.kt:46)");
                            }
                            final Context context = (Context) aVar2.q(AndroidCompositionLocals_androidKt.g());
                            descriptionListingItemViewModel = DescriptionListingComposeItem.this.f30818h;
                            final DescriptionListingComposeItem.ViewHolder viewHolder2 = viewHolder;
                            androidx.compose.ui.c j11 = PaddingKt.j(androidx.compose.ui.c.f7566a, h.l(16), h.l(6));
                            String L = descriptionListingItemViewModel.L();
                            LiveData<? extends String> o11 = descriptionListingItemViewModel.o();
                            aVar2.C(-226196656);
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
                            String G = descriptionListingItemViewModel.G();
                            String M = descriptionListingItemViewModel.M();
                            a.C0648a y11 = descriptionListingItemViewModel.y();
                            hk.a N = descriptionListingItemViewModel.N();
                            String str3 = str;
                            CardsKt.a(j11, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ba: INVOKE  
                                  (r17v0 'j11' androidx.compose.ui.c)
                                  (wrap: g00.a<wz.p> : 0x0097: CONSTRUCTOR  (r8v0 g00.a<wz.p> A[REMOVE]) = 
                                  (r4v0 'viewHolder2' com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder A[DONT_INLINE])
                                  (r1v3 'context' android.content.Context A[DONT_INLINE])
                                  (r3v1 'descriptionListingItemViewModel' com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder$bindView$1$1$1$1$1.<init>(com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder, android.content.Context, com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel):void type: CONSTRUCTOR)
                                  (r21v0 'L' java.lang.String)
                                  (null java.lang.String)
                                  (r5v1 'str3' java.lang.String)
                                  (r6v4 'M' java.lang.String)
                                  (wrap: java.lang.String : 0x0088: INVOKE  (r7v4 java.lang.String A[REMOVE]) = 
                                  (r3v1 'descriptionListingItemViewModel' com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel)
                                 type: VIRTUAL call: com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel.T():java.lang.String)
                                  (null java.lang.String)
                                  (null java.lang.String)
                                  (r10v0 'G' java.lang.String)
                                  (r11v0 'y11' hk.a$a)
                                  (null hk.a)
                                  (r13v0 'N' hk.a)
                                  (null hk.a)
                                  (wrap: hk.a$b : 0x0090: INVOKE  (r15v0 hk.a$b A[REMOVE]) = 
                                  (r3v1 'descriptionListingItemViewModel' com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel)
                                 type: VIRTUAL call: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel.A():hk.a$b)
                                  (wrap: java.lang.Integer : 0x008c: INVOKE  (r16v0 java.lang.Integer A[REMOVE]) = 
                                  (r3v1 'descriptionListingItemViewModel' com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel)
                                 type: VIRTUAL call: com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel.V():java.lang.Integer)
                                  (r24v0 'aVar2' androidx.compose.runtime.a)
                                  (0 int)
                                  (wrap: int : 0x00ae: ARITH  (r19v1 int A[REMOVE]) = (wrap: int : 0x00a9: ARITH  (r1v6 int A[REMOVE]) = (wrap: int : 0x00a3: SGET  (r1v5 int A[REMOVE]) =  hk.a.a.c int) | (wrap: int : 0x00a7: ARITH  (r3v3 int A[REMOVE]) = (wrap: int : 0x00a5: SGET  (r19v0 int A[REMOVE]) =  hk.a.b int) << (6 int))) | (wrap: int : 0x00ac: ARITH  (r3v5 int A[REMOVE]) = (wrap: int : 0x00aa: SGET  (r3v4 int A[REMOVE]) =  hk.a.b.c int) << (12 int)))
                                  (10632 int)
                                 type: STATIC call: com.forsale.ui.components.cards.CardsKt.a(androidx.compose.ui.c, g00.a, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, hk.a, hk.a, hk.a, hk.a, hk.a, java.lang.Integer, androidx.compose.runtime.a, int, int, int):void in method: com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder$bindView$1$1.1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder$bindView$1$1$1$1$1, state: NOT_LOADED
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
                                r0 = r23
                                r5 = r24
                                r1 = r25
                                r2 = r1 & 11
                                r3 = 2
                                if (r2 != r3) goto L17
                                boolean r2 = r24.i()
                                if (r2 != 0) goto L12
                                goto L17
                            L12:
                                r24.L()
                                goto Lc6
                            L17:
                                boolean r2 = androidx.compose.runtime.c.I()
                                if (r2 == 0) goto L26
                                r2 = -1
                                java.lang.String r3 = "com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous> (DescriptionListingComposeItem.kt:46)"
                                r4 = 1665863380(0x634b0ed4, float:3.7457575E21)
                                androidx.compose.runtime.c.U(r4, r1, r2, r3)
                            L26:
                                j0.s0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                                java.lang.Object r1 = r5.q(r1)
                                android.content.Context r1 = (android.content.Context) r1
                                com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem r2 = com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem.this
                                com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel r3 = com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem.w(r2)
                                com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder r4 = r2
                                androidx.compose.ui.c$a r2 = androidx.compose.ui.c.f7566a
                                r14 = 6
                                float r6 = (float) r14
                                float r6 = e2.h.l(r6)
                                r7 = 16
                                float r7 = (float) r7
                                float r7 = e2.h.l(r7)
                                androidx.compose.ui.c r17 = androidx.compose.foundation.layout.PaddingKt.j(r2, r7, r6)
                                java.lang.String r21 = r3.L()
                                androidx.lifecycle.LiveData r2 = r3.o()
                                r6 = -226196656(0xfffffffff2848350, float:-5.2493784E30)
                                r5.C(r6)
                                java.lang.String r6 = ""
                                if (r2 != 0) goto L5f
                                r2 = 0
                                goto L65
                            L5f:
                                r7 = 56
                                j0.n1 r2 = androidx.compose.runtime.livedata.LiveDataAdapterKt.b(r2, r6, r5, r7)
                            L65:
                                r24.S()
                                if (r2 == 0) goto L76
                                java.lang.Object r2 = r2.getValue()
                                java.lang.String r2 = (java.lang.String) r2
                                if (r2 != 0) goto L73
                                goto L76
                            L73:
                                r22 = r2
                                goto L78
                            L76:
                                r22 = r6
                            L78:
                                java.lang.String r10 = r3.G()
                                java.lang.String r6 = r3.M()
                                hk.a$a r11 = r3.y()
                                hk.a r13 = r3.N()
                                java.lang.String r7 = r3.T()
                                java.lang.Integer r16 = r3.V()
                                hk.a$b r15 = r3.A()
                                com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder$bindView$1$1$1$1$1 r8 = new com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder$bindView$1$1$1$1$1
                                r2 = r8
                                r8.<init>(r4, r1, r3)
                                r4 = 0
                                r8 = 0
                                r9 = 0
                                r12 = 0
                                r1 = 0
                                r3 = r14
                                r14 = r1
                                r18 = 0
                                int r1 = hk.a.C0648a.f57518c
                                int r19 = hk.a.f57516b
                                int r3 = r19 << 6
                                r1 = r1 | r3
                                int r3 = hk.a.b.f57519c
                                int r3 = r3 << 12
                                r19 = r1 | r3
                                r20 = 10632(0x2988, float:1.4899E-41)
                                r1 = r17
                                r3 = r21
                                r5 = r22
                                r17 = r24
                                com.forsale.ui.components.cards.CardsKt.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                                boolean r1 = androidx.compose.runtime.c.I()
                                if (r1 == 0) goto Lc6
                                androidx.compose.runtime.c.T()
                            Lc6:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingComposeItem$ViewHolder$bindView$1$1.AnonymousClass1.b(androidx.compose.runtime.a, int):void");
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
        public void e(DescriptionListingComposeItem item) {
            o.i(item, "item");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptionListingComposeItem(DescriptionListingItemViewModel viewModel, s lo2) {
        super(viewModel, lo2);
        o.i(viewModel, "viewModel");
        o.i(lo2, "lo");
        this.f30818h = viewModel;
        this.f30819i = lo2;
        this.f30820j = t0.f70228i3;
    }

    @Override // pr.a
    public int t() {
        return this.f30820j;
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
