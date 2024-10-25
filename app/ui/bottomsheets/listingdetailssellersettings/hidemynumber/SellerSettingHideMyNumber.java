package com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber;

import aa.am;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: SellerSettingHideMyNumber.kt */
/* loaded from: classes3.dex */
public final class SellerSettingHideMyNumber extends a<HideMyNumberSellerViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final bh.a f38895f;

    /* renamed from: g  reason: collision with root package name */
    private final s f38896g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f38897h;

    /* renamed from: i  reason: collision with root package name */
    private final l<Boolean, p> f38898i;

    /* renamed from: j  reason: collision with root package name */
    private final int f38899j;

    /* renamed from: k  reason: collision with root package name */
    private final int f38900k;

    /* compiled from: SellerSettingHideMyNumber.kt */
    /* loaded from: classes3.dex */
    public static final class HideMyNumberSellerViewHolder extends b.c<SellerSettingHideMyNumber> {

        /* renamed from: a  reason: collision with root package name */
        private final am f38901a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public HideMyNumberSellerViewHolder(aa.am r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38901a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber.HideMyNumberSellerViewHolder.<init>(aa.am):void");
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(final SellerSettingHideMyNumber item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            am amVar = this.f38901a;
            amVar.U(item.w());
            amVar.h0(item.z());
            item.z().j().h(item.w(), new FlowCollector<p>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber$HideMyNumberSellerViewHolder$bindView$2
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(p pVar, zz.a<? super p> aVar) {
                    SellerActionBottomSheet.a aVar2 = SellerActionBottomSheet.K;
                    SellerActionType sellerActionType = SellerActionType.HIDE_MY_NUMBER;
                    ListingItemDetails h11 = SellerSettingHideMyNumber.this.z().h();
                    FragmentManager v11 = SellerSettingHideMyNumber.this.v();
                    final SellerSettingHideMyNumber sellerSettingHideMyNumber = SellerSettingHideMyNumber.this;
                    SellerActionBottomSheet.a.b(aVar2, sellerActionType, h11, null, v11, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: INVOKE  
                          (r0v0 'aVar2' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$a)
                          (r1v0 'sellerActionType' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType)
                          (r2v0 'h11' com.forsale.app.datalayer.network.responses.ListingItemDetails)
                          (null com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition)
                          (r4v0 'v11' androidx.fragment.app.FragmentManager)
                          (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0019: CONSTRUCTOR  (r5v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                          (r9v4 'sellerSettingHideMyNumber' com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber A[DONT_INLINE])
                         call: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber$HideMyNumberSellerViewHolder$bindView$2$emit$2.<init>(com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber):void type: CONSTRUCTOR)
                          (4 int)
                          (null java.lang.Object)
                         type: STATIC call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet.a.b(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$a, com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, com.forsale.app.datalayer.network.responses.ListingItemDetails, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, androidx.fragment.app.FragmentManager, g00.l, int, java.lang.Object):void in method: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber$HideMyNumberSellerViewHolder$bindView$2.a(wz.p, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber$HideMyNumberSellerViewHolder$bindView$2$emit$2, state: NOT_LOADED
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
                        com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$a r0 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet.K
                        com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r1 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.HIDE_MY_NUMBER
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber r9 = com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber.this
                        bh.a r9 = r9.z()
                        com.forsale.app.datalayer.network.responses.ListingItemDetails r2 = r9.h()
                        r3 = 0
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber r9 = com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber.this
                        androidx.fragment.app.FragmentManager r4 = r9.v()
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber$HideMyNumberSellerViewHolder$bindView$2$emit$2 r5 = new com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber$HideMyNumberSellerViewHolder$bindView$2$emit$2
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber r9 = com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber.this
                        r5.<init>(r9)
                        r6 = 4
                        r7 = 0
                        com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet.a.b(r0, r1, r2, r3, r4, r5, r6, r7)
                        wz.p r9 = wz.p.f75480a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.hidemynumber.SellerSettingHideMyNumber$HideMyNumberSellerViewHolder$bindView$2.emit(wz.p, zz.a):java.lang.Object");
                }
            });
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(SellerSettingHideMyNumber item) {
            o.i(item, "item");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SellerSettingHideMyNumber(bh.a viewModel, s lifecycleOwner, FragmentManager fragmentManager, l<? super Boolean, p> onActionDone) {
        o.i(viewModel, "viewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        o.i(fragmentManager, "fragmentManager");
        o.i(onActionDone, "onActionDone");
        this.f38895f = viewModel;
        this.f38896g = lifecycleOwner;
        this.f38897h = fragmentManager;
        this.f38898i = onActionDone;
        this.f38899j = t0.f70251l5;
        this.f38900k = r0.P7;
    }

    @Override // kr.m
    public int getType() {
        return this.f38900k;
    }

    @Override // pr.a
    public int t() {
        return this.f38899j;
    }

    public final FragmentManager v() {
        return this.f38897h;
    }

    public final s w() {
        return this.f38896g;
    }

    public final l<Boolean, p> x() {
        return this.f38898i;
    }

    @Override // pr.a
    /* renamed from: y */
    public HideMyNumberSellerViewHolder u(View v11) {
        o.i(v11, "v");
        am f02 = am.f0(v11);
        o.h(f02, "bind(...)");
        return new HideMyNumberSellerViewHolder(f02);
    }

    public final bh.a z() {
        return this.f38895f;
    }
}
