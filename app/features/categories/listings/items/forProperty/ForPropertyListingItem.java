package com.forsale.app.features.categories.listings.items.forProperty;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.c;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem;
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
/* compiled from: ForPropertyListingItem.kt */
/* loaded from: classes2.dex */
public final class ForPropertyListingItem extends a<ViewHolder, ListingItemBrief, ForPropertyListingItemViewModel> {

    /* renamed from: h  reason: collision with root package name */
    private final ForPropertyListingItemViewModel f30702h;

    /* renamed from: i  reason: collision with root package name */
    private final s f30703i;

    /* compiled from: ForPropertyListingItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<ForPropertyListingItem> {

        /* renamed from: b  reason: collision with root package name */
        public static final int f30704b = ComposeView.f8700x;

        /* renamed from: a  reason: collision with root package name */
        private final ComposeView f30705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ComposeView composeView) {
            super(composeView);
            o.i(composeView, "composeView");
            this.f30705a = composeView;
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f8797b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(Context context, ListingItemBrief listingItemBrief, String str, boolean z11, int i11, List<Integer> list) {
            ListingDetailsActivity.R.a(context, (r33 & 1) != 0 ? null : listingItemBrief, (r33 & 2) != 0 ? null : 1000, (r33 & 4) != 0 ? -1 : 0, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : str, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : z11, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? i11 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : list);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(final ForPropertyListingItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f30705a.setContent(r0.b.c(1806851028, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder$bindView$1$1
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
                        c.U(1806851028, i11, -1, "com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem.ViewHolder.bindView.<anonymous>.<anonymous> (ForPropertyListingItem.kt:50)");
                    }
                    final ForPropertyListingItem forPropertyListingItem = ForPropertyListingItem.this;
                    final ForPropertyListingItem.ViewHolder viewHolder = this;
                    ThemeKt.a(null, null, r0.b.b(aVar, 614353885, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder$bindView$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            final ForPropertyListingItemViewModel forPropertyListingItemViewModel;
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(614353885, i12, -1, "com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous> (ForPropertyListingItem.kt:51)");
                            }
                            final Context context = (Context) aVar2.q(AndroidCompositionLocals_androidKt.g());
                            forPropertyListingItemViewModel = ForPropertyListingItem.this.f30702h;
                            final ForPropertyListingItem.ViewHolder viewHolder2 = viewHolder;
                            androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, h.l(12), 0.0f, 0.0f, 13, null);
                            String L = forPropertyListingItemViewModel.L();
                            n1 a11 = LiveDataAdapterKt.a(forPropertyListingItemViewModel.r(), aVar2, 8);
                            String str = (a11 == null || (str = (String) a11.getValue()) == null) ? "" : "";
                            String G = forPropertyListingItemViewModel.G();
                            String D = forPropertyListingItemViewModel.D();
                            a.C0648a y11 = forPropertyListingItemViewModel.y();
                            hk.a N = forPropertyListingItemViewModel.N();
                            CardsKt.b(m11, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ae: INVOKE  
                                  (r17v0 'm11' androidx.compose.ui.c)
                                  (wrap: g00.a<wz.p> : 0x008a: CONSTRUCTOR  (r9v1 g00.a<wz.p> A[REMOVE]) = 
                                  (r4v0 'viewHolder2' com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder A[DONT_INLINE])
                                  (r1v3 'context' android.content.Context A[DONT_INLINE])
                                  (r3v1 'forPropertyListingItemViewModel' com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder$bindView$1$1$1$1$1.<init>(com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder, android.content.Context, com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel):void type: CONSTRUCTOR)
                                  (r21v0 'L' java.lang.String)
                                  (null java.lang.String)
                                  (r2v7 'str' java.lang.String)
                                  (wrap: java.lang.String : 0x0077: INVOKE  (r6v2 java.lang.String A[REMOVE]) = 
                                  (r3v1 'forPropertyListingItemViewModel' com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel)
                                 type: VIRTUAL call: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel.M():java.lang.String)
                                  (wrap: java.util.List<java.lang.String> : 0x007b: INVOKE  (r7v1 java.util.List<java.lang.String> A[REMOVE]) = 
                                  (r3v1 'forPropertyListingItemViewModel' com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel)
                                 type: VIRTUAL call: com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel.U():java.util.List)
                                  (r8v1 'D' java.lang.String)
                                  (null java.lang.String)
                                  (r10v1 'G' java.lang.String)
                                  (r11v1 'y11' hk.a$a)
                                  (null hk.a)
                                  (r13v0 'N' hk.a)
                                  (null hk.a)
                                  (wrap: hk.a$b : 0x0083: INVOKE  (r15v0 hk.a$b A[REMOVE]) = 
                                  (r3v1 'forPropertyListingItemViewModel' com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel)
                                 type: VIRTUAL call: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel.A():hk.a$b)
                                  (wrap: java.lang.Integer : 0x007f: INVOKE  (r16v0 java.lang.Integer A[REMOVE]) = 
                                  (r3v1 'forPropertyListingItemViewModel' com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel)
                                 type: VIRTUAL call: com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel.V():java.lang.Integer)
                                  (r24v0 'aVar2' androidx.compose.runtime.a)
                                  (2097158 int)
                                  (wrap: int : 0x00a2: ARITH  (r19v3 int A[REMOVE]) = (wrap: int : 0x009c: ARITH  (r1v6 int A[REMOVE]) = (wrap: int : 0x0096: SGET  (r1v5 int A[REMOVE]) =  hk.a.a.c int) | (wrap: int : 0x009a: ARITH  (r19v1 int A[REMOVE]) = (wrap: int : 0x0098: SGET  (r19v0 int A[REMOVE]) =  hk.a.b int) << (6 int))) | (wrap: int : 0x00a0: ARITH  (r3v3 int A[REMOVE]) = (wrap: int : 0x009e: SGET  (r19v2 int A[REMOVE]) =  hk.a.b.c int) << (12 int)))
                                  (10504 int)
                                 type: STATIC call: com.forsale.ui.components.cards.CardsKt.b(androidx.compose.ui.c, g00.a, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, hk.a, hk.a, hk.a, hk.a, hk.a, java.lang.Integer, androidx.compose.runtime.a, int, int, int):void in method: com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder$bindView$1$1.1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder$bindView$1$1$1$1$1, state: NOT_LOADED
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
                                goto Lba
                            L17:
                                boolean r2 = androidx.compose.runtime.c.I()
                                if (r2 == 0) goto L26
                                r2 = -1
                                java.lang.String r3 = "com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous> (ForPropertyListingItem.kt:51)"
                                r4 = 614353885(0x249e4bdd, float:6.8650095E-17)
                                androidx.compose.runtime.c.U(r4, r1, r2, r3)
                            L26:
                                j0.s0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                                java.lang.Object r1 = r5.q(r1)
                                android.content.Context r1 = (android.content.Context) r1
                                com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem r2 = com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem.this
                                com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel r3 = com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem.w(r2)
                                com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder r4 = r2
                                androidx.compose.ui.c$a r6 = androidx.compose.ui.c.f7566a
                                r7 = 0
                                r14 = 12
                                float r2 = (float) r14
                                float r8 = e2.h.l(r2)
                                r9 = 0
                                r10 = 0
                                r11 = 13
                                r12 = 0
                                androidx.compose.ui.c r17 = androidx.compose.foundation.layout.PaddingKt.m(r6, r7, r8, r9, r10, r11, r12)
                                java.lang.String r21 = r3.L()
                                androidx.lifecycle.LiveData r2 = r3.r()
                                r6 = 8
                                j0.n1 r2 = androidx.compose.runtime.livedata.LiveDataAdapterKt.a(r2, r5, r6)
                                if (r2 == 0) goto L63
                                java.lang.Object r2 = r2.getValue()
                                java.lang.String r2 = (java.lang.String) r2
                                if (r2 != 0) goto L65
                            L63:
                                java.lang.String r2 = ""
                            L65:
                                r22 = r2
                                java.lang.String r10 = r3.G()
                                java.lang.String r8 = r3.D()
                                hk.a$a r11 = r3.y()
                                hk.a r13 = r3.N()
                                java.lang.String r6 = r3.M()
                                java.util.List r7 = r3.U()
                                java.lang.Integer r16 = r3.V()
                                hk.a$b r15 = r3.A()
                                com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder$bindView$1$1$1$1$1 r9 = new com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder$bindView$1$1$1$1$1
                                r2 = r9
                                r9.<init>(r4, r1, r3)
                                r4 = 0
                                r9 = 0
                                r12 = 0
                                r1 = 0
                                r3 = r14
                                r14 = r1
                                r18 = 2097158(0x200006, float:2.938744E-39)
                                int r1 = hk.a.C0648a.f57518c
                                int r19 = hk.a.f57516b
                                int r19 = r19 << 6
                                r1 = r1 | r19
                                int r19 = hk.a.b.f57519c
                                int r3 = r19 << 12
                                r19 = r1 | r3
                                r20 = 10504(0x2908, float:1.4719E-41)
                                r1 = r17
                                r3 = r21
                                r5 = r22
                                r17 = r24
                                com.forsale.ui.components.cards.CardsKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                                boolean r1 = androidx.compose.runtime.c.I()
                                if (r1 == 0) goto Lba
                                androidx.compose.runtime.c.T()
                            Lba:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItem$ViewHolder$bindView$1$1.AnonymousClass1.b(androidx.compose.runtime.a, int):void");
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
        public void e(ForPropertyListingItem item) {
            o.i(item, "item");
            this.f30705a.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForPropertyListingItem(ForPropertyListingItemViewModel viewModel, s lo2) {
        super(viewModel, lo2);
        o.i(viewModel, "viewModel");
        o.i(lo2, "lo");
        this.f30702h = viewModel;
        this.f30703i = lo2;
    }

    @Override // pr.a
    public int t() {
        return t0.f70228i3;
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
