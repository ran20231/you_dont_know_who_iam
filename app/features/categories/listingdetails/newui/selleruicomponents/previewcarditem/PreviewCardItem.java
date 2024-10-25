package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem;

import aa.uk;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerItemIDBottomSheet;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: PreviewCardItem.kt */
/* loaded from: classes2.dex */
public final class PreviewCardItem extends a<PreviewCardViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final PreviewCardItemViewModel f27858f;

    /* renamed from: g  reason: collision with root package name */
    private final s f27859g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f27860h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27861i;

    /* renamed from: j  reason: collision with root package name */
    private final int f27862j;

    /* compiled from: PreviewCardItem.kt */
    /* loaded from: classes2.dex */
    public static final class PreviewCardViewHolder extends b.c<PreviewCardItem> {

        /* renamed from: a  reason: collision with root package name */
        private final uk f27863a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PreviewCardViewHolder(aa.uk r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27863a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem.PreviewCardViewHolder.<init>(aa.uk):void");
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(final PreviewCardItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            uk ukVar = this.f27863a;
            ukVar.U(item.w());
            ukVar.h0(item.x());
            item.x().t().h(item.w(), new FlowCollector<String>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder$bindView$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(String str, zz.a<? super p> aVar) {
                    if (str != null) {
                        SellerItemIDBottomSheet.a aVar2 = SellerItemIDBottomSheet.C;
                        FragmentManager v11 = PreviewCardItem.this.v();
                        final PreviewCardItem.PreviewCardViewHolder previewCardViewHolder = this;
                        aVar2.a(str, v11, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: INVOKE  
                              (r5v1 'aVar2' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerItemIDBottomSheet$a)
                              (r4v0 'str' java.lang.String)
                              (r0v1 'v11' androidx.fragment.app.FragmentManager)
                              (wrap: g00.l<java.lang.Boolean, wz.p> : 0x000e: CONSTRUCTOR  (r1v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                              (r2v0 'previewCardViewHolder' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder A[DONT_INLINE])
                             call: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder$bindView$1$1$emit$2.<init>(com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder):void type: CONSTRUCTOR)
                             type: VIRTUAL call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerItemIDBottomSheet.a.a(java.lang.String, androidx.fragment.app.FragmentManager, g00.l):void in method: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder$bindView$1$1.a(java.lang.String, zz.a<? super wz.p>):java.lang.Object, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder$bindView$1$1$emit$2, state: NOT_LOADED
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
                            	... 21 more
                            */
                        /*
                            this = this;
                            if (r4 == 0) goto L14
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerItemIDBottomSheet$a r5 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerItemIDBottomSheet.C
                            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem r0 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem.this
                            androidx.fragment.app.FragmentManager r0 = r0.v()
                            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder$bindView$1$1$emit$2 r1 = new com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder$bindView$1$1$emit$2
                            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder r2 = r2
                            r1.<init>(r2)
                            r5.a(r4, r0, r1)
                        L14:
                            wz.p r4 = wz.p.f75480a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem$PreviewCardViewHolder$bindView$1$1.emit(java.lang.String, zz.a):java.lang.Object");
                    }
                });
            }

            @Override // kr.b.c
            /* renamed from: h */
            public void e(PreviewCardItem item) {
                o.i(item, "item");
            }
        }

        public PreviewCardItem(PreviewCardItemViewModel previewViewModel, s lifeCycle, FragmentManager fragmentManager) {
            o.i(previewViewModel, "previewViewModel");
            o.i(lifeCycle, "lifeCycle");
            o.i(fragmentManager, "fragmentManager");
            this.f27858f = previewViewModel;
            this.f27859g = lifeCycle;
            this.f27860h = fragmentManager;
            this.f27861i = t0.V4;
            this.f27862j = r0.E7;
        }

        @Override // kr.m
        public int getType() {
            return this.f27862j;
        }

        @Override // pr.a
        public int t() {
            return this.f27861i;
        }

        public final FragmentManager v() {
            return this.f27860h;
        }

        public final s w() {
            return this.f27859g;
        }

        public final PreviewCardItemViewModel x() {
            return this.f27858f;
        }

        @Override // pr.a
        /* renamed from: y */
        public PreviewCardViewHolder u(View v11) {
            o.i(v11, "v");
            uk f02 = uk.f0(v11);
            o.h(f02, "bind(...)");
            return new PreviewCardViewHolder(f02);
        }
    }
