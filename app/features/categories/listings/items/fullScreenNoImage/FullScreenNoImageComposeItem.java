package com.forsale.app.features.categories.listings.items.fullScreenNoImage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import e2.h;
import g00.p;
import j0.n1;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kr.b;
import okhttp3.internal.http2.Http2;
import qc.a;
import t9.t0;
import yc.b;
/* compiled from: FullScreenNoImageComposeItem.kt */
/* loaded from: classes2.dex */
public final class FullScreenNoImageComposeItem extends a<ViewHolder, ListingItemBrief, b> {

    /* renamed from: h  reason: collision with root package name */
    private final b f30715h;

    /* renamed from: i  reason: collision with root package name */
    private final s f30716i;

    /* renamed from: j  reason: collision with root package name */
    private final int f30717j;

    /* compiled from: FullScreenNoImageComposeItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<FullScreenNoImageComposeItem> {

        /* renamed from: b  reason: collision with root package name */
        public static final int f30718b = ComposeView.f8700x;

        /* renamed from: a  reason: collision with root package name */
        private final ComposeView f30719a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ComposeView composeView) {
            super(composeView);
            o.i(composeView, "composeView");
            this.f30719a = composeView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(Context context, ListingItemBrief listingItemBrief, String str, int i11, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, List<Integer> list) {
            ListingDetailsActivity.R.a(context, (r33 & 1) != 0 ? null : listingItemBrief, (r33 & 2) != 0 ? null : 1000, (r33 & 4) != 0 ? -1 : 0, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : str, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : listingDetailsSearchAnalyticsData, (r33 & 1024) != 0 ? false : false, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? i11 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : list);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(final FullScreenNoImageComposeItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f30719a.setContent(r0.b.c(2078152256, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder$bindView$1$1
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
                        c.U(2078152256, i11, -1, "com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem.ViewHolder.bindView.<anonymous>.<anonymous> (FullScreenNoImageComposeItem.kt:39)");
                    }
                    final FullScreenNoImageComposeItem fullScreenNoImageComposeItem = FullScreenNoImageComposeItem.this;
                    final FullScreenNoImageComposeItem.ViewHolder viewHolder = this;
                    ThemeKt.a(null, null, r0.b.b(aVar, -777209015, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder$bindView$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            final yc.b bVar;
                            n1 a11;
                            String str;
                            String str2;
                            String str3;
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(-777209015, i12, -1, "com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous> (FullScreenNoImageComposeItem.kt:40)");
                            }
                            final Context context = (Context) aVar2.q(AndroidCompositionLocals_androidKt.g());
                            bVar = FullScreenNoImageComposeItem.this.f30715h;
                            final FullScreenNoImageComposeItem.ViewHolder viewHolder2 = viewHolder;
                            androidx.compose.ui.c j11 = PaddingKt.j(androidx.compose.ui.c.f7566a, h.l(16), h.l(6));
                            g00.a<wz.p> aVar3 = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: CONSTRUCTOR  (r5v3 'aVar3' g00.a<wz.p>) = 
                                  (r3v1 'viewHolder2' com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder A[DONT_INLINE])
                                  (r1v3 'context' android.content.Context A[DONT_INLINE])
                                  (r2v3 'bVar' yc.b A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder$bindView$1$1$1$1$1.<init>(com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder, android.content.Context, yc.b):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder$bindView$1$1.1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder$bindView$1$1$1$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 19 more
                                */
                            /*
                                this = this;
                                r0 = r20
                                r13 = r21
                                r1 = r22
                                r2 = r1 & 11
                                r3 = 2
                                if (r2 != r3) goto L17
                                boolean r2 = r21.i()
                                if (r2 != 0) goto L12
                                goto L17
                            L12:
                                r21.L()
                                goto Lc8
                            L17:
                                boolean r2 = androidx.compose.runtime.c.I()
                                if (r2 == 0) goto L26
                                r2 = -1
                                java.lang.String r3 = "com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem.ViewHolder.bindView.<anonymous>.<anonymous>.<anonymous> (FullScreenNoImageComposeItem.kt:40)"
                                r4 = -777209015(0xffffffffd1acbb49, float:-9.2734562E10)
                                androidx.compose.runtime.c.U(r4, r1, r2, r3)
                            L26:
                                j0.s0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                                java.lang.Object r1 = r13.q(r1)
                                android.content.Context r1 = (android.content.Context) r1
                                com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem r2 = com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem.this
                                yc.b r2 = com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem.w(r2)
                                com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder r3 = r2
                                androidx.compose.ui.c$a r4 = androidx.compose.ui.c.f7566a
                                r5 = 6
                                float r5 = (float) r5
                                float r5 = e2.h.l(r5)
                                r6 = 16
                                float r6 = (float) r6
                                float r6 = e2.h.l(r6)
                                androidx.compose.ui.c r4 = androidx.compose.foundation.layout.PaddingKt.j(r4, r6, r5)
                                com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder$bindView$1$1$1$1$1 r5 = new com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder$bindView$1$1$1$1$1
                                r5.<init>(r3, r1, r2)
                                androidx.lifecycle.LiveData r1 = r2.o()
                                r3 = 1619300277(0x60848fb5, float:7.641642E19)
                                r13.C(r3)
                                if (r1 != 0) goto L5e
                                r1 = 0
                                goto L64
                            L5e:
                                r3 = 8
                                j0.n1 r1 = androidx.compose.runtime.livedata.LiveDataAdapterKt.a(r1, r13, r3)
                            L64:
                                r21.S()
                                java.lang.String r3 = ""
                                if (r1 == 0) goto L76
                                java.lang.Object r1 = r1.getValue()
                                java.lang.String r1 = (java.lang.String) r1
                                if (r1 != 0) goto L74
                                goto L76
                            L74:
                                r6 = r1
                                goto L77
                            L76:
                                r6 = r3
                            L77:
                                java.lang.String r7 = r2.M()
                                com.forsale.app.datalayer.network.responses.ListingItemBrief r1 = r2.m()
                                java.lang.String r1 = r1.getDescription()
                                if (r1 != 0) goto L87
                                r8 = r3
                                goto L88
                            L87:
                                r8 = r1
                            L88:
                                java.lang.String r9 = r2.G()
                                hk.a$a r10 = r2.y()
                                r11 = 0
                                hk.a r12 = r2.N()
                                r14 = 0
                                r15 = 0
                                r16 = 0
                                int r1 = hk.a.C0648a.f57518c
                                int r1 = r1 << 18
                                int r2 = hk.a.f57516b
                                int r2 = r2 << 24
                                r17 = r1 | r2
                                r18 = 0
                                r19 = 3712(0xe80, float:5.202E-42)
                                r1 = r4
                                r2 = r5
                                r3 = r6
                                r4 = r7
                                r5 = r8
                                r6 = r9
                                r7 = r10
                                r8 = r11
                                r9 = r12
                                r10 = r14
                                r11 = r15
                                r12 = r16
                                r13 = r21
                                r14 = r17
                                r15 = r18
                                r16 = r19
                                com.forsale.ui.components.cards.CardsKt.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                                boolean r1 = androidx.compose.runtime.c.I()
                                if (r1 == 0) goto Lc8
                                androidx.compose.runtime.c.T()
                            Lc8:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.fullScreenNoImage.FullScreenNoImageComposeItem$ViewHolder$bindView$1$1.AnonymousClass1.b(androidx.compose.runtime.a, int):void");
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
        public void e(FullScreenNoImageComposeItem item) {
            o.i(item, "item");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenNoImageComposeItem(yc.b viewModel, s lo2) {
        super(viewModel, lo2);
        o.i(viewModel, "viewModel");
        o.i(lo2, "lo");
        this.f30715h = viewModel;
        this.f30716i = lo2;
        this.f30717j = t0.f70228i3;
    }

    @Override // pr.a
    public int t() {
        return this.f30717j;
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
